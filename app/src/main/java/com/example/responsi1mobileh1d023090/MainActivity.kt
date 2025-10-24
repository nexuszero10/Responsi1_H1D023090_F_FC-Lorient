package com.example.responsi1mobileh1d023090

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi1mobileh1d023090.databinding.ActivityMainBinding
import com.example.responsi1mobileh1d023090.viewmodel.TeamSquadActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
        initNavigation()
    }

    private fun initLayout() {
        binding.layoutClubHistory.let {
            it.imgIcon.setImageResource(R.drawable.club_history)
            it.tvLayout.setText(R.string.title_club_history)
        }

        binding.layoutHeadCoach.let {
            it.imgIcon.setImageResource(R.drawable.head_coach)
            it.tvLayout.setText(R.string.title_head_coach)
        }

        binding.layoutTeamSquad.let {
            it.imgIcon.setImageResource(R.drawable.team_squad)
            it.tvLayout.setText(R.string.title_team_squad)
        }
    }

    private fun initNavigation() {
        binding.layoutClubHistory.root.setOnClickListener {
            startActivity(Intent(this, ClubHistoryActivity::class.java))
        }

        binding.layoutHeadCoach.root.setOnClickListener {
            startActivity(Intent(this, HeadCoachActivity::class.java))
        }

        binding.layoutTeamSquad.root.setOnClickListener {
            startActivity(Intent(this, TeamSquadActivity::class.java))
        }
    }
}
