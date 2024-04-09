package com.example.retrofitpokemon.data.domain.repository.remote.mapper.generation

import com.example.retrofitpokemon.data.domain.model.generation.MainRegionModel
import com.example.retrofitpokemon.data.domain.repository.remote.mapper.ResponseMapper
import com.example.retrofitpokemon.data.domain.repository.remote.response.generation.MainRegionResponse

class MainRegionMapper : ResponseMapper<MainRegionResponse, MainRegionModel> {
    override fun fromResponse(response: MainRegionResponse): MainRegionModel {
        return MainRegionModel(response.name ?: "")
    }
}