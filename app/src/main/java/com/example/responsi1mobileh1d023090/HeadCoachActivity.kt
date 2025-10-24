package com.example.responsi1mobileh1d023090

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi1mobileh1d023090.databinding.ActivityHeadCoachBinding
import com.example.responsi1mobileh1d023090.viewmodel.TeamViewModel

class HeadCoachActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeadCoachBinding
    private val viewModel: TeamViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeadCoachBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.fetchCoach()

        viewModel.coach.observe(this) { coach ->
            coach?.let {
                binding.textCoachName.text = it.name
                binding.textCoachBornDate.text = it.dateOfBirth ?: "-"
                binding.textCoachNationality.text = it.nationality ?: "-"
            }
        }
    }
}
