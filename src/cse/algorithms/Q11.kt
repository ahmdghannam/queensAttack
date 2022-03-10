package cse.algorithms

import java.util.*


object Q1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val t = scanner.nextInt()
        val cases: Array<ArrayList<*>> = arrayOf()
        for (i in 0 until t) {
            val n = scanner.nextInt()
            val locations = ArrayList<Int>()
            for (j in 0 until n) {
                val s = scanner.nextInt()
                locations.add(s)
            }
            cases[i] = locations
        }
        for (aCase in cases) {
            sol(aCase as ArrayList<Int>)
        }
    }

    private fun sol(locations: ArrayList<Int>) {
        var lastOne = 0
        var total = 0
        for (i in 1 until locations.size) if (locations[i] == 1) {
            total += if (i - lastOne > 1) i - lastOne else 0
            lastOne = i
        }
        println(total)
    }
}
