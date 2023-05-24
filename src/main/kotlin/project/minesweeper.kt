package project

fun main() {
	val m = createBoard()
	addMinesToBoard(m,15)

	for (i in 0 until m.size) {
		for (j in 0 until m[i].size) {
			print(m[i][j])
		}
		println()
	}
}

fun createBoard(): MutableList<MutableList<String>> {
	return MutableList(9) { MutableList(9) {". "}}
}

fun addMinesToBoard(board : MutableList<MutableList<String>>, num : Int) {
	var numOfMines = num
	while (numOfMines > 0) {
		for (i in 0 until board.size) {
			for (j in 0 until board.size) {
				val randNum = (0..20).random()
				if (randNum % 6 == 0 && numOfMines > 0 && board[i][j] == ". ") {
					board[i][j] = "X "
					numOfMines--
				}
			}
		}
	}
}

fun checkNeighbours() {

}