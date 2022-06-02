package com.studiomatna.style

import org.jetbrains.compose.web.css.*

object AppCSSVariables {
    val smColorGreyLight by variable<CSSColorValue>()
    val smColorGreyDark by variable<CSSColorValue>()

    val smOffsetTopUnit by variable<CSSUnitValue>()
    val smHorizontalLayoutGutter by variable<CSSUnitValue>()
    val smFlowUnit by variable<CSSUnitValue>()

    val smHeroFontSize by variable<CSSUnitValue>()
    val smHeroLineHeight by variable<CSSUnitValue>()
    val smSubtitle2FontSize by variable<CSSUnitValue>()
    val smSubtitle2LineHeight by variable<CSSUnitValue>()
    val smH2FontSize by variable<CSSUnitValue>()
    val smH2LineHeight by variable<CSSUnitValue>()
    val smH3FontSize by variable<CSSUnitValue>()
    val smH3LineHeight by variable<CSSUnitValue>()

    val smColCount by variable<StylePropertyNumber>()
}


object AppStylesheet : StyleSheet() {
    val composeLogo by style {
        maxWidth(100.percent)
    }

    val composeTitleTag by style {
        padding(5.px, 12.px)
        letterSpacing("normal")
        fontWeight(400)
        lineHeight(24.px)

        position(Position.Relative)
        top((-32).px)
        marginLeft(8.px)
        fontSize(15.px)
        backgroundColor(rgba(39, 40, 44, .05))
        color(rgba(39, 40, 44, .7))
        borderRadius(4.px, 4.px, 4.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                top((-16).px)
            }
        }
    }

    init {
        "label, a, button" style {
            property(
                "font-family",
                "system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif"
            )
        }

        universal style {
            AppCSSVariables.smColorGreyLight(Color("#f4f4f4"))
            AppCSSVariables.smColorGreyDark(Color("#323236"))
            AppCSSVariables.smOffsetTopUnit(24.px)

            margin(0.px)
        }

        media(mediaMaxWidth(640.px)) {
            universal style {
                AppCSSVariables.smOffsetTopUnit(16.px)
                AppCSSVariables.smFlowUnit(16.px)
            }
        }

        attrContains(
            name = "class",
            value = "smCol"
        ) style {
            marginRight(AppCSSVariables.smHorizontalLayoutGutter.value())
            marginLeft(AppCSSVariables.smHorizontalLayoutGutter.value())

            property(
                "flex-basis",
                "calc(8.33333%*${AppCSSVariables.smColCount.value()} - ${AppCSSVariables.smHorizontalLayoutGutter.value()}*2)"
            )
            property(
                "max-width",
                "calc(8.33333%*${AppCSSVariables.smColCount.value()} - ${AppCSSVariables.smHorizontalLayoutGutter.value()}*2)"
            )
            boxSizing("border-box")
        }
    }
}