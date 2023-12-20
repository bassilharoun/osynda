package com.osynda.app.modules.ticketspage.ui

import androidx.activity.viewModels
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityTicketsPageBinding
import com.osynda.app.modules.ticketspage.`data`.viewmodel.TicketsPageVM
import kotlin.String
import kotlin.Unit

class TicketsPageActivity : BaseActivity<ActivityTicketsPageBinding>(R.layout.activity_tickets_page)
    {
  private val viewModel: TicketsPageVM by viewModels<TicketsPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ticketsPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TICKETS_PAGE_ACTIVITY"

  }
}
