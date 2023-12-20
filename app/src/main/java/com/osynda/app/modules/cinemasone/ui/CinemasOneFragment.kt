package com.osynda.app.modules.cinemasone.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseFragment
import com.osynda.app.databinding.FragmentCinemasOneBinding
import com.osynda.app.modules.cinemasone.`data`.model.CinemasOneRowModel
import com.osynda.app.modules.cinemasone.`data`.model.SpinnerFrame385Model
import com.osynda.app.modules.cinemasone.`data`.model.SpinnerFrame393Model
import com.osynda.app.modules.cinemasone.`data`.model.SpinnerFrame394Model
import com.osynda.app.modules.cinemasone.`data`.viewmodel.CinemasOneVM
import com.osynda.app.modules.eventdetialsone.ui.EventDetialsOneActivity
import com.osynda.app.modules.login.ui.LoginActivity
import com.osynda.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CinemasOneFragment : BaseFragment<FragmentCinemasOneBinding>(R.layout.fragment_cinemas_one) {
  private val viewModel: CinemasOneVM by viewModels<CinemasOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments

    viewModel.spinnerFrame385List.value = mutableListOf(
    SpinnerFrame385Model("Item1"),
    SpinnerFrame385Model("Item2"),
    SpinnerFrame385Model("Item3"),
    SpinnerFrame385Model("Item4"),
    SpinnerFrame385Model("Item5")
    )
    val spinnerFrame385Adapter =
    SpinnerFrame385Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFrame385List.value?:
    mutableListOf())
    binding.spinnerFrame385.adapter = spinnerFrame385Adapter
    viewModel.spinnerFrame393List.value = mutableListOf(
    SpinnerFrame393Model("Item1"),
    SpinnerFrame393Model("Item2"),
    SpinnerFrame393Model("Item3"),
    SpinnerFrame393Model("Item4"),
    SpinnerFrame393Model("Item5")
    )
    val spinnerFrame393Adapter =
    SpinnerFrame393Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFrame393List.value?:
    mutableListOf())
    binding.spinnerFrame393.adapter = spinnerFrame393Adapter
    viewModel.spinnerFrame394List.value = mutableListOf(
    SpinnerFrame394Model("Item1"),
    SpinnerFrame394Model("Item2"),
    SpinnerFrame394Model("Item3"),
    SpinnerFrame394Model("Item4"),
    SpinnerFrame394Model("Item5")
    )
    val spinnerFrame394Adapter =
    SpinnerFrame394Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFrame394List.value?:
    mutableListOf())
    binding.spinnerFrame394.adapter = spinnerFrame394Adapter
    val cinemasOneAdapter = CinemasOneAdapter(viewModel.cinemasOneList.value?:mutableListOf())
    binding.recyclerCinemasOne.adapter = cinemasOneAdapter
    cinemasOneAdapter.setOnItemClickListener(
    object : CinemasOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CinemasOneRowModel) {
        onClickRecyclerCinemasOne(view, position, item)
        val destIntent = EventDetialsOneActivity.getIntent(requireContext(), null)
      startActivity(destIntent)



      }
    }
    )
    viewModel.cinemasOneList.observe(requireActivity()) {
      cinemasOneAdapter.updateData(it)
    }
    binding.cinemasOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.recyclerCinemasOne.setOnClickListener {


    }



  }

  fun onClickRecyclerCinemasOne(
    view: View,
    position: Int,
    item: CinemasOneRowModel
  ): Unit {
    when(view.id) {

    }
  }

  companion object {
    const val TAG: String = "CINEMAS_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): CinemasOneFragment {
      val fragment = CinemasOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
