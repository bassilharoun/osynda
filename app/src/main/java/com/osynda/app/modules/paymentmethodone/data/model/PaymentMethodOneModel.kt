package com.osynda.app.modules.paymentmethodone.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTicketinformat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ticket_informat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalinfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_personal_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameMariamN: String? = MyApp.getInstance().resources.getString(R.string.msg_name_mariam_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailmariamna: String? =
      MyApp.getInstance().resources.getString(R.string.msg_email_mariamna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt23Feb: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_1_billion_follo)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentmethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumberFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_number_4)

)
