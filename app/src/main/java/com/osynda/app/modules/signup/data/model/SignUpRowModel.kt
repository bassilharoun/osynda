package com.osynda.app.modules.signup.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSamimohamedal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sami_mohamed_al)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullName: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)

)
