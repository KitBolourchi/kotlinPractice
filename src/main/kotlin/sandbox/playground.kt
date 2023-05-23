package sandbox

fun main() {
	val myList = MutableList(5) { readln().toInt() }

	println(myList[myList.lastIndex])
}