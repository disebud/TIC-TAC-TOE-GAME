package com.example.exercise_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exercise_one.constant.FIRST_PLAYER
import com.example.exercise_one.constant.SECOND_PLAYER
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    var player = 1
        private set

    fun playGame(view: View) {
        val player1Name = intent.getStringExtra(FIRST_PLAYER)
        val player2Name = intent.getStringExtra(SECOND_PLAYER)
        playersBanner.text = "$player1Name vs $player2Name"
        var cellTicTacToe = arrayOf(cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9)
        for (i in cellTicTacToe.indices) {
            if (cellTicTacToe[i].tag == view.tag) {
                if (player == 1) {
                    cellTicTacToe[i].text = "X"
                    cellTicTacToe[i].isEnabled = false
                    player = 2
                    playersBanner.text = "$player1Name's turn"
                } else {
                    cellTicTacToe[i].text = "O"
                    cellTicTacToe[i].isEnabled = false
                    player = 1
                    playersBanner.text = "$player2Name's turn "
                }
            }
        }
    }
}