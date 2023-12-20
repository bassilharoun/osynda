package com.osynda.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.appcomponents.facebookauth.FacebookHelper
import com.osynda.app.appcomponents.googleauth.GoogleHelper
import com.osynda.app.databinding.ActivityLoginBinding
import com.osynda.app.modules.login.`data`.model.LoginRowModel
import com.osynda.app.modules.login.`data`.viewmodel.LoginVM
import com.osynda.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val loginAdapter = LoginAdapter(viewModel.loginList.value?:mutableListOf())
    binding.recyclerLogin.adapter = loginAdapter
    loginAdapter.setOnItemClickListener(
    object : LoginAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LoginRowModel) {
        onClickRecyclerLogin(view, position, item)
      }
    }
    )
    viewModel.loginList.observe(this) {
      loginAdapter.updateData(it)
    }
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowfacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.linearRowframe.setOnClickListener {
          googleLogin.login()
        }

      binding.linearColumnarrowleft.setOnClickListener {
        super.onBackPressed()
      }
      binding.signupTxtBtn.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      }



      fun onClickRecyclerLogin(
        view: View,
        position: Int,
        item: LoginRowModel
      ): Unit {
        when(view.id) {
        }
      }

      companion object {
        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, LoginActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
        const val TAG: String = "LOGIN_ACTIVITY"

      }
    }
