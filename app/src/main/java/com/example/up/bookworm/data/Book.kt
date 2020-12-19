package com.example.up.bookworm.data

import com.squareup.moshi.Json

data class Book (
  val imageFile: String,
  @Json(name = "title") val title: String,
  val author: String,
  val type: String,
  val price: String,
  val availableOnline: Boolean,
  val availableInStore: Boolean,
  val availableForPickUp: Boolean,
  )