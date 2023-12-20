package com.osynda.app.modules.customerhomeopagecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.customerhomeopagecontainer.`data`.model.CustomerHomeOpageContainerModel
import org.koin.core.KoinComponent

class CustomerHomeOpageContainerVM : ViewModel(), KoinComponent {
  val customerHomeOpageContainerModel: MutableLiveData<CustomerHomeOpageContainerModel> =
      MutableLiveData(CustomerHomeOpageContainerModel())

  var navArguments: Bundle? = null
}
