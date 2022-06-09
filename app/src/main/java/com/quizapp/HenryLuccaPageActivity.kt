package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import kotlinx.android.synthetic.main.activity_henry_lucca_page.*

class HenryLuccaPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_henry_lucca_page)
        henry_github.movementMethod = LinkMovementMethod.getInstance()
        henry_linkedin.movementMethod = LinkMovementMethod.getInstance()
        btn_back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}