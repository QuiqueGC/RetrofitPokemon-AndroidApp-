package com.example.retrofitpokemon.data.domain.repository.remote.response.pokemon_detail

import com.example.retrofitpokemon.data.domain.repository.remote.response.common.SpeciesResponse
import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(
    @SerializedName("abilities")
    val abilities: MutableList<AbilityFullDataResponse>?,
    @SerializedName("base_experience")
    val baseExperience: Int?,
    @SerializedName("cries")
    val cries: Any?,
    @SerializedName("forms")
    val forms: List<Any>?,
    @SerializedName("game_indices")
    val gameIndices: List<Any>?,
    //expresada en decímetros
    @SerializedName("height")
    val height: Int?,
    @SerializedName("held_items")
    val heldItems: List<Any>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("is_default")
    val isDefault: Boolean?,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String?,
    @SerializedName("moves")
    val moves: List<Any>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("past_abilities")
    val pastAbilities: List<Any>?,
    @SerializedName("past_types")
    val pastTypes: List<Any>?,
    @SerializedName("species")
    val species: SpeciesResponse?,
    @SerializedName("sprites")
    val sprites: SpritesResponse?,
    @SerializedName("stats")
    val stats: List<Any>?,
    @SerializedName("types")
    val types: List<TypeDetailResponse>?,
    //Expresada en hectogramos
    @SerializedName("weight")
    val weight: Int?,
)
