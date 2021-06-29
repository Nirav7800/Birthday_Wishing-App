package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button.setOnClickListener{
//
//        }
    }

    fun CreatBirthdaycard(view: View) {
        val name=editTextTextPersonName.text.toString()
           val intent=Intent(this,BirthdayPosterActivity::class.java)//go to other class
          intent.putExtra(BirthdayPosterActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}