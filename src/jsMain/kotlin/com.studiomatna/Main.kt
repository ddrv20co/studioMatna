package com.studiomatna

import com.studiomatna.components.Layout
import com.studiomatna.content.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {

        Layout {
            Navigation()
            MatnaHeader()
            CardLayout()
            SkillsContainer()
            Testimonials()
            ContactContainer()
            FooterContainer()
            CopyContainer()
        }
    }
}

