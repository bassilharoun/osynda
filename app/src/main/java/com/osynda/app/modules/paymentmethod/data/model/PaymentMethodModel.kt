package com.osynda.app.modules.paymentmethod.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYouaresuccess: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_we_are_waiting)

)
