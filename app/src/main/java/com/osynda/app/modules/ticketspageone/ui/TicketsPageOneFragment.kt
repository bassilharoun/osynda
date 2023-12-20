package com.osynda.app.modules.ticketspageone.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseFragment
import com.osynda.app.databinding.FragmentTicketsPageOneBinding
import com.osynda.app.modules.ticketspageone.`data`.model.ListrectangleseventysixRowModel
import com.osynda.app.modules.ticketspageone.`data`.viewmodel.TicketsPageOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TicketsPageOneFragment :
    BaseFragment<FragmentTicketsPageOneBinding>(R.layout.fragment_tickets_page_one) {
  private val viewModel: TicketsPageOneVM by viewModels<TicketsPageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectangleseventysixAdapter =
    ListrectangleseventysixAdapter(viewModel.listrectangleseventysixList.value?:mutableListOf())
    binding.recyclerListrectangleseventysix.adapter = listrectangleseventysixAdapter
    listrectangleseventysixAdapter.setOnItemClickListener(
    object : ListrectangleseventysixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangleseventysixRowModel) {
        onClickRecyclerListrectangleseventysix(view, position, item)
      }
    }
    )
    viewModel.listrectangleseventysixList.observe(requireActivity()) {
      listrectangleseventysixAdapter.updateData(it)
    }
    binding.ticketsPageOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangleseventysix(
    view: View,
    position: Int,
    item: ListrectangleseventysixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TICKETS_PAGE_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): TicketsPageOneFragment {
      val fragment = TicketsPageOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
