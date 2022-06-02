package com.studiomatna.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.svg.SVGBoundingBoxOptions

@Composable
fun CopyContainer() {
    Div(attrs = {
        classes("container-fw", "container-purple")
    }) {
        Div(attrs = {
            classes("container", "container-purple")
        }) {
            MatnaCopy()
        }
    }
}

@Composable
fun MatnaCopy() {
    Div(attrs = {
        classes("container")
    }) {
        Div(attrs = {
            classes("row")
        }) {
            CopyColumn {
                H6(attrs = {
                    classes("footer-text")
                }) { Text("©2021 studioMatna. Todos los derechos reservados.") }
            }
        }
    }
}

@Composable
private fun CopyColumn(content: @Composable () -> Unit) {
    Div (attrs = {
        classes("col-sm-8", "col-md-8", "col-lg-8", "col-xl-8")
    }) {
        content()
    }
}
