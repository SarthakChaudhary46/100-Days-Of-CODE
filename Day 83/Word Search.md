# 79.Word Search

Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

*Example 1:*\
<img width="226" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/1d1802d5-13fa-4194-bc71-4f7962b593a3">


- Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
- Output: true

*Example 2:*\
<img width="226" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/a47d0af3-cd50-44e5-8a22-044462ff3d69">


- Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
- Output: true

*Example 3:*\
<img width="226" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/4dd8fbe6-cab0-431b-a45f-88427858b660">


- Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
- Output: false
 

*Constraints:*

- m == board.length
- n = board[i].length
- 1 <= m, n <= 6
- 1 <= word.length <= 15
- board and word consists of only lowercase and uppercase English letters.
 

Follow up: Could you use search pruning to make your solution faster with a larger board?
