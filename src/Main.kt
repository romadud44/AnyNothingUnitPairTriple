fun main() {
    println("1 ЗАДАНИЕ")

    val strokeOne = "{([])}"
    val strokeTwo = "{([))}"
    val strokeThree = "{{[])}"
    println(checkStroke(strokeOne))
    println(checkStroke(strokeTwo))
    println(checkStroke(strokeThree))

    println("2 ЗАДАНИЕ")
    val array = intArrayOf(1, 2, 3)
    combinations(array)

}

fun checkStroke(input: String): Boolean {
    var result = true
    for (i in 0..<input.length / 2) {
        val pairSymbols = Pair(input[i], (input[input.length - (1 + i)]))
        if (pairSymbols == Pair('{', '}') || pairSymbols == Pair('[', ']') || pairSymbols == Pair('(', ')')) {
            result = true
        } else {
            result = false
            break
        }
    }
    return result
}

fun combinations(input: IntArray) {
    var inputArray = input.toMutableList()
    val buffer = input.toMutableList()
    for (i in input.indices) {
        for (j in input.indices) {
            if (j <= inputArray.size - 2) {
                buffer[j] = inputArray[j + 1].also { buffer[j + 1] = inputArray[j] }
                inputArray = buffer
                println(buffer)
            }
        }
    }
}




