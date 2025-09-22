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

        println(iCalculate())
        println(dCalculate())
        println(strCalculate("ATGCJA", "ATGTJC"))
    }

fun iCalculate(x0 : Int = 98,
               x1 : Int = 53,
               x2 : Int = -25,
               x3 : Int = -62,
               x4 : Int = -102) : Double {
    val maxAbs = maxOf(abs(x0), abs(x1), abs(x2), abs(x3), abs(x4))
    return sin(maxAbs.toDouble())
}

fun dCalculate(x0 : Double = -40.46,
               x1 : Double = -19.25,
               x2 : Double = -132.98,
               x3 : Double = 46.06,
               x4 : Double = -146.25) : Double {
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