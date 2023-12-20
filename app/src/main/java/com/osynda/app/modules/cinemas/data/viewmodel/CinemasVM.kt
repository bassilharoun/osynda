package com.osynda.app.modules.cinemas.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.cinemas.`data`.model.CinemasModel
import com.osynda.app.modules.cinemas.`data`.model.CinemasRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CinemasVM : ViewModel(), KoinComponent {
  val cinemasModel: MutableLiveData<CinemasModel> = MutableLiveData(CinemasModel())

  var navArguments: Bundle? = null

  val cinemasList: MutableLiveData<MutableList<CinemasRowModel>> = MutableLiveData(mutableListOf())
}
