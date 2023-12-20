package com.osynda.app.modules.paymentmethodthree.ui

import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityPaymentMethodThreeBinding
import com.osynda.app.modules.paymentmethodthree.`data`.viewmodel.PaymentMethodThreeVM
import kotlin.String
import kotlin.Unit

class PaymentMethodThreeActivity :
    BaseActivity<ActivityPaymentMethodThreeBinding>(R.layout.activity_payment_method_three) {
  private val viewModel: PaymentMethodThreeVM by viewModels<PaymentMethodThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.paymentMethodThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAYMENT_METHOD_THREE_ACTIVITY"

  }
}
