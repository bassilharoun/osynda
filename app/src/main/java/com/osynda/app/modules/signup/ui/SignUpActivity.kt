package com.osynda.app.modules.signup.ui

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
import com.osynda.app.databinding.ActivitySignUpBinding
import com.osynda.app.modules.customerhomeopagecontainer.data.viewmodel.CustomerHomeOpageContainerVM
import com.osynda.app.modules.customerhomeopagecontainer.ui.CustomerHomeOpageContainerActivity
import com.osynda.app.modules.login.ui.LoginActivity
import com.osynda.app.modules.signup.`data`.model.SignUpRowModel
import com.osynda.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

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
    val signUpAdapter = SignUpAdapter(viewModel.signUpList.value?:mutableListOf())
    binding.recyclerSignUp.adapter = signUpAdapter
    signUpAdapter.setOnItemClickListener(
    object : SignUpAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUpRowModel) {
        onClickRecyclerSignUp(view, position, item)
      }
    }
    )
    viewModel.signUpList.observe(this) {
      signUpAdapter.updateData(it)
    }
    binding.signUpVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowframe.setOnClickListener {
        googleLogin.login()
      }
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
      binding.btnArrowBack.setOnClickListener {
        super.onBackPressed()
      }
      binding.loginTxtBtn.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnSignup.setOnClickListener {
        val destIntent = CustomerHomeOpageContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      }

      fun onClickRecyclerSignUp(
        view: View,
        position: Int,
        item: SignUpRowModel
      ): Unit {
        when(view.id) {
        }
      }

      companion object {
        const val TAG: String = "SIGN_UP_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignUpActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
