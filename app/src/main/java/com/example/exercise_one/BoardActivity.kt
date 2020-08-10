package com.example.exercise_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exercise_one.constant.FIRST_PLAYER_NAME
import com.example.exercise_one.constant.SECOND_PLAYER_NAME
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
//        val playerOne = intent.getStringExtra("playerOne")
//        val playerTwo = intent.getStringExtra("playerTwo")
        val playerOne = intent.getStringExtra(FIRST_PLAYER_NAME)
        val playerTwo = intent.getStringExtra(SECOND_PLAYER_NAME)
        textView2.text = "$playerOne vs $playerTwo"
    }

    fun backHandle(view: View) {
        //intent menambah tumpukan baru, bukan kembali ke halaman sebelumnya
        //bukan destroy tapi stop activity
//        val intent = Intent(this,MainActivity::class.java)
//        startActivity(intent)
        //untuk back, jika memakai intent maka akan ketumpuk tumpuk
        //destroy activity
        finish()
        //merupakan back bawaan dari hp atau tombol back dri hp
//        onBackPressed()
    }
}



//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_board.*
//
//class BoardActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_board)
//        val playerOne = intent.getStringExtra("playerOne")
//        val playerTwo = intent.getStringExtra("playerTwo")
//        playerBanner.text = "$playerOne vs $playerTwo"
//    }
//}

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import com.example.exercise_one.constant.FIRST_PLAYER_NAME
//import com.example.exercise_one.constant.SECOND_PLAYER_NAME
//import kotlinx.android.synthetic.main.activity_board.*
//
//class BoardActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_board)
//        val player1Name: String? = intent.getStringExtra(FIRST_PLAYER_NAME)
//        val player2Name: String? = intent.getStringExtra(SECOND_PLAYER_NAME)
//        playerBanner.text = "$player1Name VS $player2Name"
//
//    }
//}