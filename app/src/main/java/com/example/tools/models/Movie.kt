package com.example.tools.models


import com.fasterxml.jackson.annotation.JsonProperty

data class Movie(
    @JsonProperty("rating")
    val rating: Double? = null,
    @JsonProperty("synopsis")
    val synopsis: String? = null,
    @JsonProperty("title")
    val title: String? = null,
    @JsonProperty("year")
    val year: Int? = null
)