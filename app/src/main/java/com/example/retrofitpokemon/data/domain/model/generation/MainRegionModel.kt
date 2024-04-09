package com.example.retrofitpokemon.data.domain.model.generation

import com.example.retrofitpokemon.data.domain.model.BaseModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class MainRegionModel(
    val name: String = ""
) : BaseModel()
