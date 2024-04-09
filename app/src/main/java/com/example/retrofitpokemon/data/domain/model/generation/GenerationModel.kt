package com.example.retrofitpokemon.data.domain.model.generation

import com.example.retrofitpokemon.data.domain.model.BaseModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationModel(
    val id: Int = 0,
    val name: String = "",
    val mainRegion: MainRegionModel = MainRegionModel()
) : BaseModel() {
}