package com.osynda.app.modules.cinemas.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class CinemasModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt23Feb: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt23FebOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame365Value: String? = null
)
