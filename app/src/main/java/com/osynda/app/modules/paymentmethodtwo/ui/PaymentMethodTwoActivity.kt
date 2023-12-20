package com.osynda.app.modules.paymentmethodtwo.ui

import android.view.View
import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityPaymentMethodTwoBinding
import com.osynda.app.modules.paymentmethodtwo.`data`.model.ListellipsetwentyRowModel
import com.osynda.app.modules.paymentmethodtwo.`data`.viewmodel.PaymentMethodTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaymentMethodTwoActivity :
    BaseActivity<ActivityPaymentMethodTwoBinding>(R.layout.activity_payment_method_two) {
  private val viewModel: PaymentMethodTwoVM by viewModels<PaymentMethodTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsetwentyAdapter =
    ListellipsetwentyAdapter(viewModel.listellipsetwentyList.value?:mutableListOf())
    binding.recyclerListellipsetwenty.adapter = listellipsetwentyAdapter
    listellipsetwentyAdapter.setOnItemClickListener(
    object : ListellipsetwentyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsetwentyRowModel) {
        onClickRecyclerListellipsetwenty(view, position, item)
      }
    }
    )
    viewModel.listellipsetwentyList.observe(this) {
      listellipsetwentyAdapter.updateData(it)
    }
    binding.paymentMethodTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsetwenty(
    view: View,
    position: Int,
    item: ListellipsetwentyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_METHOD_TWO_ACTIVITY"

  }
}
