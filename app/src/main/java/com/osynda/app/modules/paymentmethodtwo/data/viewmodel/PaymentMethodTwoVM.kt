package com.osynda.app.modules.paymentmethodtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.paymentmethodtwo.`data`.model.ListellipsetwentyRowModel
import com.osynda.app.modules.paymentmethodtwo.`data`.model.PaymentMethodTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentMethodTwoVM : ViewModel(), KoinComponent {
  val paymentMethodTwoModel: MutableLiveData<PaymentMethodTwoModel> =
      MutableLiveData(PaymentMethodTwoModel())

  var navArguments: Bundle? = null

  val listellipsetwentyList: MutableLiveData<MutableList<ListellipsetwentyRowModel>> =
      MutableLiveData(mutableListOf())
}
