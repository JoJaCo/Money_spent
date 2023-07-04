package com.example.moneyspent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.End
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun MoneySpentLayout(
    modifier: Modifier = Modifier

) {
    var textFieldState by remember {
        mutableStateOf("0.00")
    }



    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                modifier = modifier
                    .padding(start = 55.dp), text = stringResource(R.string.spending)
            )


            // what you spent
            Text(
                modifier = modifier
                    .padding(end = 60.dp), text = textFieldState
            )
        }

        //
        Spacer(modifier = modifier.padding(10.dp))
        //user input
        TextField(
            value = textFieldState,
            label = {
                Text(text = "Enter a amount")
            },
            onValueChange = {
                textFieldState = it
            },
            singleLine = true,
            modifier = modifier
        )
        Spacer(modifier = modifier.padding(10.dp))
        //
        Button(onClick = {


        }) {
            Text(text = "Click ME")
        }

    }

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNumberField(
    @StringRes label: Int,
    value:String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier

){
    TextField(value = value,
        onValueChange = onValueChange)
}




@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MoneySpentPreview() {
    MoneySpentTheme {
        EditNumberField()
    }
}