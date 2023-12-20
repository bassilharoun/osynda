package com.osynda.app.modules.signup.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscovertheho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_discover_the_ho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrSignupwith: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_or_sign_up_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithGoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_with_goo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithfac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_with_fac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
