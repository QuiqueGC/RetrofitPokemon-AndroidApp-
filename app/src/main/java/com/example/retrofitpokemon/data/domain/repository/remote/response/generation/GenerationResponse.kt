package com.example.retrofitpokemon.data.domain.repository.remote.response.generation

import com.google.gson.annotations.SerializedName

data class GenerationResponse(
    @SerializedName("abilities") var abilities: ArrayList<Any>,
    @SerializedName("id") var id: Int?,
    @SerializedName("main_region") var mainRegion: MainRegionResponse?,
    @SerializedName("moves") var moves: ArrayList<Any>,
    @SerializedName("name") var name: String?,
    @SerializedName("names") var names: ArrayList<Any>,
    @SerializedName("pokemon_species") var pokemonSpecies: ArrayList<Any>,
    @SerializedName("types") var types: ArrayList<Any>,
    @SerializedName("version_groups") var versionGroups: ArrayList<Any>
)