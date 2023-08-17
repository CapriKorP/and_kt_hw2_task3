fun main() {
    var price = 10_001
    var regularClient = false
    var totalPrice = 0
    var regularDiscount = 0
    val consumerDiscount = 5
    val consumerDiscount100 = 100
    val regularClientDiscount = 1

    if (price >= 0 && price <= 1_000) {
        totalPrice = price                                      //Нет скидки
    } else if (price >= 1_001 && price <= 10_000) {
        totalPrice = price - consumerDiscount100                //Скидка 100 руб
    } else if (price >= 10_001) {
        totalPrice = price - (price * consumerDiscount / 100)   //Скидка 5%
    }

    if (regularClient) {
        regularDiscount = price * regularClientDiscount / 100   //Расчет скидки постоянного клиента
    }

    totalPrice -= regularDiscount    //Суммирование скидки постоянного клиента с другими скидками(если есть))

    println("Сумма Вашей покупки: $price руб. \nCкидка: ${price - totalPrice} руб. \nСумма покупки со скидкой: $totalPrice руб.")
}
