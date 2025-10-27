import com.diacht.ktest.*
import com.diacht.ktest.caffe.CACAO_POWDER
import com.diacht.ktest.caffe.COFFEE
import com.diacht.ktest.caffe.MILK

class StorageImpl : Storage {

    private var products : MutableMap<ProductType, Int> = mutableMapOf(
        MILK to 120,
        COFFEE to 130,
        SUGAR to 140,
        CACAO_POWDER to 110,
        WATER to 1000
        )

    override fun addProduct(product: Product) {
        products.merge(product.type, product.count) {
            current, new -> current + new
        }
    }

    override fun checkProductCount(type: ProductType): Int {
        return products[type]!!
    }

    override fun getProduct(productType: ProductType, count: Int): Product {
        if (products[productType]!! < 0){
            throw IllegalStateException()
        }
        products.merge(productType, count) {
                current, new -> current - new
        }
        return Product(productType, count)
    }

    override fun getLeftovers(): List<Product> {
        return products.map { (type, count) -> Product(type, count) }
    }

    override fun resetSimulation() {
        products = mutableMapOf()
    }
}