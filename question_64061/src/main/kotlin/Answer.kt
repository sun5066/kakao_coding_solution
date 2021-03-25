class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = ArrayList<Int>()
        var index = 0

        moves.forEach { move ->
            run loop@{
                board.forEach {
                    index = move - 1

                    if (it[index] != 0) {
                        if (basket.isNotEmpty() && basket.last() == it[index]) {
                            basket.removeAt((basket.size - 1))
                            answer += 2
                        } else basket.add(it[index])

                        it[index] = 0
                        return@loop
                    }
                }
            }
        }
        return answer
    }
}
