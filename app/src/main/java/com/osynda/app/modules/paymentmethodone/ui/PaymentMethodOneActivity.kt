package com.osynda.app.modules.paymentmethodone.ui

import android.view.View
import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityPaymentMethodOneBinding
import com.osynda.app.modules.paymentmethodone.`data`.model.ListticketcounterRowModel
import com.osynda.app.modules.paymentmethodone.`data`.viewmodel.PaymentMethodOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaymentMethodOneActivity :
    BaseActivity<ActivityPaymentMethodOneBinding>(R.layout.activity_payment_method_one) {
  private val viewModel: PaymentMethodOneVM by viewModels<PaymentMethodOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listticketcounterAdapter =
    ListticketcounterAdapter(viewModel.listticketcounterList.value?:mutableListOf())
    binding.recyclerListticketcounter.adapter = listticketcounterAdapter
    listticketcounterAdapter.setOnItemClickListener(
    object : ListticketcounterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListticketcounterRowModel) {
        onClickRecyclerListticketcounter(view, position, item)
      }
    }
    )
    viewModel.listticketcounterList.observe(this) {
      listticketcounterAdapter.updateData(it)
    }
    binding.paymentMethodOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListticketcounter(
    view: View,
    position: Int,
    item: ListticketcounterRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_METHOD_ONE_ACTIVITY"

  }
}
