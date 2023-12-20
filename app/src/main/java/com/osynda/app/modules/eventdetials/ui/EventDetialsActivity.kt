package com.osynda.app.modules.eventdetials.ui

import android.view.View
import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityEventDetialsBinding
import com.osynda.app.modules.eventdetials.`data`.model.EventDetialsRowModel
import com.osynda.app.modules.eventdetials.`data`.model.SpinnerFrame470Model
import com.osynda.app.modules.eventdetials.`data`.viewmodel.EventDetialsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventDetialsActivity :
    BaseActivity<ActivityEventDetialsBinding>(R.layout.activity_event_detials) {
  private val viewModel: EventDetialsVM by viewModels<EventDetialsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame470List.value = mutableListOf(
    SpinnerFrame470Model("Item1"),
    SpinnerFrame470Model("Item2"),
    SpinnerFrame470Model("Item3"),
    SpinnerFrame470Model("Item4"),
    SpinnerFrame470Model("Item5")
    )
    val spinnerFrame470Adapter =
    SpinnerFrame470Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame470List.value?:
    mutableListOf())
    binding.spinnerFrame470.adapter = spinnerFrame470Adapter
    val eventDetialsAdapter =
    EventDetialsAdapter(viewModel.eventDetialsList.value?:mutableListOf())
    binding.recyclerEventDetials.adapter = eventDetialsAdapter
    eventDetialsAdapter.setOnItemClickListener(
    object : EventDetialsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EventDetialsRowModel) {
        onClickRecyclerEventDetials(view, position, item)
      }
    }
    )
    viewModel.eventDetialsList.observe(this) {
      eventDetialsAdapter.updateData(it)
    }
    binding.eventDetialsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerEventDetials(
    view: View,
    position: Int,
    item: EventDetialsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EVENT_DETIALS_ACTIVITY"

  }
}
