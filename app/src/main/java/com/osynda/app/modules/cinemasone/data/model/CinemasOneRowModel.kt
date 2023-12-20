package com.osynda.app.modules.cinemasone.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class CinemasOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame355: String? = MyApp.getInstance().resources.getString(R.string.lbl_gaming3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_cyberpunk_2077)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNasrcitycairo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nasr_city_cairo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOctober14202: String? =
      MyApp.getInstance().resources.getString(R.string.msg_october_14_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.msg_get_discount_34)

)
