package com.example.responsi1mobileh1d023090.data.network

import com.example.responsi1mobileh1d023090.data.model.TeamResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FootballApi {
    @GET("teams/{id}")
    suspend fun getTeamById(@Path("id") id: Int): Response<TeamResponse>
}
