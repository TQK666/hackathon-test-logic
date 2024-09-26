fun getItem(value1: Int, weight1: Int, value2: Int, weight2: Int, maxWeight: Int): Int {
    return when {
        weight1 + weight2 <= maxWeight -> value1 + value2
        maxWeight in weight1..<weight2 -> value1
        maxWeight in weight2..<weight1 -> value2
        weight1 > maxWeight && weight2 > maxWeight -> 0
        else -> if (value1 > value2) value1 else value2
    }
}

fun main() {
    val result = getItem(10, 5, 6, 4, 8) // expect 10
    val result1 = getItem(10, 5, 6, 4, 9) // expect 16
    val result2 = getItem(5, 3, 7, 4, 6) // expect 7
    val result3 = getItem(3, 5, 3, 8, 10) // expect 3
    println(result)
    println(result1)
    println(result2)
    println(result3)
}