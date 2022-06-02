package com.studiomatna.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactContainer() {
    Div(attrs = {
        classes("container-fw", "container-blue")
    }) {
        Div(attrs = {
            classes("container",  "container-purple2")
        }) {
            MatnaContact()
        }
    }
}

@Composable
fun MatnaContact(){
   Div(attrs = {
       classes("container")
   }) {
       Div(attrs = {
           classes("row")
       }) {
           ContactColumns {Br()
               Br()
               H2(attrs = {
                   classes("contactText")
               }) { Text("Chatea con nosotros!") }
               Br(attrs = {
                   classes("space")
               })
               Br(attrs = {
                   classes("space")
               })
           }
           ContactColumns {Br()
               Br()
                Div(attrs = {
                    classes("list-unstyled", "d-flex", "d-flex2")
                }) {
                    A(attrs = {
                        classes("btn", "btn-contact", "btn-outline-light", "btn-cot", "fw-500", "me-sm-3", "mb-3", "mb-sm-0", "d-flex2")
                        href("https://api.whatsapp.com/send?phone=+573196093078")
                        target(ATarget.Blank)
                        id("hola")
                    }){ I(attrs = {classes("bi-white", "bi-whatsapp", "bi3")})
                        Text("  Whatsapp")
                    }
                }
           }
       }
   }
}

@Composable
private fun ContactColumns(content: @Composable () -> Unit) {
    Div (attrs = {
        classes("col-sm-6", "col-md-6", "col-lg-6", "col-xl-6")
    }) {
        content()
    }
}