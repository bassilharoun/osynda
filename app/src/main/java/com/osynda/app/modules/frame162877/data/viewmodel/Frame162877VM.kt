package com.osynda.app.modules.frame162877.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osynda.app.modules.frame162877.`data`.model.Frame162877Model
import org.koin.core.KoinComponent

class Frame162877VM : ViewModel(), KoinComponent {
  val frame162877Model: MutableLiveData<Frame162877Model> = MutableLiveData(Frame162877Model())

  var navArguments: Bundle? = null
}
