package operations

data class Worker(val id: Int, val name: String)

class Operations() {

    data class Product(val id: Int, val name: String, val price: Double)

    class Receipt(
        val id: Int,
        val seller: Worker,
        val products: List<Product>,
        val isPaid: Boolean = false
    )

    class Store(val receipts: List<Receipt>, val workers: List<Worker>)

    fun beer() = Product(id = 2, name = "Beer, light, 0.51", price = 7.5)
    fun coffee() = Product(id = 3, name = "Ground coffee 1kg", price = 10.0)
    fun bread() = Product(id = 1, name = "Gluten-free bread, 1kg", price = 5.0)

    fun main() {
        val firstWorker = Worker(id = 1, name = "Mert")
        val secondWorker = Worker(id = 2, name = "Mike")

        val store = Store(
            receipts = listOf(
                Receipt(
                    id = 1,
                    seller = firstWorker,
                    products = listOf(bread(), bread(), bread(), coffee(), beer()),
                    isPaid = true
                ),
                Receipt(
                    id = 2,
                    seller = secondWorker,
                    products = listOf(coffee(), coffee(), coffee(), bread()),
                    isPaid = false
                )
            ),
            workers = listOf(firstWorker, secondWorker)
        )

        val receipts = store.receipts // fetch the receipts
        val productsLists = receipts.map { it.products } // List<List<Product>>

        val allProducts = receipts.flatMap { it.products } // List<Product>
        println(allProducts)
        println(productsLists)

        val allProductsEarnings = receipts.flatMap { it.products }
            .map { it.price }
            .sumByDouble { it }
        println(allProductsEarnings)

        val paidReceipt = receipts.filter { it.isPaid }
        println(paidReceipt)

        val paidUnpaid = receipts.partition { it.isPaid }

        val (paid, unpaid) = paidUnpaid
        println(paid.toString())
        println(unpaid)

        val groupByWorker = receipts.groupBy { it.seller }
        println(groupByWorker.toString())

        val areThereNoReceipts = receipts.isEmpty()
        val areAllPaid = receipts.all { it.isPaid }
        val nonePaid = receipts.none { it.isPaid }
        val isAtLeastOnePaid = receipts.any { it.isPaid }

        println("areThereNoReceipts: $areThereNoReceipts , areAllPaid: $areAllPaid , nonePaid: $nonePaid , isAtLeastOnePaid: $isAtLeastOnePaid ")

    }
}

