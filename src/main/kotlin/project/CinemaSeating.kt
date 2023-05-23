package project

const val SEATS = 8
const val ROWS = 9

fun main() {
	println("Cinema:")
	for (row in 0..ROWS) {
		if (row == 0 ) {
			println("  1  2  3  4  5  6  7  8")
		} else {
			println("$row S  S  S  S  S  S  S  S")
		}
	}
	calculateTicketPrices(SEATS, ROWS)

	var i = 0
	while (i < 10) {
		i++
		if (i % 2 == 0) {
			print("$i ")
		}
	}
}

fun calculateTicketPrices(seat: Int, row: Int) {
	val totalSeats = seat * row
	var totalCost = 0
	if (totalSeats < 60) {
		totalCost += totalSeats * 10
	} else {
		totalCost += ((row / 2) * seat) * 10 + ((row - (row / 2)) * seat) * 8
	}
	print(totalCost)
}
