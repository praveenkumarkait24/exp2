package com.example.visitingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                VisitingCard()
            }
        }
    }
}

@Composable
fun VisitingCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFBBDEFB)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Color(0xFFE3F2FD)
                        )
                        .padding(24.dp)
                ) {
                    // --------------------------------
                    // Company Logo - Top Right
                    // --------------------------------
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.logo
                            ),
                            contentDescription = "Company Logo",
                            modifier = Modifier.size(70.dp),
                            contentScale = ContentScale.Fit
                        )
                    }

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    // --------------------------------
                    // Company Name
                    // --------------------------------
                    Text(
                        text = "BIT",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF0D47A1)
                    )

                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )

                    // --------------------------------
                    // Employee Name
                    // --------------------------------
                    Text(
                        text = "DEEPA SUMATHI M",
                        fontSize = 21.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1565C0)
                    )

                    Spacer(
                        modifier = Modifier.height(5.dp)
                    )

                    // --------------------------------
                    // Job Title
                    // --------------------------------
                    Text(
                        text = "Assistant Professor",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.DarkGray
                    )

                    Spacer(
                        modifier = Modifier.height(15.dp)
                    )

                    // --------------------------------
                    // Horizontal Line
                    // --------------------------------
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(
                                Color(0xFF1565C0)
                            )
                    )

                    Spacer(
                        modifier = Modifier.height(18.dp)
                    )

                    // --------------------------------
                    // Phone
                    // --------------------------------
                    ContactInformation(
                        label = "Phone",
                        value = "+91 78688 33899"
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    // --------------------------------
                    // Address
                    // --------------------------------
                    ContactInformation(
                        label = "Address",
                        value = "Erode, Tamil Nadu, India"
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    // --------------------------------
                    // Email
                    // --------------------------------
                    ContactInformation(
                        label = "Email",
                        value = "deepasumathim@bitsathy.ac.in"
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    // --------------------------------
                    // Fax
                    // --------------------------------
                    ContactInformation(
                        label = "Fax",
                        value = "+91 44 1234 5678"
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    // --------------------------------
                    // Website
                    // --------------------------------
                    ContactInformation(
                        label = "Website",
                        value = "www.appdevelopment.com"
                    )
                }
            }
        }
    }
}

@Composable
fun ContactInformation(
    label: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "$label:",
            modifier = Modifier.size(
                width = 75.dp,
                height = 30.dp
            ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1565C0)
        )
        Text(
            text = value,
            modifier = Modifier.weight(1f),
            fontSize = 14.sp,
            color = Color(0xFF333333)
        )
    }
}
