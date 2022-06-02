package com.studiomatna.content

import androidx.compose.runtime.Composable
import com.studiomatna.models.Services
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun CardLayout() {
    Div(attrs = {
        classes("container", "card-container")
        id("service")
    }) {
        Div(attrs = {
            classes("row", "align-items-center")
        }) {
            Card(Services("Desarrollo Movil", "Desarrollamos apps en tecnologia android o ios.", "assets/img/phone12.webp", Color("#9e66da")))
            Card2(Services("Desarrollo Web", "Realizamos sitios webs adaptables y modernos.", "assets/img/pc3.webp", Color("#ee80a7")))
            Card(Services("Diseño Grafico", "Creamos y cambiamos la identidad de tu marca.", "assets/img/design7.webp", Color("#9e66da")))
            Card2(Services("Marketing Digital", "Generamos campañas creativas de gran alcance.", "assets/img/marketing3.webp", Color("#ee80a7")))
        }
    }
}

@Composable
private fun Card(services: Services) {
    Div(attrs = {
        classes("col-12", "col-sm-6", "col-lg-3", "col-md-6", "col-xl-3")
        style { marginTop(0.5.cssRem) }
    }) {
        Div(attrs = {
            classes("card")
            style { backgroundColor(services.backgroundColor) }
        }) {
            Img(services.pictureUrl, attrs = {
                classes("card-img-top")
            })
            Div(attrs = {
                classes("card-body")
            }) {
                P(attrs = {
                    style {
                        fontSize(20.px)
                        color(Color.black)
                        classes("title-card")
                    }
                })
                H5 {
                    Text(services.name)
                }

                P(attrs = {
                    style {
                        fontSize(15.px)
                        color(Color.gray)
                    }
                }) {
                    Text(services.description)
                }
            }
        }
    }
}

@Composable
private fun Card2(services: Services) {
    Div(attrs = {
        classes("col-12", "col-sm-6", "col-lg-3", "col-md-6", "col-xl-3")
        style { marginTop(0.5.cssRem) }
    }) {
        Div(attrs = {
            classes("card")
            style { backgroundColor(services.backgroundColor) }
        }) {
            Img(services.pictureUrl, attrs = {
                classes("card-img-top2")
            })
            Div(attrs = {
                classes("card-body")
            }) {
                P(attrs = {
                    style {
                        fontSize(20.px)
                        color(Color.black)
                        classes("title-card")
                    }
                })
                H5 {
                    Text(services.name)
                }

                P(attrs = {
                    style {
                        fontSize(15.px)
                        color(Color.gray)
                    }
                }) {
                    Text(services.description)
                }
            }
        }
    }
}