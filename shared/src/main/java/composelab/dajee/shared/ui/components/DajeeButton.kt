package composelab.dajee.shared.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import composelab.dajee.shared.ui.theme.Shapes
import composelab.dajee.shared.ui.theme.Typography

@Preview(showBackground = true)
@Composable
fun DajeeButton(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit) = {},
    content: @Composable () -> Unit = {},
    text: String = "Testo",
) {

    Button(
        onClick = onClick,
        shape = Shapes.large,
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
        modifier = modifier.apply { Modifier.height(50.dp) }
    ) {
        Text(text = text, style = Typography.titleMedium, color = MaterialTheme.colorScheme.onPrimary)
        content()
    }
}