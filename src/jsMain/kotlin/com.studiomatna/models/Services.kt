package com.studiomatna.models

import org.jetbrains.compose.web.css.CSSColorValue

data class Services(
    val name: String = "",
    val description: String = "Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis dolor, in sagittis nisi. Etiam sed iaculis libero, at euismod massain venenatis ligula.",
    val pictureUrl: String,
    val backgroundColor: CSSColorValue
)