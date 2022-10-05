package composelab.dajee.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import composelab.dajee.ui.theme.Typography

@Preview(showBackground = true)
@Composable
fun DajeeButton(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit) = {},
    content: @Composable () -> Unit = {},
    text: String = "Testo"
) {

    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
    ) {
        Text(text = text, style = Typography.bodyMedium)
        content()
    }
}