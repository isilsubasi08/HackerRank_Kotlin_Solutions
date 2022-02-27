package com.example.solutions

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    // Write your code here

    var tip : Double = meal_cost*tip_percent/100
    var tax : Double =meal_cost*tax_percent/100

    var total_cost : Int = Math.round(tip + tax + meal_cost).toInt()

    println(total_cost)





}

fun main(args: Array<String>) {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}