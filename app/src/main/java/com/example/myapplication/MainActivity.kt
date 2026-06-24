package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // Apply insets to the main LinearLayout to push the Toolbar below the status bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolBar = findViewById<Toolbar>(R.id.toolBar)
        setSupportActionBar(toolBar)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)

        val navigationView = findViewById<NavigationView>(R.id.navigationView)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.app_name, R.string.app_name)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.profile ->
                {
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                }

                R.id.about ->
                {
                    Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
                }

                R.id.contact ->
                {
                    Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show()
                }
                R.id.logout ->
                {
                    Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
                }
            }
            drawerLayout.closeDrawers()
            true
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile_tool -> Toast.makeText(this, "u clicked profile", Toast.LENGTH_SHORT).show()
            R.id.about_tool -> Toast.makeText(this, "u clicked about", Toast.LENGTH_SHORT).show()
            R.id.contact_tool -> Toast.makeText(this, "u clicked contact", Toast.LENGTH_SHORT).show()
            R.id.logout_tool -> Toast.makeText(this, "u clicked logout", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
