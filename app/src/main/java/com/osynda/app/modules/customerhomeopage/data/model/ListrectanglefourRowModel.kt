package com.osynda.app.modules.customerhomeopage.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglefourRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt16Jan: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_jan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElectronicEnte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_electronic_ente)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame355: String? = MyApp.getInstance().resources.getString(R.string.lbl_gaming)
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

)
