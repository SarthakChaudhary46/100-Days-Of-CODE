# 143.Reorder List

You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln\
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …\
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

*Example 1:*
<img width="317" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/3b6a43d8-7742-4fe7-af70-11bd59a2a759">


- Input: head = [1,2,3,4]
- Output: [1,4,2,3]

*Example 2:*
<img width="386" alt="image" src="https://github.com/SarthakChaudhary46/100-Days-Of-CODE/assets/86872379/8b366cd8-db69-4861-a220-a33f33e55f17">

- Input: head = [1,2,3,4,5]
- Output: [1,5,2,4,3]
 

*Constraints:*

- The number of nodes in the list is in the range [1, 5 * 104].
- 1 <= Node.val <= 1000
