package com.studiomatna.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({
        classes("container")
    }) {
        content()
    }
}