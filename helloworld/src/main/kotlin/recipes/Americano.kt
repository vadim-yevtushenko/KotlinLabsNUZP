package recipes

import com.diacht.ktest.Product
import com.diacht.ktest.Receipt
import com.diacht.ktest.SUGAR
import com.diacht.ktest.WATER
import com.diacht.ktest.caffe.AMERICANO
import com.diacht.ktest.caffe.COFFEE
import java.util.concurrent.TimeUnit

object Americano : Receipt(
    products = listOf(
        Product(type = COFFEE, count = 7),
        Product(type = SUGAR, count = 7),
        Product(type = WATER, count = 120),
    ),
    time = 6,
    timeUnit = TimeUnit.SECONDS,
    outProductType = AMERICANO,
    price = 30,
)