package com.app.lawyerly.data

/**
 * Entity class to hold lawyer specific information
 */
data class LawyerEntity (
    val name: String,
    val speciality: String,
    val stars: String,
    val rate: String,
    val isVerified: Boolean
)