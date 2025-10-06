package com.example.play_juegos
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class CheckBoxOptions(var title: String, var selected: Boolean, var onCheckedChange: (Boolean) -> Unit)

@Composable
fun getOptions(titles: List<String>): List<CheckBoxOptions> {
    return titles.map {
        var estadoCheck by rememberSaveable {
            mutableStateOf(false)
        }
        CheckBoxOptions(
            title = it,
            selected = estadoCheck,
            onCheckedChange = { estadoCheck = it }
        )
    }
}

@Composable
fun MyCheckBox( checkBoxOptions: CheckBoxOptions) {
    Row(Modifier.padding(8.dp)) {
        Checkbox(
            checked = checkBoxOptions.selected,
            onCheckedChange = {
                checkBoxOptions.onCheckedChange(!checkBoxOptions.selected) })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Opción 1")
    }
}


@Composable
fun PlayMenu(modifier: Modifier = Modifier) {

    val myOptions = getOptions(listOf("Opción1","Opción 2","Opción 3","Opción 4"))

    Box(contentAlignment = Alignment.BottomEnd) {

        Column(
            modifier = modifier
                .selectableGroup()
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            myOptions.forEach {
                MyCheckBox(it)
            }
        }

        FloatingActionButton(
            onClick = { },
        ) {}
    }
}