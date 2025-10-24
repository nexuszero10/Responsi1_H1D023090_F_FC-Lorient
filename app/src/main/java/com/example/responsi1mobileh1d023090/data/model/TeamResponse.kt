package com.example.responsi1mobileh1d023090.data.model

data class TeamResponse(
    val id: Int,
    val name: String,
    val squad: List<Player>,
    val coach: Coach
)

data class Player(
    val id: Int,
    val name: String,
    val position: String?,
    val dateOfBirth: String?,
    val nationality: String?
)

data class Coach(
    val id: Int,
    val firstName: String?,
    val lastName: String?,
    val name: String,
    val dateOfBirth: String?,
    val nationality: String?,
    val contract: Contract?
)

data class Contract(
    val start: String?,
    val until: String?
)
