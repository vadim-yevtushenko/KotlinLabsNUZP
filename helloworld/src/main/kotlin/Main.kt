import com.diacht.ktest.compose.startTestUi
import kotlinx.coroutines.*
import org.example.helloworld.BuildConfig
import java.net.URL
import kotlin.math.sqrt

fun seed(): String = "vadim-yevtushenko"

fun labNumber(): Int = BuildConfig.LAB_NUMBER

suspend fun serverDataCalculate(strList: List<String>): Double {
    if (strList.size < 6) {
        throw RuntimeException("Expected list size: 6")
    }
    val numbers = fetchDataFromServer(strList)
    val mult = numbers.fold(1.0){ acc, value ->
        acc * value
    }

    return sqrt(mult)
}

suspend fun getNumberFromServer(message: String): Int {
    return withContext(Dispatchers.IO) {
        val url = URL("http://diacht.2vsoft.com/api/send-number?message=$message")
        val connection = url.openConnection()
        connection.connect()
        val input = connection.getInputStream()
        val buffer = ByteArray(128)
        val bytesRead = input.read(buffer)
        input.close()
        String(buffer, 0, bytesRead).toInt()
    }
}

suspend fun fetchDataFromServer(strList: List<String>): List<Int> = coroutineScope {
    val deferredList = strList.map {
        async { getNumberFromServer(it) }
    }
    return@coroutineScope deferredList.awaitAll()
}

fun main(args: Array<String>) {
    println("Лабораторна робота №${labNumber()} користувача ${seed()}")
        startTestUi(seed(), labNumber())

}
