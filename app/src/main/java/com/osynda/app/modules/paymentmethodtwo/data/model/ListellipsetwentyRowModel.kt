package com.osynda.app.modules.paymentmethodtwo.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsetwentyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApplePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_applepay)

)
