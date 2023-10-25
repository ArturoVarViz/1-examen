package com.dam.laprimera
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.laprimera.ui.theme.LaPrimeraTheme


@Composable
fun IU3(miViewModel: MyViewModel){

    Box(
        modifier = Modifier.fillMaxSize()

    ) {

        Button(
            onClick ={ miViewModel.crearRandom()},
            modifier = Modifier
                //.padding(vertical = 360.dp, horizontal = 110.dp)
                .offset(y = 175.dp)
                .offset(x = 0.dp)


        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Generar numeros",
                modifier = Modifier
                    .padding(8.dp)
                    .size(40.dp)

            )
            Text(text="Pulsa para generar numeros")
        }

        Text(


            text = "Numeros: ${miViewModel.getNumerosRandom()}",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(y = 250.dp)
                .offset(x = 20.dp)

        )


    }
    Login(miViewModel)


}





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(miViewModel: MyViewModel) {

    Column {


        TextButton(onClick = { miViewModel.contador()}) {
            Text("CLICKS: ${miViewModel.getContador()}")
        }


        OutlinedTextField(
            value = miViewModel.getString(),
            onValueChange = {
                miViewModel.name.value = it
            },
            label = { Text(text = "Escribe") }
        )


        if (miViewModel.name.value.length > 3) {
            Text(
                text = "Nombre: ${miViewModel.getString()}",
                fontSize = 24.sp
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaPrimeraTheme {
        IU3(miViewModel = MyViewModel())
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   // var msj_saludo = stringResource(id = R.string.saludo)
   // var name = remember {mutableStateOf("")}


        Column{
            Text(
                text = "Hola $name",
                fontSize = 50.sp,
                color = Color.Blue,
                modifier = modifier
            )
            Text(
                text = stringResource(R.string.saludo),
                fontSize = 20.sp,
                color = Color.Gray,
                modifier = modifier

            )

            Button(onClick = { Log.d("Calcular", "Click!!!!") }) {
                Text(text = "Click me!", color= Color.Yellow)
            }
        }
        
    }




@Composable
fun InterfazUsuario(){
    login()
    texto_descriptivo("Hola texto")
    chat()
}
@Composable
fun chat() {
    TODO("Not yet implemented")
}
@Composable
fun texto_descriptivo(texto:String) {
    Text(text = texto)
}

@Composable
fun login(){
    texto_descriptivo(texto = "Fallo de login")
}












