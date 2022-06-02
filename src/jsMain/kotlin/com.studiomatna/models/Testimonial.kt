package com.studiomatna.models

data class Testimonial(
    val name: String = "",
    val companyName: String = "",
    val description: String = "",
    val pictureUrl: String,
    val instagram: String = "",
    val facebook: String = "",
    val tiktok: String = "",
    val whatsaap: String = "",
    val twitter: String = "",
    val isActive: Boolean = false
)
