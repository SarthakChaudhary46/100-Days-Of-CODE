
## **576. Out of Boundary Paths**

There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.

Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.

 

Example 1:

![image](https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/64e51b36-58f8-4ac5-9601-a50d72c683e6)


Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0\
Output: 6

Example 2:

![image](https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/97e8eca2-d960-48a6-aa2d-e7c103910153)


Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1\
Output: 12
 

Constraints:

1 <= m, n <= 50\
0 <= maxMove <= 50\
0 <= startRow < m\
0 <= startColumn < n
