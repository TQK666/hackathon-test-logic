fun maxTreasureValue(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    return when {
        // Case 1: Can take both items
        weight1 + weight2 <= maxW -> value1 + value2

        // Case 2: Can only take the first item
        maxW in weight1..<weight2 -> value1

        // Case 3: Can only take the second item
        maxW in weight2..<weight1 -> value2

        // Case 4: Can take either item, return the one with the higher value
        weight1 <= maxW && weight2 <= maxW -> maxOf(value1, value2)

        // Case 5: Can't take any item
        else -> 0
    }
}

fun main() {
    println(maxTreasureValue(10, 5, 6, 4, 8))  // Output: 10
    println(maxTreasureValue(10, 5, 6, 4, 9))  // Output: 16
    println(maxTreasureValue(5, 3, 7, 4, 6))   // Output: 7
}