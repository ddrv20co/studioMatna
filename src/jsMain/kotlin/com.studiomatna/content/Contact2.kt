package com.studiomatna.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.attributes.type
import org.jetbrains.compose.web.dom.*

@Composable
fun Contact2Container() {
    Div(attrs = {
        classes("container")
    }) {
        Div(attrs = {
            classes("row")
        }) {
            Contact2Columns {
                Div(attrs = {
                    classes("container")
                }) {
                    H6(attrs = {
                        classes("text-contact")
                    }) {
                        Text("CONTACT US")
                        Br()
                    }
                    H2(attrs = {
                        classes("text-contact-tittle")
                    }) {
                        Text("Let's talk about")
                        Br()
                        Text("Love to hear from you!")
                    }
                }
                Div(attrs = {
                    classes("row")
                }) {
                    Contact2Columns {
                        Div(attrs = {
                            classes("container")
                        }){
                        I(attrs = {
                            classes("bi-geo-alt", "text-location")
                        }) { Text(" Our Location")
                        Br()
                            Text ("401 Broadway")
                        }
                        }
                    }
                    Contact2Columns {
                        Div(attrs = {
                            classes("container")
                        }){
                            I(attrs = {
                                classes("bi-envelope", "text-location")
                            }) { Text(" How Can We Help?")
                                Br()
                                Text ("info@studiomatna.com")
                                Br()
                                Text ("contact@studiomatna.com")
                            }
                        }
                    }
                }
            }
            Contact2Columns {
                Section(attrs = {
                    classes("form-register") })
                { P(attrs = {
                    classes("tittle-form")
                }) {Text("Formulario de Contacto")}

                    Input(type = InputType.Text) {
                        classes("controls")
                        placeholder("Ingrese Nombre") }
                    Input(type = InputType.Text) {
                        classes("controls")
                        placeholder("Ingrese Apellido") }
                    Input(type = InputType.Email) {
                        classes("controls")
                        placeholder("Ingrese Email") }
                    Input(type = InputType.Password) {
                        classes("controls")
                        placeholder("Ingrese Contraseña") }
                    P(attrs = {
                        classes("text_form")
                    }) {Text("Estoy de acuerdo con ")
                        A(attrs = {
                            classes("link-form")
                            href("#")
                        }) { Text("Terminos y Condiciones") }
                        Input(type = InputType.Submit) {
                            classes("bottom-form")
                            value("Enviar")}
                        P(attrs = {
                            classes("link-form")
                            }) { Text("Ya tengo cuenta") }
                        }
                    Br()
                    Br()
                    Br()
                    }
                Br()
                Br()
                Br()
                }
            }
        }
    }

@Composable
private fun Contact2Columns(content: @Composable () -> Unit) {
    Div (attrs = {
        classes("col-sm-6", "col-md-6", "col-lg-6", "col-xl-6")
    }) {
        content()
    }
}