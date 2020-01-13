package com.app.lawyerly.ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.app.lawyerly.R
import kotlinx.android.synthetic.main.layout_lawyer_details_main.*

/**
 * This class is responsible for displaying detailed information of a Lawyer
 *
 * Created by Renjith Kandanatt on 11/01/2020
 */
class LawyerDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lawyer_details_main)

        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            closeAndReturn()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(android.R.id.home == item.itemId) {
            closeAndReturn()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun closeAndReturn() = finish()
}