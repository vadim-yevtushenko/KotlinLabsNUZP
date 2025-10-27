package recipes

import com.diacht.ktest.Product
import com.diacht.ktest.Receipt
import com.diacht.ktest.SUGAR
import com.diacht.ktest.WATER
import com.diacht.ktest.caffe.COFFEE
import com.diacht.ktest.caffe.LATE
import com.diacht.ktest.caffe.MILK
import java.util.concurrent.TimeUnit

object Late : Receipt(
    products = listOf(
        Product(type = COFFEE, count = 10),
        Product(type = MILK, count = 150),
        Product(type = SUGAR, count = 14),
        Product(type = WATER, count = 50),
    ),
    time = 10,
    timeUnit = TimeUnit.SECONDS,
    outProductType = LATE,
    price = 40,
)