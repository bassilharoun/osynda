package com.osynda.app.modules.eventdetialsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityEventDetialsOneBinding
import com.osynda.app.modules.cinemasone.ui.CinemasOneFragment
import com.osynda.app.modules.eventdetialsone.`data`.model.ListrectangleeightytwoOneRowModel
import com.osynda.app.modules.eventdetialsone.`data`.model.ListrectangleeightytwoThreeRowModel
import com.osynda.app.modules.eventdetialsone.`data`.model.SpinnerFrame470Model
import com.osynda.app.modules.eventdetialsone.`data`.viewmodel.EventDetialsOneVM
import com.osynda.app.modules.login.ui.LoginActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventDetialsOneActivity :
    BaseActivity<ActivityEventDetialsOneBinding>(R.layout.activity_event_detials_one) {
  private val viewModel: EventDetialsOneVM by viewModels<EventDetialsOneVM>()

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
    val listrectangleeightytwoOneAdapter =
    ListrectangleeightytwoOneAdapter(viewModel.listrectangleeightytwoOneList.value?:mutableListOf())
    binding.recyclerListrectangleeightytwoOne.adapter = listrectangleeightytwoOneAdapter
    listrectangleeightytwoOneAdapter.setOnItemClickListener(
    object : ListrectangleeightytwoOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangleeightytwoOneRowModel) {
        onClickRecyclerListrectangleeightytwoOne(view, position, item)
      }
    }
    )
    viewModel.listrectangleeightytwoOneList.observe(this) {
      listrectangleeightytwoOneAdapter.updateData(it)
    }
    val listrectangleeightytwoThreeAdapter =
    ListrectangleeightytwoThreeAdapter(viewModel.listrectangleeightytwoThreeList.value?:mutableListOf())
    binding.recyclerListrectangleeightytwoThree.adapter = listrectangleeightytwoThreeAdapter
    listrectangleeightytwoThreeAdapter.setOnItemClickListener(
    object : ListrectangleeightytwoThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangleeightytwoThreeRowModel) {
        onClickRecyclerListrectangleeightytwoThree(view, position, item)
      }
    }
    )
    viewModel.listrectangleeightytwoThreeList.observe(this) {
      listrectangleeightytwoThreeAdapter.updateData(it)
    }
    binding.eventDetialsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangleeightytwoOne(
    view: View,
    position: Int,
    item: ListrectangleeightytwoOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangleeightytwoThree(
    view: View,
    position: Int,
    item: ListrectangleeightytwoThreeRowModel
  ): Unit {
    when(view.id) {

    }
  }

  companion object {
    const val TAG: String = "EVENT_DETIALS_ONE_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventDetialsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

  }
}
