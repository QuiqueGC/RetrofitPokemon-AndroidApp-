package com.example.retrofitpokemon.data.domain.repository.remote.response.generation

import com.google.gson.annotations.SerializedName

data class MainRegionResponse(
    @SerializedName("name") var name: String?,
    @SerializedName("url") var url: String?
)
