# Assignment2
Arraylist and Linkedlist classes (implementations of ArrayList and LinkedList respectively)

     MyArraylist:
- Was used instance variable of type Object[].
- size: keeps track of the number of items in the list.
- add(T element): adds a new element at the list's conclusion. If the array is not large enough to contain the new element, the elements from the original array are copied over to a new array that is twice as big as the original array.
- get(int ind): returns the element by the specified index.
- remove(int ind): removes an element at the specified index, shifting all subsequent elements to the left by one position and decreasing the size variable.
- size(): returns the size variable.
 And other methods.
      MyLinkedlist:
- Defined variables: head, tail, and inner class Node.
- Defined an int variable size: keeps track of the number of items in the list.
- add(E element): Creates a new node containing the supplied element, sets its prior reference to the existing tail, sets its next reference to null (because it will be the new tail), and adds the specified element to the end of the list. Sets the head and tail references to the new node if the list is empty. If not, update the tail reference to the new node and set the next reference of the existing tail to the new node. increases the size variable to finish.
- get(int index):   traversing the list from the head and returns the element at the specified index.
- remove(int index): updates the next and previous references of the surrounding nodes to remove the node from the list, and reduce the size variable.
- size(): returns the size variable.
And other methods.
