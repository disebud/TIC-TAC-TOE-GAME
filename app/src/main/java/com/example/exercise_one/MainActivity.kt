package com.example.exercise_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exercise_one.constant.FIRST_PLAYER
import com.example.exercise_one.constant.SECOND_PLAYER
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            play_button -> toPlayActivity()
        }
    }

    fun toPlayActivity() {
        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra(FIRST_PLAYER, input_playerOne.text.toString())
        intent.putExtra(SECOND_PLAYER, input_playerTwo.text.toString())
        startActivity(intent)
    }

}