import com.diacht.ktest.compose.startTestUi
import org.example.helloworld.BuildConfig
import kotlin.math.abs
import kotlin.math.ln
import kotlin.math.sin

fun seed(): String = "vadim-yevtushenko"

fun labNumber() : Int = BuildConfig.LAB_NUMBER

    fun main(args: Array<String>) {
        println("Лабораторна робота №${labNumber()} користувача ${seed()}")
        startTestUi(seed(), labNumber())

        println(iCalculate(98, 53, -25, -62, -102))
        println(dCalculate(-40.46, -19.25, -132.98, 46.06, -146.25))
        println(strCalculate("ATGCJA", "ATGTJC"))
    }

fun iCalculate(x0 : Int, x1 : Int, x2 : Int, x3 : Int, x4 : Int) : Double {
    val maxAbs = maxOf(abs(x0), abs(x1), abs(x2), abs(x3), abs(x4))
    return sin(maxAbs.toDouble())
}

fun dCalculate(x0 : Double, x1 : Double, x2 : Double, x3 : Double, x4 : Double) : Double {
    val maxAbs = maxOf(abs(x0), abs(x1), abs(x2), abs(x3), abs(x4))
    return ln(maxAbs)
}

fun strCalculate(x0 : String, x1 : String) : Int {
    var count = 0

    for (i in x0.indices) {
        val x0Char = x0[i]
        val x1Char = x1[i]

        if (x0Char == 'A' || x0Char == 'C') {
            if (x0Char != x1Char) {
                count += if ((x0Char == 'C' && x1Char == 'T')) {
                    2
                } else {
                    1
                }
            }
        }
    }
    return count
}