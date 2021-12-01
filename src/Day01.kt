fun main() {
    fun part1(input: List<Int>) = input.windowed(2).count {
        it[1] > it[0]
    }

    fun part2(input: List<Int>) = input.windowed(3).windowed(2).count {
        it[1].sum() > it[0].sum()
    }

    val input = readInput("Day01").map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
