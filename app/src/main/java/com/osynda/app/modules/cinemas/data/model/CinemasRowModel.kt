package com.osynda.app.modules.cinemas.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class CinemasRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_yayoi_kusama_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame355: String? = MyApp.getInstance().resources.getString(R.string.lbl_art2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_mon_feb_23_at_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_location_nasr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrganizedbyYA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_organized_by_ya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_00)

)
