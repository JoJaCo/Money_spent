package com.example.moneyspent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.moneyspent.ui.theme.MoneySpentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneySpentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MoneySpentLayout()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoneySpentLayout(modifier: Modifier = Modifier){

    Column(modifier = modifier) {
        Text(text = "Your Spending")
        //
        TextField(value = "6.69",
            onValueChange = {},
            modifier = modifier)
        //
        EnterButton()



    }

}

@Composable
fun EnterButton(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Enter")
        
    }
}

@Preview(showBackground = true)
@Composable
fun MoneySpentPreview() {
    MoneySpentTheme {
        MoneySpentLayout()
    }
}