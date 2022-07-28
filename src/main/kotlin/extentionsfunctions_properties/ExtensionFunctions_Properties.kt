package extentionsfunctions_properties
//https://tourspace.tistory.com/114 (코틀린 null체크)
fun main() {

    val order = Order(listOf(Item("Bread", 0.0F), Item("Wine", 0.0F), Item("Water", 0.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    println(null.ifNullPrintStringNull())
    println("this is not Null".ifNullPrintStringNull())

}

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

/**
 * 확장함수
 * 1) maxPricedItemValue : Float를 반환하며, Items properties 의 최대값을 구하고 없으면 null을 반환 > price가 null일수 있으며, null일 경우 0F를 default 값으로 지정
 * 2) maxPricedItemName : 마찬가지이며, price가 null 일수 있으며, name이 null일 경우 NO_PRODUCTS를 반환
 */
fun Order.maxPricedItemValue() : Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

/**
 * List를 문자열로 나열하며, joinToString() 괄호안헤 seperator가 들어감. 안들어가 면 ','가 디폴트 인듯
 */
val Order.commaDelimitedItemNames: String
    get() = items.joinToString { it.name }

/**
 * 확장함수(Null 체크)
 * 제네릭 타입으로 null이 들어오며, null일 경우 null을 리턴하는 확장함수
 */
fun <T> T?.ifNullPrintStringNull() = this?.toString() ?: "NULL"