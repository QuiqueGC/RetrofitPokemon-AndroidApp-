package com.example.retrofitpokemon.data.domain.repository.remote.mapper.generation

import com.example.retrofitpokemon.data.domain.model.generation.GenerationModel
import com.example.retrofitpokemon.data.domain.model.generation.MainRegionModel
import com.example.retrofitpokemon.data.domain.repository.remote.mapper.ResponseMapper
import com.example.retrofitpokemon.data.domain.repository.remote.response.generation.GenerationResponse

class GenerationMapper : ResponseMapper<GenerationResponse, GenerationModel> {
    override fun fromResponse(response: GenerationResponse): GenerationModel {
        val mainRegionMapper = MainRegionMapper()
        var mainRegion = MainRegionModel()

        if (response.mainRegion != null) {
            mainRegion = mainRegionMapper.fromResponse(response.mainRegion!!)
        }

        return (GenerationModel(
            response.id ?: -1,
            response.name ?: "",
            mainRegion
        ))
    }
}