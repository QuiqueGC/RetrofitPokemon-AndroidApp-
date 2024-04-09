package com.example.retrofitpokemon.data.domain.repository.remote.response.pokemon_species

import com.google.gson.annotations.SerializedName


data class ShapeResponse(

    @SerializedName("name") var name: String?,
    @SerializedName("url") var url: String?

)