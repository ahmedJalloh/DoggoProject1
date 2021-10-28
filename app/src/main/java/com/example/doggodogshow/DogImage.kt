package com.example.doggodogshow

import com.squareup.moshi.Json

data class DogImage(@Json(name = "message") val imgSrcUrl: String) {
}