package com.example.escolhapixar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.escolhapixar.ui.theme.DadosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DadosTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(modifier: Modifier = Modifier){

    var rand by remember {
        mutableIntStateOf(0)
    }

    val filme_sorteado = when(rand){
        0 -> "Toy Story"
        1 -> "Vida de Inseto"
        2 -> "Toy Story 2 "
        3 -> "Monstros S. A."
        4 -> "Procurando Nemo"
        5 -> "Os Incríveis"
        6 -> "Carros"
        7 -> "Ratatouille"
        8 -> "WALL·E"
        9 -> "Up - Altas Aventuras"
        10 -> "Toy Story 3"
        11 -> "Valente"
        12 -> "Universidade Monstros"
        13 -> "Divertida Mente"
        14 -> "Procurando Dory"
        15 -> "Carros 3"
        16 -> "Viva - A Vida é Uma Festa"
        17 -> "Os Incríveis 2"
        18 -> "Toy Story 4"
        19 -> "Soul"
        20 -> "Divertida Mente 2"
        else -> "Red: Crescer É uma Fera"
    }
    val filme_imagem = when(rand){
        0 -> R.drawable.toystory
        1 -> R.drawable.inseto
        2 -> R.drawable.toystory2
        3 -> R.drawable.monstros
        4 -> R.drawable.nemo
        5 -> R.drawable.os_incriveis
        6 -> R.drawable.carros
        7 -> R.drawable.ratata
        8 -> R.drawable.wall
        9 -> R.drawable.up
        10 -> R.drawable.toystory3
        11 -> R.drawable.valente
        12 -> R.drawable.monstrosu
        13 -> R.drawable.divertida
        14 -> R.drawable.dory
        15 -> R.drawable.carros3
        16 -> R.drawable.viva
        17 -> R.drawable.osincriveis2
        18 -> R.drawable.toystory4
        19 -> R.drawable.soul
        20 -> R.drawable.divertida2
        else -> R.drawable.red
    }

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(top = 50.dp)
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Text(
            text = "Vamos Escolher um filme da Pixar para assistir?",
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif
        )
                Image(
            painter = painterResource(id = filme_imagem),
            contentDescription = filme_sorteado,
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Text(
            text = filme_sorteado,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif
        )

        Button(
            onClick = { rand = (0..20).random() },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White
            )
        ) {

            Text("VAMOS ESCOLHER")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DadosTheme {
        Home()
    }
}