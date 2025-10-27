import com.diacht.ktest.FactoryItf
import com.diacht.ktest.compose.startTestUi
import org.example.helloworld.BuildConfig

fun seed(): String = "vadim-yevtushenko"

fun labNumber() : Int = BuildConfig.LAB_NUMBER

fun getSimulationObject(): FactoryItf {
    return CoffeeShop()
}

    fun main(args: Array<String>) {
        println("Лабораторна робота №${labNumber()} користувача ${seed()}")
        startTestUi(seed(), labNumber())

    }
