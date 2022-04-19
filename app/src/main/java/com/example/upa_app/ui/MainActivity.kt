package com.example.upa_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.upa_app.R
import com.example.upa_app.databinding.ActivityMainBinding
import com.example.upa_app.presentation.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    companion object {
        /** Key for an int extra defining the initial navigation target. */
        const val EXTRA_NAVIGATION_ID = "extra.NAVIGATION_ID"

        private const val NAV_ID_NONE = -1

        private const val DIALOG_SIGN_IN = "dialog_sign_in"
        private const val DIALOG_SIGN_OUT = "dialog_sign_out"

        private val TOP_LEVEL_DESTINATIONS = setOf(
            com.example.upa_app.presentation.R.id.navigation_feed,
            com.example.upa_app.presentation.R.id.navigation_photo,
            com.example.upa_app.presentation.R.id.navigation_map,
            com.example.upa_app.presentation.R.id.navigation_info,
            com.example.upa_app.presentation.R.id.navigation_agenda,
            com.example.upa_app.presentation.R.id.navigation_codelabs,
            com.example.upa_app.presentation.R.id.navigation_settings,
        )
    }


    private val test = com.google.android.material.R.styleable.BottomSheetBehavior_Layout
//    @Inject
//    @JvmField
//    @MapFeatureEnabledFlag
//    var mapFeatureEnabled: Boolean = false
//
//    @Inject
//    @JvmField
//    @CodelabsEnabledFlag
//    var codelabsFeatureEnabled: Boolean = false
//
//    @Inject
//    @JvmField
//    @ExploreArEnabledFlag
//    var exploreArFeatureEnabled: Boolean = false

    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment
    private var currentNavId = NAV_ID_NONE


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}