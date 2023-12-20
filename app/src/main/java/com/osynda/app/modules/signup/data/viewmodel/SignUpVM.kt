package com.osynda.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.osynda.app.modules.signup.`data`.model.SignUpModel
import com.osynda.app.modules.signup.`data`.model.SignUpRowModel
import kotlin.collections.MutableList
import org.json.JSONObject
import org.koin.core.KoinComponent

class SignUpVM : ViewModel(), KoinComponent {
  val signUpModel: MutableLiveData<SignUpModel> = MutableLiveData(SignUpModel())


  var navArguments: Bundle? = null


  val signUpList: MutableLiveData<MutableList<SignUpRowModel>> = MutableLiveData(mutableListOf())


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
