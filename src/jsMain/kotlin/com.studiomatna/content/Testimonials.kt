package com.studiomatna.content

import androidx.compose.runtime.Composable
import com.studiomatna.models.Testimonial
import kotlinx.browser.document
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Testimonials() {
    Div(attrs = {
        classes("container", "text-center", "my-3", "pt-5", "tp-5", "pt-5")
        id("footer")
    }) {
        H2(attrs = {
            classes("font-weight-light")
        }) {
            B{ Text("Usuarios compartiendo ")}
            Text(" su experiencia") }
        Div(attrs = {
            classes("row", "mx-auto", "my-auto", "justify-content-center", "pt-5")
        }) {
            Div(attrs = {
                id("testimonialCarousel")
                classes("carousel", "slide", "tp-5")
                attr("data-bs-ride", value = "carousel")
            }) {
                Div(attrs = {
                    classes("carousel-inner", "w-100", "tp-5")
                    attr("role", value = "listbox")
                }) {
                    for (position in 0..0) {
                        TestimonialItem(Testimonial("CEO. DANIEL ROJAS",
                            "ROJAS ARQUITECTURA",
                            "StudioMatna ha marcado un antes y después para nuestro negocio. Por medio de su experiencia en redes sociales Rojas Arquitectura ha logrado con éxito conectar con el público objetivo que teníamos en mente, aumentando nuestro número de seguidores y la fidelidad de los mismos.",
                            "assets/img/rojasarq3.png",
                            "https://www.instagram.com/rojas_arquitectura/",
                            "https://www.facebook.com/RojasArquitectura",
                            "https://www.tiktok.com/@rojasarquitectura",
                            "https://api.whatsapp.com/send?phone=51987539767&text=%F0%9F%91%8B%C2%A1Hola!%20Bienvenido%20a%20Rojas%20Arquitectura.%20Si%20necesita%20ayuda,%20siempre%20estoy%20aqu%C3%AD.",
                            isActive = position==0))
                       }
                }

            }
        }
    }
}

@Composable
private fun TestimonialItem(testimonial: Testimonial) {
    val isActive = if (testimonial.isActive) "active" else "noactive"
    Div(attrs = {
        classes("carousel-item", isActive)
    }) {
        Div(attrs = {
            classes("col-md-6")
            style { marginTop(0.5.cssRem) }
        }) {
            Div(attrs = {
                classes("card", "card-body", "card-testimonial")
            }) {
                Div(attrs = {
                    classes("row")
                }) {
                    TestimonialNetwork("bi-instagram", text = testimonial.instagram)
                    TestimonialNetwork("bi-facebook", text = testimonial.facebook)
                    TestimonialNetwork("bi-tiktok", text = testimonial.tiktok)
                    TestimonialNetwork("bi-whatsapp", text = testimonial.whatsaap)
                }
                P (attrs = {
                    style { marginTop(1.cssRem) }
                }) {
                    Text(testimonial.description)
                }
                Div(attrs = {
                    classes("row")
                }){
                    Div(attrs = {classes("col-4", "shape-inverted")}) {
                        Img(src = testimonial.pictureUrl, attrs = {
                            classes("shape")
                        })
                    }
                    Div(attrs = {classes("col-8")}){
                        H5 { Text(testimonial.name) }
                        H6(attrs = { style { fontWeight(400) }}) { Text(testimonial.companyName) }
                    }
                }

            }
        }
    }
}

@Composable
private fun TestimonialNetwork(networkIcon: String, text: String) {
    Div(attrs = {
        classes("col")
    })
    {
        A(attrs = {
            href(text)
            classes("a")
            target(ATarget.Blank)
        }){
            I(attrs = {
                classes("bi", networkIcon)
            })
        }
    }
}