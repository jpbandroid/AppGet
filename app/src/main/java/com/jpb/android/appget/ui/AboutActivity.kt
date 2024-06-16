package com.jpb.android.appget.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.jpb.android.appget.R
import com.jpb.android.appget.SDKActivity
import com.jpb.android.appget.oss.license.OSSLicense

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val button3: Button = findViewById(R.id.button6)
        button3.setOnClickListener {
            val intent = Intent(applicationContext, OSSLicense::class.java)
            startActivity(intent)
        }
    }
}