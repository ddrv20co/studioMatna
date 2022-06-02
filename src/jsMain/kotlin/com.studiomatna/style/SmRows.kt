package com.studiomatna.style

import org.jetbrains.compose.web.css.*

object SmRows: StyleSheet() {

    val smRow by style {
        AppCSSVariables.smHorizontalLayoutGutter(0.px)
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Wrap)

        property(
            "margin-right",
            "calc(-1*${AppCSSVariables.smHorizontalLayoutGutter.value()})"
        )
        property(
            "margin-left",
            "calc(-1*${AppCSSVariables.smHorizontalLayoutGutter.value()})"
        )
        boxSizing("border-box")
    }

    val smRowSizeM by style {
        AppCSSVariables.smHorizontalLayoutGutter(16.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                AppCSSVariables.smHorizontalLayoutGutter(8.px)
            }
        }
    }

    val smRowSizeXs by style {
        AppCSSVariables.smHorizontalLayoutGutter(6.px)
    }

    val smRowSmAlignItemsCenter by style {
        self style {
            alignItems(AlignItems.Center)
        }
    }
    
}