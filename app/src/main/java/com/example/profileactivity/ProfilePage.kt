package com.example.profileactivity


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowRightAlt
import androidx.compose.material.icons.filled.CurrencyRupee
import androidx.compose.material.icons.filled.DoubleArrow
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ElectricCar
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ProfilePage(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(0.6f).fillMaxWidth().background(Color(0xFF1C1C1E)))
            Box(modifier = Modifier.weight(0.4f).fillMaxWidth().background(Color.Black))

        }
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { navController.navigate("main_page") }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                    Text(text = "Profile", fontSize = 14.sp, color = Color.White)
                }


                Box(
                    modifier = Modifier.border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(30.dp)
                    )
                        .clickable { }.padding(horizontal = 12.dp, vertical = 5.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.Message,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(13.dp)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(text = "Support", color = Color.White, fontSize = 12.sp)
                    }

                }

            }
            Spacer(modifier = Modifier.height(22.dp))

            Row() {
                Image(
                    painter = painterResource(R.drawable.rndm),
                    contentDescription = "",
                    modifier = Modifier.size(64.dp).clip(
                        CircleShape
                    )
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        "Tejpal Bhardwaj",
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text("Member Since Dec 2020", fontSize = 14.sp, color = Color.Gray)
                }
                Spacer(modifier = Modifier.width(40.dp))
                Box(
                    modifier = Modifier.border(
                        width = 0.5.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                        .clickable { }.padding(8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.Edit,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )

                    }

                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier.border(
                    width = 0.4.dp,
                    color = Color.White,
                    shape = RectangleShape
                ).align(Alignment.CenterHorizontally)
                    .clickable { }.padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier.border(
                            width = 0.5.dp,
                            color = Color.White,
                            shape = CircleShape
                        )
                            .clickable { }.padding(8.dp)
                    ) {

                        Icon(
                            Icons.Default.ElectricCar,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(
                            text = "get to know your vehicles , inside out",
                            fontSize = 10.sp,
                            lineHeight = 12.sp,
                            color = Color.Gray
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "CRED GROUP",
                                fontSize = 12.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            Icon(
                                Icons.Default.ArrowRightAlt,
                                contentDescription = "",
                                modifier = Modifier.size(16.dp),
                                tint = Color.White
                            )
                        }
                    }
                }
            }


            Spacer(modifier = Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier.border(
                        width = 0.5.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                        .clickable { }.padding(2.dp)
                ) {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(8.dp)
                    )

                }
                Spacer(modifier = Modifier.width(4.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                ) {
                    Text(text = "Credit score", color = Color.White, fontSize = 12.sp)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            "· refresh available",
                            color = Color(0xFF00C853),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            fontStyle = FontStyle.Italic
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Text(text = "757", color = Color.White, fontSize = 12.sp)
                        Icon(
                            Icons.Default.ArrowRightAlt,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(12.dp)
                        )
                    }

                }

            }
            Divider()
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier.border(
                        width = 0.5.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                        .clickable { }.padding(2.dp)
                ) {
                    Icon(
                        Icons.Default.CurrencyRupee,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(8.dp)
                    )

                }
                Spacer(modifier = Modifier.width(4.dp))
                InfoItem("lifetime Cashback", "Rs 3")
            }
            Divider()
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier.border(
                        width = 0.5.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                        .clickable { }.padding(2.dp)
                ) {
                    Icon(
                        Icons.Default.DoubleArrow,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(8.dp)
                    )

                }
                Spacer(modifier = Modifier.width(4.dp))
                InfoItem("bank balance", "check")
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "YOUR REWARDS AND BENEFITS", color = Color.Gray, fontSize = 12.sp)

            InfoOther(title = "cashback balance" , values = "check")
            Divider()
            InfoOther(title = "coins" , values = "12,23,65")
            Divider()
            InfoOther(title = "win upto 1000" , values = "refer and earn")

            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "Transactions and Support", color = Color.Gray, fontSize = 14.sp)
            InfoOther(title = "all Transactions" , values = "")
        }
    }
}

