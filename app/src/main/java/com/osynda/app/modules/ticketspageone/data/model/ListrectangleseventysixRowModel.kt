package com.osynda.app.modules.ticketspageone.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectangleseventysixRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt23Feb: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_feb)
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
  var txtOrganizedbywa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_organized_by_wa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTicketIDSHTwentyThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ticket_id_sh23)

)
