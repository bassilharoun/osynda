package com.osynda.app.modules.eventdetialsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.eventdetialsone.`data`.model.EventDetialsOneModel
import com.osynda.app.modules.eventdetialsone.`data`.model.ListrectangleeightytwoOneRowModel
import com.osynda.app.modules.eventdetialsone.`data`.model.ListrectangleeightytwoThreeRowModel
import com.osynda.app.modules.eventdetialsone.`data`.model.SpinnerFrame470Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventDetialsOneVM : ViewModel(), KoinComponent {
  val eventDetialsOneModel: MutableLiveData<EventDetialsOneModel> =
      MutableLiveData(EventDetialsOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame470List: MutableLiveData<MutableList<SpinnerFrame470Model>> = MutableLiveData()

  val listrectangleeightytwoOneList: MutableLiveData<MutableList<ListrectangleeightytwoOneRowModel>>
      = MutableLiveData(mutableListOf())

  val listrectangleeightytwoThreeList:
      MutableLiveData<MutableList<ListrectangleeightytwoThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
