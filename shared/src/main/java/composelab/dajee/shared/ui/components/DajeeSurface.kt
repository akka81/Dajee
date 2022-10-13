package composelab.dajee.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun DajeeSurface(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = {},
    content: @Composable () -> Unit = {}
) {

    Surface(
        color = MaterialTheme.colorScheme.surfaceVariant,
        tonalElevation = 8.dp,
        shadowElevation = 8.dp,
        modifier = modifier.clip(RoundedCornerShape(8.dp)).let { if (onClick != null) it.clickable(onClick = onClick) else it }) {
        content()
    }
}