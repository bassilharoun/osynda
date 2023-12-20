package com.osynda.app.modules.onbopading.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityOnbopadingBinding
import com.osynda.app.modules.login.ui.LoginActivity
import com.osynda.app.modules.onbopading.`data`.viewmodel.OnbopadingVM
import com.osynda.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class OnbopadingActivity : BaseActivity<ActivityOnbopadingBinding>(R.layout.activity_onbopading) {
  private val viewModel: OnbopadingVM by viewModels<OnbopadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onbopadingVM = viewModel
    binding.linearColumngetstarted.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.loginTxtBtn.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)

    }

//    Handler(Looper.getMainLooper()).postDelayed( {
//      val destIntent = SignUpActivity.getIntent(this, null)
//      startActivity(destIntent)
//      finish()
//      }, 3000)
    }



    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "ONBOPADING_ACTIVITY"

    }
  }
