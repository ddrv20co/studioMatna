package com.studiomatna.style

import org.jetbrains.compose.web.css.*

object SmSections : StyleSheet() {
    val smSection by style {
        boxSizing("border-box")
        paddingBottom(96.px)
        paddingTop(1.px)
        property(
            propertyName = "padding-bottom",
            value = "calc(4*${AppCSSVariables.smOffsetTopUnit.value(24.px)})"
        )
        backgroundColor(Color("#fff"))
    }

    val smSectionBgGrayLight by style {
        backgroundColor(Color("#f4f4f4"))
        backgroundColor(AppCSSVariables.smColorGreyLight.value())
    }

    val smSectionHeader by style {
        backgroundColor(Color("#323236"))
        backgroundColor(AppCSSVariables.smColorGreyDark.value())
    }
}