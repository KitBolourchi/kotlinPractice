const val SEATS = 8
const val ROWS = 7

fun main() {
	println("Cinema:")
	for (row in 0..ROWS) {
		if (row == 0 ) {
			println("  1  2  3  4  5  6  7  8")
		} else {
			println("$row S  S  S  S  S  S  S  S")
		}
	}
}