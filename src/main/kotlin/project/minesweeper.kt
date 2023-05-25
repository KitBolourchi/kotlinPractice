package project

fun main() {
	val m = createBoard()
	addMinesToBoard(m,15)
	checkNeighbours(m)


	for (i in 0 until m.size) {
		for (j in 0 until m[i].size) {
			print(m[i][j])
		}
		println()
	}
}

fun createBoard(): MutableList<MutableList<String>> {
	val board = MutableList(11) { MutableList(21) {". "}}
	for (i in 0 until board.size) {
		for (j in 0 until board[i].size) {
			if (i == 0 || i == 11 || j == 0 || j == 21) {
				board[i][j] = ""
			}
		}
	}
	return board
}

fun addMinesToBoard(board : MutableList<MutableList<String>>, num : Int) {
	var numOfMines = num
	while (numOfMines > 0) {
		val randomCol = (1..10).random()
		val randomRow = (1..20).random()
		if (board[randomCol][randomRow] == ". ") {
			board[randomCol][randomRow] = "X "
			numOfMines--
		}
	}
}

fun checkNeighbours(board : MutableList<MutableList<String>>) {
	for (i in 1 until board.size-1) {
		for (j in 1 until board[i].size-1) {
			var numberOfLocalMines = 0
			if (board[i][j] == ". ") {
				if (board[i][j + 1] == "X ") numberOfLocalMines++
				if (board[i + 1][j + 1] == "X ") numberOfLocalMines++
				if (board[i + 1][j] == "X ") numberOfLocalMines++
				if (board[i + 1][j - 1] == "X ") numberOfLocalMines++
				if (board[i][j - 1] == "X ") numberOfLocalMines++
				if (board[i - 1][j - 1] == "X ") numberOfLocalMines++
				if (board[i - 1][j] == "X ") numberOfLocalMines++
				if (board[i - 1][j + 1] == "X ") numberOfLocalMines++
			}
			if (numberOfLocalMines > 0) board[i][j] = "$numberOfLocalMines "
		}
	}

}