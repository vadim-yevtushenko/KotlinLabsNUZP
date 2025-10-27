package recipes

import com.diacht.ktest.Product
import com.diacht.ktest.Receipt
import com.diacht.ktest.SUGAR
import com.diacht.ktest.WATER
import com.diacht.ktest.caffe.AMERICANO_WI_MILK
import com.diacht.ktest.caffe.COFFEE
import com.diacht.ktest.caffe.MILK
import java.util.concurrent.TimeUnit

object AmericanoWithMilk : Receipt(
    products = listOf(
        Product(type = COFFEE, count = 7),
        Product(type = MILK, count = 30),
        Product(type = SUGAR, count = 14),
        Product(type = WATER, count = 90),
    ),
    time = 8,
    timeUnit = TimeUnit.SECONDS,
    outProductType = AMERICANO_WI_MILK,
    price = 35,
)