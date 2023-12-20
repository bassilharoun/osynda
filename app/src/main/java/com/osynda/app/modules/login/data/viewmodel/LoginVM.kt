package com.osynda.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.osynda.app.modules.login.`data`.model.LoginModel
import com.osynda.app.modules.login.`data`.model.LoginRowModel
import kotlin.collections.MutableList
import org.json.JSONObject
import org.koin.core.KoinComponent

class LoginVM : ViewModel(), KoinComponent {
  val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())


  var navArguments: Bundle? = null


  val loginList: MutableLiveData<MutableList<LoginRowModel>> = MutableLiveData(mutableListOf())


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
