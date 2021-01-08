package com.sampleapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.sampleapplication.R
import com.sampleapplication.data.ProfileLiveDataViewModel
import com.sampleapplication.databinding.ViewmodelProfileBinding

class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Obtain ViewModel from ViewModelProviders
        val viewModel = ViewModelProviders.of(this).get(ProfileLiveDataViewModel::class.java)

        // An alternative ViewModel using Observable fields and @Bindable properties can be used:
        // val viewModel = ViewModelProviders.of(this).get(ProfileObservableViewModel::class.java)

        // Obtain binding
        val binding: ViewmodelProfileBinding =
            DataBindingUtil.setContentView(this, R.layout.viewmodel_profile)

        // Bind layout with ViewModel
        binding.viewmodel = viewModel

        // LiveData needs the lifecycle owner
        binding.lifecycleOwner = this
    }
}