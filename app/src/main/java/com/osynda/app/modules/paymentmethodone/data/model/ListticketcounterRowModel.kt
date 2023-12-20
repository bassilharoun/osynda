package com.osynda.app.modules.paymentmethodone.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class ListticketcounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTicketCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_ticket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaxes: String? = MyApp.getInstance().resources.getString(R.string.lbl_taxes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)

)
