package com.osynda.app.modules.login.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
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
  var txtOrLoginWith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
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
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a2)

)
