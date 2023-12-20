package com.osynda.app.modules.cinemas.ui

import android.view.View
import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityCinemasBinding
import com.osynda.app.modules.cinemas.`data`.model.CinemasRowModel
import com.osynda.app.modules.cinemas.`data`.viewmodel.CinemasVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CinemasActivity : BaseActivity<ActivityCinemasBinding>(R.layout.activity_cinemas) {
  private val viewModel: CinemasVM by viewModels<CinemasVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cinemasAdapter = CinemasAdapter(viewModel.cinemasList.value?:mutableListOf())
    binding.recyclerCinemas.adapter = cinemasAdapter
    cinemasAdapter.setOnItemClickListener(
    object : CinemasAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CinemasRowModel) {
        onClickRecyclerCinemas(view, position, item)
      }
    }
    )
    viewModel.cinemasList.observe(this) {
      cinemasAdapter.updateData(it)
    }
    binding.cinemasVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCinemas(
    view: View,
    position: Int,
    item: CinemasRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CINEMAS_ACTIVITY"

  }
}
