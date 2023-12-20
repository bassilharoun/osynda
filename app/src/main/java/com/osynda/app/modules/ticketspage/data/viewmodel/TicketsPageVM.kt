package com.osynda.app.modules.ticketspage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.ticketspage.`data`.model.TicketsPageModel
import org.koin.core.KoinComponent

class TicketsPageVM : ViewModel(), KoinComponent {
  val ticketsPageModel: MutableLiveData<TicketsPageModel> = MutableLiveData(TicketsPageModel())

  var navArguments: Bundle? = null
}
