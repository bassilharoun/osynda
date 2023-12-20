package com.osynda.app.modules.paymentmethodthree.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVisaMasterCa: String? = MyApp.getInstance().resources.getString(R.string.msg_visa_masterca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholdernam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_holder_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpireDateMM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_expire_date_mm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCVVCVC: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv_cvc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame427Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame428Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame563Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame564Value: String? = null
)
