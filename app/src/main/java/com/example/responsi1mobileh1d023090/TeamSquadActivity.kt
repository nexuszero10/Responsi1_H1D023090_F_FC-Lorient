package com.example.responsi1mobileh1d023090.viewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.responsi1mobileh1d023090.databinding.ActivityTeamSquadBinding
import com.example.responsi1mobileh1d023090.ui.adapter.PlayerAdapter
import com.example.responsi1mobileh1d023090.ui.fragment.DetailPemainFragment

class TeamSquadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTeamSquadBinding
    private val viewModel: TeamViewModel by viewModels()
    private lateinit var adapter: PlayerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeamSquadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = PlayerAdapter(emptyList()) { player ->
            val fragment = DetailPemainFragment(player)
            fragment.show(supportFragmentManager, "PlayerDetail")
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        viewModel.players.observe(this) { players ->
            adapter.setData(players)
        }

        viewModel.fetchTeam()
    }
}
