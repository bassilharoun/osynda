package com.osynda.app.modules.eventdetials.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.eventdetials.`data`.model.EventDetialsModel
import com.osynda.app.modules.eventdetials.`data`.model.EventDetialsRowModel
import com.osynda.app.modules.eventdetials.`data`.model.SpinnerFrame470Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventDetialsVM : ViewModel(), KoinComponent {
  val eventDetialsModel: MutableLiveData<EventDetialsModel> = MutableLiveData(EventDetialsModel())

  var navArguments: Bundle? = null

  val spinnerFrame470List: MutableLiveData<MutableList<SpinnerFrame470Model>> = MutableLiveData()

  val eventDetialsList: MutableLiveData<MutableList<EventDetialsRowModel>> =
      MutableLiveData(mutableListOf())
}
