import java.util.*


object SquareCounting {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val cases = scanner.nextInt()
        val arrayList = ArrayList<SandN>()
        for (i in 0 until cases) {
            val n = scanner.nextInt()
            val s = scanner.nextInt()
            arrayList.add(SandN(n, s))
        }
        for (o in arrayList) {
            println(o.numberOfSquares())
        }
    }

    class SandN(private val n: Int, private val s: Int) {
        fun numberOfSquares(): Int {
            return if (n != 0) s / (n * n) else 0
        }
    }
}
