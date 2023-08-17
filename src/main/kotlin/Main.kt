fun main() {
    var price = 11_000
    var regularClient = true
    var totalDiscount = 0
    val consumerDiscount = 5
    val consumerDiscount100 = 100
    val regularClientDiscount = 1

    if (price >= 0 && price <= 1_000) {
        totalDiscount = price
    } else if (price >= 1_001 && price <= 10_000) {
        totalDiscount = price - consumerDiscount100
    } else if (price >= 10_001) {
        totalDiscount = price - (price * consumerDiscount / 100)
    }

    if (regularClient) {
        totalDiscount = totalDiscount - (totalDiscount * regularClientDiscount / 100)
    }
    println("Сумма Вашей покупки: $price руб. \nCкидка: ${price - totalDiscount} руб. \nСумма покупки со скидкой: $totalDiscount руб.")
}
