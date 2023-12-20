package com.osynda.app.modules.ticketspage.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class TicketsPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTicketsYayoi: String? = MyApp.getInstance().resources.getString(R.string.msg_tickets_yayoi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYayoiKusamaI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_yayoi_kusama_i3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowthisticke: String? =
      MyApp.getInstance().resources.getString(R.string.msg_show_this_ticke)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChuokuTokyo: String? = MyApp.getInstance().resources.getString(R.string.msg_chuo_ku_tokyo)
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
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuneCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeat: String? = MyApp.getInstance().resources.getString(R.string.lbl_seat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB05: String? = MyApp.getInstance().resources.getString(R.string.lbl_b05)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.lbl_cost)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_231_le)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTicketID: String? = MyApp.getInstance().resources.getString(R.string.lbl_ticket_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSH3232342SSA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sh3_2323_42ssa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt376836189231923: String? =
      MyApp.getInstance().resources.getString(R.string.msg_376836189231923)

)
