fun main() {
    fun part1(input: List<Pair<String, Int>>): Int {
        var horizontal = 0
        var depth = 0

        input.forEach {
            when (it.first) {
                "forward" -> horizontal += it.second
                "down" -> depth += it.second
                "up" -> depth -= it.second

            }
        }
        return horizontal * depth
    }

    fun part2(input: List<Pair<String, Int>>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0

        input.forEach {
            when (it.first) {
                "forward" -> {
                    horizontal += it.second
                    depth += (aim * it.second)
                }
                "down" -> aim += it.second
                "up" -> aim -= it.second

            }
        }
        return horizontal * depth
    }

    val input = readInput("Day02").map {
        val split = it.split(' ')
        split[0] to split[1].toInt()
    }

    println(part1(input))
    println(part2(input))
}
