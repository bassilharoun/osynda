package com.osynda.app.modules.eventdetials.`data`.model

import com.osynda.app.R
import com.osynda.app.appcomponents.di.MyApp
import kotlin.String

data class EventDetialsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJanePerry: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_perry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRogueAmendiare: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rogue_amendiare)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeanuReeves: String? = MyApp.getInstance().resources.getString(R.string.lbl_keanu_reeves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnnySilverha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_johnny_silverha)

)
