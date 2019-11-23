package com.example.decagon_classroom



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.decagon_classroom.R.id.*
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_get_started.*




class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    lateinit var bottomNavigationView : BottomNavigationView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager.beginTransaction()

        fragmentManager.add(Fragment, HomeFragment.newInstance(), "home fragment").commit()

        bottomNavigationView = findViewById(bottom_navigation)

        bottomNavigationView.selectedItemId = navigation_home

        bottomNavigationView.setOnNavigationItemSelectedListener(this)


    }

    var home =  HomeFragment()
    var curriculum = CurriculumFragment()
    var resources = ResourcesFragment()
    var profile = ProfileFragment()


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

        when (p0.getItemId()){
            navigation_home ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(Fragment, home).commit()
                return true
            }
            navigation_curriculum ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(Fragment, curriculum).commit()
                return true
            }
            naviagtion_resources ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(Fragment, resources).commit()
                return true
            }
            navigation_profile ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(Fragment, profile).commit()
                return true
            }
        }

        return true
    }
}