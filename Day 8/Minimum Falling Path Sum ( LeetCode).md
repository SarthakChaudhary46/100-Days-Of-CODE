## 931. Minimum Falling Path Sum

Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

 

Example 1:

![image](https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/44965e32-18d1-459d-8292-b46af2f9fc98)



Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]\
Output: 13\
Explanation: There are two falling paths with a minimum sum as shown.


Example 2:

![image](https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/c2523af6-7ce5-4c91-a061-91919aa32f39)

Input: matrix = [[-19,57],[-40,-5]]\
Output: -59\
Explanation: The falling path with a minimum sum is shown.
 

Constraints:

n == matrix.length == matrix[i].length\
1 <= n <= 100\
-100 <= matrix[i][j] <= 100
