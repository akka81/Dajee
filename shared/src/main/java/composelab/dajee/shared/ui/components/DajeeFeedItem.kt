package composelab.dajee.shared.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Fastfood
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import composelab.dajee.shared.ui.theme.Typography


@Preview(showBackground = true)
@Composable
fun DajeeFeedItem(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit) = {},
    content: @Composable () -> Unit = {},
    text: String = "Testo",
    amount: String = "$ 14,03",
) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Rounded.Restaurant, contentDescription = "Localized description", tint = MaterialTheme.colorScheme.primary)
            }
            Text(
                text = text,
                style = Typography.bodyMedium,
                modifier = Modifier
                    .padding(start = 16.dp),
            )
        }
        Text(
            text = amount, style = Typography.bodyMedium, modifier = Modifier
                .padding(start = 16.dp)
        )
    }
}