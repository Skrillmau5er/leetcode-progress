/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
    for(let i = 0; i < 9; i++) {
        const rowVals = new Set()
        const colVals = new Set()
        const boxVals = new Set()
        for(let j = 0; j < 9; j++) {
            const rowItem = board[i][j]
            const colItem = board[j][i]
            const rowOffset = Math.floor(i/3) * 3
            const colOffset = i%3 * 3
            const boxItem = board[Math.floor(j/3) + rowOffset][j%3 + colOffset]

            if(rowItem !== '.') {
                if(rowVals.has(rowItem)) return false
                rowVals.add(rowItem)
            }

            if(colItem !== '.') {
                if(colVals.has(colItem)) return false
                colVals.add(colItem)
            }

            if(boxItem !== '.') {
                if(boxVals.has(boxItem)) return false
                boxVals.add(boxItem)
            }
        }
    }

    return true
};