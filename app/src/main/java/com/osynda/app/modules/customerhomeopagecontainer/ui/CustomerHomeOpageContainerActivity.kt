package com.osynda.app.modules.customerhomeopagecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.osynda.app.R
import com.osynda.app.appcomponents.base.BaseActivity
import com.osynda.app.databinding.ActivityCustomerHomeOpageContainerBinding
import com.osynda.app.extensions.loadFragment
import com.osynda.app.modules.cinemasone.ui.CinemasOneFragment
import com.osynda.app.modules.customerhomeopage.ui.CustomerHomeOpageFragment
import com.osynda.app.modules.customerhomeopagecontainer.`data`.viewmodel.CustomerHomeOpageContainerVM
import com.osynda.app.modules.profile.ui.ProfileFragment
import com.osynda.app.modules.signup.ui.SignUpActivity
import com.osynda.app.modules.ticketspageone.ui.TicketsPageOneFragment
import kotlin.String
import kotlin.Unit

class CustomerHomeOpageContainerActivity :
    BaseActivity<ActivityCustomerHomeOpageContainerBinding>(R.layout.activity_customer_home_opage_container)
    {
  private val viewModel: CustomerHomeOpageContainerVM by viewModels<CustomerHomeOpageContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.customerHomeOpageContainerVM = viewModel
    val destFragment = CustomerHomeOpageFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = CustomerHomeOpageFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }


  override fun setUpClicks(): Unit {
    binding.linearDicover.setOnClickListener {
        binding.imageHome.setImageResource(R.drawable.img_home_gray_600)
        binding.imageRewind.setImageResource(R.drawable.img_search_deep_purple_a700)
        binding.imageThumbsup.setImageResource(R.drawable.img_thumbsup)
        binding.imageSearchOne.setImageResource(R.drawable.img_search_gray_600)

        binding.txtHomeOne.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.purple_700))
        binding.txtTickets.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
      val destFragment = CinemasOneFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = CinemasOneFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearProfile.setOnClickListener {
        binding.imageHome.setImageResource(R.drawable.img_home_gray_600)
        binding.imageRewind.setImageResource(R.drawable.img_rewind_gray_600)
        binding.imageThumbsup.setImageResource(R.drawable.img_thumbsup)
        binding.imageSearchOne.setImageResource(R.drawable.profile)

        binding.txtHomeOne.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtTickets.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.purple_700))

        val destFragment = ProfileFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ProfileFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearTickets.setOnClickListener {
        binding.imageHome.setImageResource(R.drawable.img_home_gray_600)
        binding.imageRewind.setImageResource(R.drawable.img_rewind_gray_600)
        binding.imageThumbsup.setImageResource(R.drawable.img_television_deep_purple_a700)
        binding.imageSearchOne.setImageResource(R.drawable.img_search_gray_600)

        binding.txtHomeOne.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtTickets.setTextColor(ContextCompat.getColor(this, R.color.purple_700))
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.gray_800))

        val destFragment = TicketsPageOneFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = TicketsPageOneFragment.TAG, 
          addToBackStack = true,
          add = false,
          enter = null,
          exit = null,
          )
    }

    binding.linearHome.setOnClickListener {
        binding.imageHome.setImageResource(R.drawable.img_home)
        binding.imageRewind.setImageResource(R.drawable.img_rewind_gray_600)
        binding.imageThumbsup.setImageResource(R.drawable.img_thumbsup)
        binding.imageSearchOne.setImageResource(R.drawable.img_search_gray_600)

        binding.txtHomeOne.setTextColor(ContextCompat.getColor(this, R.color.purple_700))
        binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtTickets.setTextColor(ContextCompat.getColor(this, R.color.gray_800))
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.gray_800))

        val destFragment = CustomerHomeOpageFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = CustomerHomeOpageFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "CUSTOMER_HOME_OPAGE_CONTAINER_ACTIVITY"
      fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, CustomerHomeOpageContainerActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
      }

  }
}
