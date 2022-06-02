package com.studiomatna.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ButtonType
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.*


@Composable
fun SkillsContainer() {
    Div(attrs = {
        classes("container", "text-center", "my-3")
        id("skills")
    }) {
        H2(attrs = {
            classes("font-weight-light", "tp-5", "pt-5")
        }) {
            B { Text("Podemos") }
            Text(" Ayudarte en...")
        }
        Br()
        SkillsRight(
            "Comunicar con efectividad tus ideas, escritos, blogs, noticias, contenidos, servicios. Nos enfocamos en el uso adecuado de los mejores métodos para la creación de páginas efectivas, que generen confianza al cliente y que a su vez logren el reconocimiento de la empresa.",
            "assets/img/pc4.webp"
        )
        SkillsLeft(
            "Diseñar aplicaciones móviles atractivas y funcionales, para dispositivos Android y iOS; con la ayuda de las mejores herramientas tecnológicas y nuestros talentos construimos Apps que impulsan tu negocio y mejoran la eficiencia de tu empresa.",
            "assets/img/mobile20.png"
        )
        SkillsRight(
            "Crear logos e imágenes coorporativas, fieles a la identidad de tu marca para así diferenciarte de la competencia. Asimismo, conseguir fortalecer y crear una imagen de responsabilidad y profesionalismo que genere confianza en tus clientes.",
            "assets/img/design9.webp"
        )
        SkillsLeft(
            "Crear y gestionar campañas creativas, generamos contenido, interacción, tráfico y construimos la estrategia necesaria para lograr el posicionamiento esperado de la marca. De esta manera, aseguramos la unión de grandes componentes: la creatividad, la estrategia y la planificación.",
            "assets/img/phone13.webp"
        )
    }
}


@Composable
private fun SkillsColumns(content: @Composable () -> Unit) {
    Div (attrs = {
        classes("col-xl-6")
    }) {
        content()
    }
}

@Composable
private fun SkillsRight(text: String, img: String) {
    Div(attrs = {
        classes("container")
    }) {
        Div(attrs = {
            classes("row")
        }){
            Div(attrs = {
                classes("col", "skills")
            }) {
                P(attrs = {classes("tittle3", "tittle-spc")}) { Text(text) }
            }
            Div(attrs = {
                classes("col", "skills2")

            }) {
                P(attrs = { classes("tittle3", "tittle-spc") }) { Text(text) }
            }
            Div(attrs = {
                classes("col", "skills")

            }) {
                Img(src = img, attrs = { classes("studiomatna-logo-1001") })
            }
        }
        Div(attrs = {
            classes("col", "skills2")

        }) {
            Img(src = img, attrs = { classes("studiomatna-logo-100") })
        }

    }
}

@Composable
private fun SkillsLeft(text: String, img: String){
    Div(attrs = {
        classes("container")
    }) {
        Div(attrs = {
            classes("row")
        }){
            Div(attrs = {
                classes("col", "skills")
            }) {
                Img(src = img, attrs = { classes("studiomatna-logo-1001") })
            }
            Div(attrs = {
                classes("col")

            }) {
                P(attrs = {classes("tittle3", "tittle-spc")}) { Text(text) }
            }
        }
        Div(attrs = {
            classes("col", "skills2")

        }) {
            Img(src = "assets/img/phone16.webp", attrs = { classes("studiomatna-logo-100") })
        }
    }
}