package com.studiomatna.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.parsing.XMLSerializer
import org.w3c.dom.svg.SVGBoundingBoxOptions

@Composable
fun MatnaHeader() {
    Header(attrs = {
        classes("page-header-ui", "page-header-ui-light", "bg-white")
    }) {
            Div(attrs = {
                classes("container", "px-5")
            }) {
                Div(attrs = {
                    classes("row", "gx-5", "align-items-center")
                }) {
                    Div(attrs = {
                        classes("col-lg-6", "aos-init", "aos-animate", "text-header-beginning")
                        style { display(DisplayStyle.None) }
                    }) {
                        H1(attrs = {
                            classes("page-header-ui-title")
                        }) {
                            Text("¿Quieres crecer en el mundo digital?")
                        }
                        P(attrs = {
                            classes("page-header-ui-text", "mb-5", "text-header-description")
                        }) {
                            Text("Nosotros te podemos ayudar, con nuestros años de experiencia en Desarrollo de aplicaciones web y móviles, Diseño gráfico y Marketing Digital creamos la forma perfecta de hacer realidad tus ambiciones y las de tu marca.")
                        }
                        Div(attrs = {
                            classes("d-flex",  "flex-sm-row")
                        }) {

                        }
                    }
                    Div(attrs = {
                        classes("col-md-6", "aos-init", "aos-animate", "text-header-end")
                    }) {
                        H1(attrs = {
                            classes("page-header-ui-title")
                        }) {
                            Text("¿Quieres crecer en el mundo digital?")
                        }
                        P(attrs = {
                            classes("page-header-ui-text", "mb-5", "text-header-description")
                        }) {
                            Text("Nosotros te podemos ayudar, con nuestros años de experiencia en Desarrollo de aplicaciones web y móviles, Diseño gráfico y Marketing Digital creamos la forma perfecta de hacer realidad tus ambiciones y las de tu marca.")
                        }
                        Div(attrs = {
                            classes("d-flex",  "flex-sm-row")
                        }) {

                        }
                    }
                    Div(attrs = {
                        classes("col-lg-6", "img-header", "aos-init", "aos-animate", "col-md-6")
                    }) {
                        Img(attrs = {
                            classes("img-fluid")},
                            src = "assets/img/header2.webp")
                    }
                    Div(attrs = {
                        classes("col-lg-6", "d-none", "d-lg-block", "aos-init", "aos-animate")
                    }) {
                        Img(attrs = {
                              classes("img-fluid")},
                            src = "assets/img/header2.webp")

                    }
                    Div(attrs = {
                        classes("d-flex",  "flex-sm-row", "red-header", "tp-5")
                        style { display(DisplayStyle.None) }
                    }){
                        CopyList("bi-instagram", "https://www.instagram.com/studiomatna/?hl=es-la")
                        CopyList("bi-facebook", "https://www.facebook.com/studiomatna")
                        CopyList("bi-twitter", "https://twitter.com/StudioMatna")
                        CopyList("bi-pinterest", "https://co.pinterest.com/studioMatna/_saved/")
                        CopyList("bi-tiktok", "https://www.tiktok.com/@studiomatna")
                        CopyList("bi-linkedin", "https://www.linkedin.com/in/studio-matna-632364224/")
                    }

                }
            }
    }
}

@Composable
private fun CopyList(cssClass: String, link: String) {
    A(attrs = {
        classes("link-dark")
        href(link)
        target(ATarget.Blank)
    })
    { I(attrs = {
        classes("bi2", "bi-purple", cssClass)}
    ) }
}