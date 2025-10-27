package recipes

import com.diacht.ktest.Product
import com.diacht.ktest.Receipt
import com.diacht.ktest.SUGAR
import com.diacht.ktest.WATER
import com.diacht.ktest.caffe.CACAO_DRINK
import com.diacht.ktest.caffe.CACAO_POWDER
import com.diacht.ktest.caffe.MILK
import java.util.concurrent.TimeUnit

object Cacao : Receipt(
    products = listOf(
        Product(type = CACAO_POWDER, count = 13),
        Product(type = MILK, count = 180),
        Product(type = SUGAR, count = 25),
        Product(type = WATER, count = 30),
    ),
    time = 9,
    timeUnit = TimeUnit.SECONDS,
    outProductType = CACAO_DRINK,
    price = 40,
)