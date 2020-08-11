package com.example.exercise_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exercise_one.constant.FIRST_PLAYER
import com.example.exercise_one.constant.FIRST_PLAYER_NAME
import com.example.exercise_one.constant.SECOND_PLAYER
import com.example.exercise_one.constant.SECOND_PLAYER_NAME
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        play_button.setOnClickListener(this)
        pencetButton.setOnClickListener(this)
        pencetButton2.setOnClickListener(this)
    }

    override fun onStart() {
        val activityName = "MAIN_ACTIVITY"
        super.onStart()
        println("$activityName ON START")
    }

    override fun onResume() {
        val activityName = "MAIN_ACTIVITY"
        super.onResume()
        println("$activityName ON RESUME")
    }

    override fun onPause() {
        val activityName = "MAIN_ACTIVITY"
        super.onPause()
        println("$activityName ON PAUSE")
    }

    override fun onStop() {
        val activityName = "MAIN_ACTIVITY"
        super.onStop()
        println("$activityName ON STOP")
    }

    override fun onDestroy() {
        val activityName = "MAIN_ACTIVITY"
        super.onDestroy()
        println("$activityName ON DESTROY")
    }

    //cara manual
    override fun onClick(v: View?) {
        when(v){
            pencetButton ->showName()
            pencetButton2->toBoardActivity()
//            play_button -> toPlayActivity()
        }
    }
    fun showName(){
        val player1name:String = input_playerOne.text.toString()
        val player2name:String = input_playerTwo.text.toString()

        name_playerOne.text = player1name
        name_playerTwo.text = player2name

    }
    fun toBoardActivity(){
        val intent = Intent(this, BoardActivity::class.java)
        intent.putExtra(FIRST_PLAYER_NAME, input_playerOne.text.toString())
        intent.putExtra(SECOND_PLAYER_NAME, input_playerTwo.text.toString())

        startActivity(intent)

    }



//    fun handlePencet(view: View) {
//        val name = input_name.text.toString()
//        name_text.text=name
//    }



//    override fun onClick(v: View?) {
//        when (v) {
//            play_button -> toPlayActivity()
//        }
//    }

    fun toPlayActivity() {
        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra(FIRST_PLAYER, input_playerOne.text.toString())
        intent.putExtra(SECOND_PLAYER, input_playerTwo.text.toString())
        startActivity(intent)
    }

}