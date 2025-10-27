import com.diacht.ktest.FactoryItf
import com.diacht.ktest.Product
import com.diacht.ktest.ProductType
import recipes.*

class CoffeeShop : FactoryItf() {

    private val storage : StorageImpl = StorageImpl()
    private val cafeMachine : CafeMachine = CafeMachine(storage)
    private val recipes = listOf(Americano, AmericanoWithMilk, Cacao, Cappuccino, Espresso, Late)
    private var earnings = 0

    override fun resetSimulation() {
        storage.resetSimulation()
        earnings = 0
    }

    override fun loadProducts(productsFromSupplier: List<Product>) {
        productsFromSupplier.forEach { prod -> storage.addProduct(prod) }

    }

    override fun order(order: List<Pair<ProductType, Int>>): List<Product> {
        for (prod in order){
            for (i in 1..prod.second){
                recipes.find { recipe -> recipe.outProductType === prod.first }?.
                    let {
                        cafeMachine.setReceipt(it)
                        earnings += it.price
                    }
                cafeMachine.executeProcess()
            }
        }
        return order.map { prod -> Product(prod.first, prod.second) }
    }

    override fun getLeftovers(): List<Product> {
        return storage.getLeftovers()
    }

    override fun getEarnings(): Int {
        return earnings
    }

}