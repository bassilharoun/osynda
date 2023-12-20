package com.osynda.app.modules.eventdetials.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class EventDetialsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCyberpunk2077: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cyberpunk_20772)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCDprojectred: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cd_project_red)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrganizer: String? = MyApp.getInstance().resources.getString(R.string.lbl_organizer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollow: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbouttheevent: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_about_the_event)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_join_us_for_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpeakers: String? = MyApp.getInstance().resources.getString(R.string.lbl_speakers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventschedule: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_event_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10_00_am_10_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTicketsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_tickets)

)
