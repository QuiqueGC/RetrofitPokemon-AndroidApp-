package com.example.retrofitpokemon.ui.list_fragment

import com.example.retrofitpokemon.data.domain.model.pokemon_detail.PokemonDetailModel

sealed class ListFragmentUiState {
    data object Loading : ListFragmentUiState()
    data class Success(val listPokemon: ArrayList<PokemonDetailModel>) : ListFragmentUiState()
    data class Error(val msg: String) : ListFragmentUiState()
}
