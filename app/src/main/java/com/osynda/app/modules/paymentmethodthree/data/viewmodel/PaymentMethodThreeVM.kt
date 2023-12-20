package com.osynda.app.modules.paymentmethodthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.paymentmethodthree.`data`.model.PaymentMethodThreeModel
import org.koin.core.KoinComponent

class PaymentMethodThreeVM : ViewModel(), KoinComponent {
  val paymentMethodThreeModel: MutableLiveData<PaymentMethodThreeModel> =
      MutableLiveData(PaymentMethodThreeModel())

  var navArguments: Bundle? = null
}
