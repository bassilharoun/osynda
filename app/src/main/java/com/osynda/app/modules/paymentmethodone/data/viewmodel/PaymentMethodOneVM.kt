package com.osynda.app.modules.paymentmethodone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.paymentmethodone.`data`.model.ListticketcounterRowModel
import com.osynda.app.modules.paymentmethodone.`data`.model.PaymentMethodOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentMethodOneVM : ViewModel(), KoinComponent {
  val paymentMethodOneModel: MutableLiveData<PaymentMethodOneModel> =
      MutableLiveData(PaymentMethodOneModel())

  var navArguments: Bundle? = null

  val listticketcounterList: MutableLiveData<MutableList<ListticketcounterRowModel>> =
      MutableLiveData(mutableListOf())
}
