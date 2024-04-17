# 988.Smallest String Starting From Leaf

You are given the root of a binary tree where each node has a value in the range [0, 25] representing the letters 'a' to 'z'.

Return the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

As a reminder, any shorter prefix of a string is lexicographically smaller.

For example, "ab" is lexicographically smaller than "aba".\
A leaf of a node is a node that has no children.

 

*Example 1:*\
<img width="359" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/01acdccc-45a9-4e82-bea0-8e11d038c60f">

- Input: root = [0,1,2,3,4,3,4]
- Output: "dba"

*Example 2:*\
<img width="357" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/e89b8539-4015-4504-8b80-9f1d04ca9474">

- Input: root = [25,1,3,1,3,0,2]
- Output: "adz"

*Example 3:*\
<img width="303" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/736b9827-38a4-439a-aff7-d9c5e897a0fd">

- Input: root = [2,2,1,null,1,0,null,0]
- Output: "abc"
 
*Constraints:*

- The number of nodes in the tree is in the range [1, 8500].
- 0 <= Node.val <= 25
