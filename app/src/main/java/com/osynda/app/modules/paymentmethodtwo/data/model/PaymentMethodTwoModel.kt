package com.osynda.app.modules.paymentmethodtwo.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectpayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardVisaMas: String? = MyApp.getInstance().resources.getString(R.string.msg_card_visa_mas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmericanExpres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_american_expres)

)
