package com.osynda.app.modules.cinemasone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.cinemasone.`data`.model.CinemasOneModel
import com.osynda.app.modules.cinemasone.`data`.model.CinemasOneRowModel
import com.osynda.app.modules.cinemasone.`data`.model.SpinnerFrame385Model
import com.osynda.app.modules.cinemasone.`data`.model.SpinnerFrame393Model
import com.osynda.app.modules.cinemasone.`data`.model.SpinnerFrame394Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CinemasOneVM : ViewModel(), KoinComponent {
  val cinemasOneModel: MutableLiveData<CinemasOneModel> = MutableLiveData(CinemasOneModel())

  var navArguments: Bundle? = null

  val spinnerFrame385List: MutableLiveData<MutableList<SpinnerFrame385Model>> = MutableLiveData()

  val spinnerFrame393List: MutableLiveData<MutableList<SpinnerFrame393Model>> = MutableLiveData()

  val spinnerFrame394List: MutableLiveData<MutableList<SpinnerFrame394Model>> = MutableLiveData()

  val cinemasOneList: MutableLiveData<MutableList<CinemasOneRowModel>> =
      MutableLiveData(mutableListOf())
}
