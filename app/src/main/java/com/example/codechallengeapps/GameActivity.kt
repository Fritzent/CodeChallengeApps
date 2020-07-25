package com.example.codechallengeapps

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.codechallengeapps.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    private lateinit var gameBinding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gameBinding = ActivityGameBinding.inflate(layoutInflater)
        val view = gameBinding.root
        setContentView(view)

        gameBinding.winnerResults.setText(R.string.txt_blank)
        gameBinding.btnTryagain.visibility = View.GONE

        val itemList = listOf("rock","paper","scissors")
        var playerChoose: String
        var computerChoose: String

        gameBinding.playerrockchoose.setOnClickListener {
            playerChoose = "rock"
            Log.d("Player", playerChoose)
            computerChoose = itemList.random()

            gameBinding.playerrockchoose.isClickable = false
            gameBinding.playerrockchoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
            gameBinding.playerpaperchoose.isClickable = false
            gameBinding.playerscissorschoose.isClickable = false
            gameBinding.btnTryagain.visibility = View.VISIBLE

            when (computerChoose) {
                "rock" -> {
                    gameBinding.comRockChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_draw)
                    Log.d("Results", "Draw")
                }
                "paper" -> {
                    gameBinding.comPaperChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_com_win)
                    Log.d("Results", "Com Win")
                }
                "scissors" -> {
                    gameBinding.comScissorsChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_player_win)
                    Log.d("Results", "Player Win")
                }
            }

        }

        gameBinding.playerpaperchoose.setOnClickListener {
            playerChoose = "paper"
            Log.d("Player", playerChoose)
            computerChoose = itemList.random()

            gameBinding.playerpaperchoose.isClickable = false
            gameBinding.playerpaperchoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
            gameBinding.playerrockchoose.isClickable = false
            gameBinding.playerscissorschoose.isClickable = false
            gameBinding.btnTryagain.visibility = View.VISIBLE

            when (computerChoose) {
                "rock" -> {
                    gameBinding.comRockChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_player_win)
                    Log.d("Results", "Player Win")
                }
                "paper" -> {
                    gameBinding.comPaperChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_draw)
                    Log.d("Results", "Draw")
                }
                "scissors" -> {
                    gameBinding.comScissorsChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_com_win)
                    Log.d("Results", "Com Win")
                }
            }

        }

        gameBinding.playerscissorschoose.setOnClickListener {
            playerChoose = "paper"
            Log.d("Player", playerChoose)
            computerChoose = itemList.random()

            gameBinding.playerscissorschoose.isClickable = false
            gameBinding.playerscissorschoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
            gameBinding.playerrockchoose.isClickable = false
            gameBinding.playerpaperchoose.isClickable = false
            gameBinding.btnTryagain.visibility = View.VISIBLE

            when (computerChoose) {
                "rock" -> {
                    gameBinding.comRockChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_com_win)
                    Log.d("Results", "Com Win")
                }
                "paper" -> {
                    gameBinding.comPaperChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_player_win)
                    Log.d("Results", "Player Win")
                }
                "scissors" -> {
                    gameBinding.comScissorsChoose.setBackgroundColor(Color.parseColor("#2e2e2e"))
                    gameBinding.winnerResults.setText(R.string.txt_draw)
                    Log.d("Results", "Draw")
                }
            }

        }

        gameBinding.btnTryagain.setOnClickListener {
            gameBinding.playerrockchoose.isClickable = true
            gameBinding.playerpaperchoose.isClickable = true
            gameBinding.playerscissorschoose.isClickable = true
            gameBinding.winnerResults.setText(R.string.txt_blank)

            gameBinding.playerrockchoose.setBackgroundColor(Color.parseColor("#FFFFFF"))
            gameBinding.playerpaperchoose.setBackgroundColor(Color.parseColor("#FFFFFF"))
            gameBinding.playerscissorschoose.setBackgroundColor(Color.parseColor("#FFFFFF"))

            gameBinding.comRockChoose.setBackgroundColor(Color.parseColor("#FFFFFF"))
            gameBinding.comPaperChoose.setBackgroundColor(Color.parseColor("#FFFFFF"))
            gameBinding.comScissorsChoose.setBackgroundColor(Color.parseColor("#FFFFFF"))

            gameBinding.btnTryagain.visibility = View.GONE
        }

    }
}