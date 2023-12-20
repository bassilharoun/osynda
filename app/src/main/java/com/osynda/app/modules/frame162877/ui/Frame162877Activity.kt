package com.osynda.app.modules.frame162877.ui

import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityFrame162877Binding
import com.osynda.app.modules.frame162877.`data`.viewmodel.Frame162877VM
import kotlin.String
import kotlin.Unit

class Frame162877Activity : BaseActivity<ActivityFrame162877Binding>(R.layout.activity_frame_162877)
    {
  private val viewModel: Frame162877VM by viewModels<Frame162877VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame162877VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME162877ACTIVITY"

  }
}
