package com.osynda.app.modules.ticketspageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.ticketspageone.`data`.model.ListrectangleseventysixRowModel
import com.osynda.app.modules.ticketspageone.`data`.model.TicketsPageOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TicketsPageOneVM : ViewModel(), KoinComponent {
  val ticketsPageOneModel: MutableLiveData<TicketsPageOneModel> =
      MutableLiveData(TicketsPageOneModel())

  var navArguments: Bundle? = null

  val listrectangleseventysixList: MutableLiveData<MutableList<ListrectangleseventysixRowModel>> =
      MutableLiveData(mutableListOf())
}
