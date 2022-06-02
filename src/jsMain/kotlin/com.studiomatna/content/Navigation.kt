package com.studiomatna.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*

@Composable
fun Navigation() {
    Nav(attrs = {
        classes("navbar", "navbar-expand-lg", "bg-white", "navbar-light", "fixed-top")
    }) {
        Div({ classes("container", "px-5") }) {
            Logo()
            NavigationContent()

        }
    }
}

@Composable
private fun Logo() {
    A(attrs = {
        classes("navbar-brand")
        target(ATarget.Blank)
    }, href = "https://www.studiomatna.com/") {
        Div(attrs = {
            classes("studiomatna-logo", "_logo-studiomatna", "_size-3")
        }) {
            Img(
                attrs = {
                        classes("studiomatna-logo", "_logo-studiomatna", "_size-3")
                }, src = "logo_colored.png")
        }
    }
}

@Composable
private fun NavigationContent() {
    Div(attrs = {
        classes("collapse", "navbar-collapse")
    }) {
        Ul(attrs = {
            classes("navbar-nav", "ms-auto", "me-lg-5")
        }) {
            val items = listOf<Pair<String, String>>(
                Pair("Servicios", "#service"),
                Pair("Habilidades", "#skills"),
                Pair("Comentarios", "#footer")

            )
            items.forEach {
                NavigationItem(it)

            }
            A(attrs = {
                classes("btn", "fw-500", "ms-lg-4", "btn-primary")
                href("https://api.whatsapp.com/send?phone=+573196093078")
                target(ATarget.Blank)
            }) { I(attrs = {classes("bi-white", "bi-whatsapp", "bi3")})
                Text("  Whatsapp") }
        }
    }
}

@Composable
private fun NavigationItem(pair: Pair<String, String>) {
    Li(attrs = {classes("nav-item", "active")}) {
        A(attrs = {
            classes("nav-link")},
            href = pair.second) {
            Text(pair.first)
        }

    }
}