package project

fun main() {
	createBoard()
}

fun createBoard() {
	val m = MutableList(9) { MutableList(9) {". "} }
	val numOfMines = 9

	for (i in 0 until m.size) {
		for (j in 0 until m[i].size) {
			val randNum = (0..8).random()
			when (j) {
				randNum -> m[i][j] = "X "
			}
			print(m[i][j])
		}
		println()
	}
}

fun addMines(board : MutableList<Int>, numOfMines : Int) {

}