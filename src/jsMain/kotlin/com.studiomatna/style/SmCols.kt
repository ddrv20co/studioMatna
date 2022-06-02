package com.studiomatna.style

import org.jetbrains.compose.web.css.CSSBuilder
import org.jetbrains.compose.web.css.CSSUnitValue
import org.jetbrains.compose.web.css.GenericStyleSheetBuilder
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.flexGrow
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.selectors.CSSSelector

fun <TBuilder> GenericStyleSheetBuilder<TBuilder>.mediaMaxWidth(
    value: CSSUnitValue,
    cssSelector: CSSSelector,
    rulesBuild: TBuilder.() -> Unit
) {
    media(mediaMaxWidth(value)) {
        cssSelector style rulesBuild
    }
}

fun CSSBuilder.forMaxWidth(value: CSSUnitValue, builder: CSSBuilder.() -> Unit) {
    mediaMaxWidth(value, self, builder)
}

object SmCols : StyleSheet(AppStylesheet) {
    val smCol2 by style {
        AppCSSVariables.smColCount(2)
    }

    val smCol3 by style {
        AppCSSVariables.smColCount(3)
    }

    val smCol4 by style {
        AppCSSVariables.smColCount(4)
    }

    val smCol5 by style {
        AppCSSVariables.smColCount(5)
    }

    val smCol6 by style {
        AppCSSVariables.smColCount(6)
    }

    val smCol9 by style {
        AppCSSVariables.smColCount(9)
    }

    val smCol10 by style {
        AppCSSVariables.smColCount(10)
    }

    val smColMd3 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(3)
        }
    }

    val smColMd4 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(4)
        }
    }

    val smColMd8 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(8)
        }
    }

    val smColMd9 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(9)
        }
    }

    val smColMd10 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(10)
        }
    }

    val smColMd11 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(11)
        }
    }

    val smColMd6 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(6)
        }
    }

    val smColMd12 by style {
        forMaxWidth(1000.px) {
            AppCSSVariables.smColCount(12)
        }
    }

    val smColSm12 by style {
        forMaxWidth(640.px) {
            AppCSSVariables.smColCount(12)
        }
    }

    val smColLg6 by style {
        forMaxWidth(1276.px) {
            AppCSSVariables.smColCount(6)
        }
    }

    val smColSmAutoFill by style {
        forMaxWidth(640.px) {
            AppCSSVariables.smColCount(0)
            flexGrow(1)
            maxWidth(100.percent)
        }
    }

    val smColAutoFill by style {
        AppCSSVariables.smColCount(0)
        flexGrow(1)
        maxWidth(100.percent)
    }

    val smColInline by style {
        AppCSSVariables.smColCount(0)
        maxWidth(100.percent)
        property("flex-basis", "auto")
    }
}
