package com.example.tools.models


import com.fasterxml.jackson.annotation.JsonProperty

data class Joke(
    @JsonProperty("id")
    val id: Int? = null,
    @JsonProperty("punchline")
    val punchline: String? = null,
    @JsonProperty("setup")
    val setup: String? = null,
    @JsonProperty("type")
    val type: String? = null
)