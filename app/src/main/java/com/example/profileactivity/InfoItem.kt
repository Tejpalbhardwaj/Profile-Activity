package com.example.profileactivity


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowRightAlt
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoItem(title: String, values: String ) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = title, color = Color.White, fontSize = 12.sp)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = values, color = Color.White, fontSize = 12.sp)
            Spacer(modifier = Modifier.width(3.dp))
            Icon(
                Icons.Default.ArrowRightAlt,
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier.size(12.dp)
            )
        }

    }
}

@Composable
fun InfoOther(title: String, values: String) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = title, color = Color.White, fontSize = 12.sp, lineHeight = 12.sp)
            Text(text = values, color = Color.Gray, fontSize = 10.sp, lineHeight = 8.sp)
        }
        Icon(
            Icons.Default.KeyboardArrowRight,
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier.size(12.dp)
        )
    }
}

