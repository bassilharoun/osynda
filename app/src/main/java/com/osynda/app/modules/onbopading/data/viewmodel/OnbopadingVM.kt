package com.osynda.app.modules.onbopading.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.onbopading.`data`.model.OnbopadingModel
import org.koin.core.KoinComponent

class OnbopadingVM : ViewModel(), KoinComponent {
  val onbopadingModel: MutableLiveData<OnbopadingModel> = MutableLiveData(OnbopadingModel())

  var navArguments: Bundle? = null
}
