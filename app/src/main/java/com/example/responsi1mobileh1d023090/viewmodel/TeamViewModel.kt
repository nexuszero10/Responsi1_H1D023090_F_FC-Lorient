package com.example.responsi1mobileh1d023090.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.responsi1mobileh1d023090.data.model.Coach
import com.example.responsi1mobileh1d023090.data.model.Player
import com.example.responsi1mobileh1d023090.data.network.RetrofitInstance
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {

    private val _players = MutableLiveData<List<Player>>()
    val players: LiveData<List<Player>> = _players

    private val _coach = MutableLiveData<Coach?>()
    val coach: LiveData<Coach?> = _coach

    fun fetchCoach() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getTeamById(525)
                if (response.isSuccessful) {
                    _coach.value = response.body()?.coach
                    Log.d("COACH_SUCCESS", "${response.body()?.coach}")
                } else {
                    Log.e("COACH_ERROR", "${response.code()} ${response.message()}")
                }
            } catch (e: Exception) {
                Log.e("COACH_EXCEPTION", e.localizedMessage ?: "Unknown error")
            }
        }
    }


    fun fetchTeam() {
        // ID 525 otomatis, tanpa input user
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getTeamById(525)
                if (response.isSuccessful) {
                    _players.value = response.body()?.squad ?: emptyList()
                    Log.d("TEAM_SUCCESS", "${response.body()?.squad}")
                } else {
                    Log.e("TEAM_ERROR", "${response.code()} ${response.message()}")
                }
            } catch (e: Exception) {
                Log.e("TEAM_EXCEPTION", e.localizedMessage ?: "Unknown error")
            }
        }
    }

}
