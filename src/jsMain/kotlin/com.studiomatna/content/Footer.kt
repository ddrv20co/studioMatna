package com.studiomatna.content

import androidx.compose.runtime.Composable
import kotlinx.coroutines.flow.DEFAULT_CONCURRENCY
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*

@Composable
fun FooterContainer() {
    Div(attrs = {
        classes("container-fw", "container-purple")
    }) {
        Div(attrs = {
            classes("container", "border-bottom",  "container-purple")
        }) {
            MatnaFooter()
        }
    }
}

@Composable
private fun MatnaFooter() {
    Footer(attrs = {
        classes("container")
    }) {
        Div(attrs = {
            classes("row")
        }) {
            FooterColumns {
                Br()
                Img(src = "logo_white.png", attrs = { classes("studiomatna-logo-80") })
                H6(attrs = {
                    classes("footer-text")
                }) { Text("Ayudamos a empresas ambiciosas como la suya a generar un mejor rendimiento comercial por medio de múltiples herramientas como lo son las paginas Web o aplicaciones Moviles y la activación de campañas publicitarias por internet.") }
            Div(attrs = {
                classes("row")
            })
                CopyList("bi-instagram", "https://www.instagram.com/studiomatna/?hl=es-la")
                CopyList("bi-facebook", "https://www.facebook.com/studiomatna")
                CopyList("bi-twitter", "https://twitter.com/StudioMatna")
                Br()
                Br()
            }
           /* FooterColumns {
                Br()
                Br()
                H4(attrs = {
                    classes("footer-text-tittle")
                })
                { Text("Quick") }
                Ul(attrs = {
                    classes("nav", "flex-column", "footer-text")
                }) {
                FooterLinks("Road Map", "#")
                FooterLinks("Privacy Policy", "#")
                FooterLinks("Refund Policy", "#")
                FooterLinks("Terms", "#")
                }
                }
            FooterColumns {
                Br()
                Br()
                H4(attrs = {
                    classes("footer-text-tittle")
                })
                { Text("Resources") }
                Ul(attrs = {
                    classes("nav", "flex-column")
                }) {
                    FooterLinks("Home", "#")
                    FooterLinks("Page", "#")
                    FooterLinks("Portafolio", "#")
                    FooterLinks("Blog", "#")
                    FooterLinks("Contact", "#")
                }
                }*/
            FooterColumns {
                Br()
                Br()
                H4(attrs = {
                    classes("footer-text-tittle", "text-footer-end")
                }) { Text("Contact Us") }
                Ul(attrs = {
                    classes("nav", "flex-column", "text-footer-end", "pt-4")
                }) {
                    FooterContactInfo("+573196093078")
                    FooterContactInfo("info@stiomatna.com")
                    FooterContactInfo("www.studiomatna.com")
                    FooterContactInfo("Calle 182 #45-24, Alameda De Santa Fe. Bogota, Colombia.")
                }
            }
        }
    }
}

@Composable
private fun FooterColumns(content: @Composable () -> Unit) {
    Div (attrs = {
        classes("col-sm-6", "col-md-6", "col-lg-6", "col-xl-6")
    }) {
        content()
    }
}

@Composable
private fun FooterContactInfo(text: String) {
    Li(attrs = {
        classes("nav-item", "mb-2")
    }) {
        H6(attrs = {
            classes("footer-text")
        }) { Text(text) }
    }
}

@Composable
private fun FooterLinks(text: String, link: String) {
    Li(attrs = {
        classes("nav-item", "mb-2")
    }) {
        A(attrs = {
            classes("nav-link", "p-0", "text-muted", "footer-text")
            href(link)
        }) { Text(text) }
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
        classes("bi2", "bi-white", cssClass)}
    ) }
}