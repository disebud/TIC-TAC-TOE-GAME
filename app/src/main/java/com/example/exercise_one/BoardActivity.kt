package com.example.exercise_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.exercise_one.constant.FIRST_PLAYER_NAME
import com.example.exercise_one.constant.SECOND_PLAYER_NAME
import com.example.exercise_one.databinding.ActivityBoardBinding
import com.example.exercise_one.model.Player
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity : AppCompatActivity() {

    val activityName = "BOARD_ACTIVITY"
    lateinit var player1 : Player
    lateinit var player2 : Player
    lateinit var currentPlayer : Player
//    var counter: Int = 0

    val boardGame : Array<String> = arrayOf("","","","","","","","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityBoardBinding = DataBindingUtil.setContentView(this,R.layout.activity_board)
//        setContentView(R.layout.activity_board)
        val player1Name = intent.getStringExtra(FIRST_PLAYER_NAME)
        val player2Name = intent.getStringExtra(SECOND_PLAYER_NAME)
//        textView2.text = "$playerOne vs $playerTwo"

//        binding.player1 = Player(player1Name,"X")
//        binding.player2= Player(player2Name,"O")
        player1 = Player(player1Name,"X")
        player2 = Player(player2Name,"O")
        bind(binding)
        currentPlayer = player1
        setTurn()

//        binding.counter = this.counter
    }

    private fun bind(binding: ActivityBoardBinding) {
        binding.player1 = player1
        binding.player2 = player2
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

    fun flip(view: View){
        view as Button
        val index:Int = view.tag.toString().toInt()
        if(boardGame[index].equals("")){
         boardGame[view.tag.toString().toInt()] = currentPlayer.mark
            view.text = currentPlayer.mark
            setTurn()
        }
        println(boardGame.joinToString())
        if(boardGame[0]=="O" && boardGame[1]=="O" && boardGame[2]=="O" || boardGame[3]=="O" && boardGame[4]=="O" && boardGame[5]=="O")  {
            currentPlayerTextView.text = "${player2.name}'s Winner"
        } else if (boardGame[0]=="X" && boardGame[1]=="X" && boardGame[2]=="X" || boardGame[3]=="X" && boardGame[4]=="X" && boardGame[5]=="X") {
            currentPlayerTextView.text = "${player1.name}'s Winner"
        }
//        this.counter = this.counter+1
//        println("Counter $this.counter")
    }

    fun setTurn(){
        if(currentPlayer==player1){
            currentPlayer = player2
        } else {
            currentPlayer = player1
        }
    currentPlayerTextView.text = "Next ${currentPlayer.name +"["+ currentPlayer.mark+"]"}'s Turn"
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