package com.osynda.app.modules.customerhomeopage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.customerhomeopage.`data`.model.CustomerHomeOpageModel
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglefourRowModel
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglethirteenRowModel
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglethirteenTwoRowModel
import com.osynda.app.modules.customerhomeopage.`data`.model.SpinnerCountryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CustomerHomeOpageVM : ViewModel(), KoinComponent {
  val customerHomeOpageModel: MutableLiveData<CustomerHomeOpageModel> =
      MutableLiveData(CustomerHomeOpageModel())

  var navArguments: Bundle? = null

  val spinnerCountryList: MutableLiveData<MutableList<SpinnerCountryModel>> = MutableLiveData()

  val listrectanglefourList: MutableLiveData<MutableList<ListrectanglefourRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglethirteenList: MutableLiveData<MutableList<ListrectanglethirteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglethirteenTwoList: MutableLiveData<MutableList<ListrectanglethirteenTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
