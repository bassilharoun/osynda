package com.osynda.app.modules.customerhomeopage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseFragment
import com.osynda.app.databinding.FragmentCustomerHomeOpageBinding
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglefourRowModel
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglethirteenRowModel
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglethirteenTwoRowModel
import com.osynda.app.modules.customerhomeopage.`data`.model.SpinnerCountryModel
import com.osynda.app.modules.customerhomeopage.`data`.viewmodel.CustomerHomeOpageVM
import com.osynda.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CustomerHomeOpageFragment :
    BaseFragment<FragmentCustomerHomeOpageBinding>(R.layout.fragment_customer_home_opage) {
  private val viewModel: CustomerHomeOpageVM by viewModels<CustomerHomeOpageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerCountryList.value = mutableListOf(
    SpinnerCountryModel("Item1"),
    SpinnerCountryModel("Item2"),
    SpinnerCountryModel("Item3"),
    SpinnerCountryModel("Item4"),
    SpinnerCountryModel("Item5")
    )
    val spinnerCountryAdapter =
    SpinnerCountryAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerCountryList.value?:
    mutableListOf())
    binding.spinnerCountry.adapter = spinnerCountryAdapter
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglefourRowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(requireActivity()) {
      listrectanglefourAdapter.updateData(it)
    }
    val listrectanglethirteenAdapter =
    ListrectanglethirteenAdapter(viewModel.listrectanglethirteenList.value?:mutableListOf())
    binding.recyclerListrectanglethirteen.adapter = listrectanglethirteenAdapter
//    binding.recyclerListrectanglefour.setOnClickListener {
//      val destIntent = SignUpActivity.getIntent(requireContext(), null)
//      startActivity(destIntent)
//
//    }
    listrectanglethirteenAdapter.setOnItemClickListener(
    object : ListrectanglethirteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglethirteenRowModel) {
        onClickRecyclerListrectanglethirteen(view, position, item)
      }
    }
    )
    viewModel.listrectanglethirteenList.observe(requireActivity()) {
      listrectanglethirteenAdapter.updateData(it)
    }
    val listrectanglethirteenTwoAdapter =
    ListrectanglethirteenTwoAdapter(viewModel.listrectanglethirteenTwoList.value?:mutableListOf())
//    binding.recyclerListrectanglethirteenTwo.adapter = listrectanglethirteenTwoAdapter
    listrectanglethirteenTwoAdapter.setOnItemClickListener(
    object : ListrectanglethirteenTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglethirteenTwoRowModel) {
        onClickRecyclerListrectanglethirteenTwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglethirteenTwoList.observe(requireActivity()) {
      listrectanglethirteenTwoAdapter.updateData(it)
    }
//    binding.customerHomeOpageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: ListrectanglefourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglethirteen(
    view: View,
    position: Int,
    item: ListrectanglethirteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglethirteenTwo(
    view: View,
    position: Int,
    item: ListrectanglethirteenTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CUSTOMER_HOME_OPAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): CustomerHomeOpageFragment {
      val fragment = CustomerHomeOpageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
