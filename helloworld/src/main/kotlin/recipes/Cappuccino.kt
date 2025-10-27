package recipes

import com.diacht.ktest.Product
import com.diacht.ktest.Receipt
import com.diacht.ktest.SUGAR
import com.diacht.ktest.WATER
import com.diacht.ktest.caffe.CAPPUCCINO
import com.diacht.ktest.caffe.COFFEE
import com.diacht.ktest.caffe.MILK
import java.util.concurrent.TimeUnit

object Cappuccino : Receipt(
    products = listOf(
        Product(type = COFFEE, count = 9),
        Product(type = MILK, count = 50),
        Product(type = SUGAR, count = 7),
        Product(type = WATER, count = 110),
    ),
    time = 10,
    timeUnit = TimeUnit.SECONDS,
    outProductType = CAPPUCCINO,
    price = 30,
)