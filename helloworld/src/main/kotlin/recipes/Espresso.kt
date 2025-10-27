package recipes

import com.diacht.ktest.Product
import com.diacht.ktest.Receipt
import com.diacht.ktest.WATER
import com.diacht.ktest.caffe.COFFEE
import com.diacht.ktest.caffe.ESPRESSO
import java.util.concurrent.TimeUnit

object Espresso : Receipt(
    products = listOf(
        Product(type = COFFEE, count = 7),
        Product(type = WATER, count = 25),
    ),
    time = 5,
    timeUnit = TimeUnit.SECONDS,
    outProductType = ESPRESSO,
    price = 25,
) {
}