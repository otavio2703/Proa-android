package com.example.aventuradasformas.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aventuradasformas.R
import com.example.aventuradasformas.ui.theme.AventuraDasFormasTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.example.aventuradasformas.MenuBar
import kotlin.math.sqrt

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Bem-vindo a Seleção de Formas",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                modifier = Modifier
                    .padding(5.dp),
                text = "Escolha uma forma geométrica:",
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Criação da Row para organizar as duas colunas
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Primeira coluna: Círculo e Quadrado
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { navController.navigate(route = "circulo") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.circuloforma),
                                contentDescription = "círculo",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Circulo",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(route = "quadrado") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.quadradoforma),
                                contentDescription = "quadrado",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Quadrado",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(route = "trapezio") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.trapezioforma),
                                contentDescription = "Trapézio",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Trapézio",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(route = "cuboide") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cuboideforma),
                                contentDescription = "Cuboide",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Cuboide",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }
                }
                // Segunda coluna
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { navController.navigate(route = "retangulo") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.retanguloforma),
                                contentDescription = "retângulo",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Retângulo",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(route = "triangulo") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.trianguloforma),
                                contentDescription = "triângulo",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Triângulo",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(route = "triangulo") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.hexagonoforma),
                                contentDescription = "Hexágono",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Hexágono",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(route = "cubo") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cuboforma),
                                contentDescription = "cubo",
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = "Cubo",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun Circulo(navController: NavController) {

    var raio by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do círculo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.circuloforma),
                contentDescription = "Círculo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    // Raio
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Raio",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = raio,
                            onValueChange = {
                                raio = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            area =
                                if (raio.isNotEmpty()) Math.PI * raio.toDouble() * raio.toDouble() else 0.0
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp)
                    ) {
                        Text(text = "Calcular área", fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrado(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do quadrado",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.quadradoforma),
                contentDescription = "Quadrado",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(7.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                                //area = if (altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = base,
                            onValueChange = {
                                base = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (altura.isNotEmpty() && base.isNotEmpty()) {
                                base.toDouble() * altura.toDouble()
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }
        }
    }
}

@Composable
fun Triangulo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do triângulo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.trianguloforma),
                contentDescription = "Triângulo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(7.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = base,
                            onValueChange = {
                                base = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (altura.isNotEmpty() && base.isNotEmpty()) {
                                base.toDouble() * altura.toDouble() / 2
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Hexagono(navController: NavController) {
    var lado by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }
    val raizDeTres = sqrt(3.0)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do hexágono",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.hexagonoforma),
                contentDescription = "Hexágono",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //lado
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Lado",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = lado,
                            onValueChange = {
                                lado = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (lado.isNotEmpty()) {
                                6 * Math.pow(lado.toDouble(), 2.0) * raizDeTres / 4
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Trapezio(navController: NavController) {
    var baseMaior by remember { mutableStateOf("") }
    var baseMenor by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do trapézio",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.trapezioforma),
                contentDescription = "Trapézio",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //base maior
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base Maior",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = baseMaior,
                            onValueChange = {
                                baseMaior = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base menor
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base Menor",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = baseMenor,
                            onValueChange = {
                                baseMenor = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .background(Color(0xFFAAF1FA), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (baseMaior.isNotEmpty() && baseMenor.isNotEmpty() && altura.isNotEmpty()) {
                                ((baseMaior.toDouble() + baseMenor.toDouble()) * altura.toDouble()) / 2
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Cubo(navController: NavController) {
    var lado by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do cubo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.cuboforma),
                contentDescription = "Cubo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //lado
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Lado",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = lado,
                            onValueChange = {
                                lado = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFABD8FB), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (lado.isNotEmpty()) {
                               6 * Math.pow(lado.toDouble(), 2.0)
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Cuboide(navController: NavController) {
    var comprimento by remember { mutableStateOf("") }
    var largura by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do cubóide",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.cuboideforma),
                contentDescription = "Cubóide",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {


                    //comprimento
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Comprimento",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = comprimento,
                            onValueChange = {
                                comprimento = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFABD8FB), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //largura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Largura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = largura,
                            onValueChange = {
                                largura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFABD8FB), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFABD8FB), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (comprimento.isNotEmpty() && largura.isNotEmpty() && altura.isNotEmpty()) {
                                2 * (comprimento.toDouble() * largura.toDouble() + comprimento.toDouble() * altura.toDouble() + largura.toDouble() * altura.toDouble())
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }

        }
    }
}

@Composable
fun Retangulo(navController: NavController) {
    var altura by remember { mutableStateOf("") }
    var base by remember { mutableStateOf("") }
    var area by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFABD8FB))
    ) {
        MenuBar(navController = navController)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFABD8FB)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.padding(15.dp),
                text = "Calcule a área do retângulo",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.retanguloforma),
                contentDescription = "Retângulo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color(0xFF68B6F3), shape = RoundedCornerShape(16.dp))
                    .padding(40.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    //altura
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Altura",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(7.dp)
                        )
                        OutlinedTextField(
                            value = altura,
                            onValueChange = {
                                altura = it
                                //area = if (altura.isNotEmpty()) altura.toDouble() * base.toDouble() else 0.0
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFABD8FB), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //base
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Base",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            value = base,
                            onValueChange = {
                                base = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFABD8FB), shape = RoundedCornerShape(9.dp))
                                .height(40.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1495F8)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .width(200.dp)
                            .height(48.dp),
                        onClick = {
                            area = if (altura.isNotEmpty() && base.isNotEmpty()) {
                                base.toDouble() * altura.toDouble()
                            } else {
                                0.0
                            }
                        }) {
                        Text(text = "Calcular área")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Área: $area",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp)
                    )

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun homescreen() {
    AventuraDasFormasTheme {
        //HomeScreen(rememberNavController())
       // Circulo(rememberNavController())
       // Quadrado(rememberNavController())
        //Triangulo(rememberNavController())
       // Hexagono(rememberNavController())
        //Trapezio(rememberNavController())
        //Cubo(rememberNavController())
       //Cuboide(rememberNavController())
       // Retangulo(rememberNavController())

    }
}
