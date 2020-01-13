package com.app.lawyerly.ui.activity

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.app.lawyerly.R
import com.app.lawyerly.ui.adapter.PageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.layout_main.*

/**
 * This class acts the launcher activity for the application
 * It also takes care of tabs and bottom navigation bar
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)

        //setup toolbar
        setSupportActionBar(toolbar)

        //setup ViewPager and related tabs
        setupViewPager()
        setupTabLayout()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_lawyer_list, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            this.moveTaskToBack(true)
        } else {
            // Otherwise, select the previous step.
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

    private fun setupViewPager() {
        viewPager = findViewById(R.id.view_pager)

        //Swipr gesture on ViewPager2 is disabled to avoid confusion with bottom navigation bar flow
        viewPager.isUserInputEnabled = false

        val pageAdapter = PageAdapter(this)
        viewPager.adapter = pageAdapter
    }

    private fun setupTabLayout() {
        //setup tab layout
        val tabLayout: TabLayout = findViewById(R.id.tabs)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = getText(tabLabels[position])
        }.attach()
    }

    companion object {
        val tabLabels = arrayOf(
            R.string.title_tab_one,
            R.string.title_tab_two,
            R.string.title_tab_three
        )
    }
}
