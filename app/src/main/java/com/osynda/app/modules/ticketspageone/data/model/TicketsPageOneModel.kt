package com.osynda.app.modules.ticketspageone.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class TicketsPageOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEventTickets: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_tickets)

)
