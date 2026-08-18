/*****************************************************
  
  Following is the structure of Node.
  public static class Node {
    
    int data;
    Node next;

    Node(int data) {
      this . data = data;
      this . next = null;
    }
  }

*****************************************************/

import java.util.ArrayList;

public class Solution {
  public static Node removeLoop(Node head) {
    // Write your code here.
    Node slow = head;
    Node fast = head;
    while(fast!=null&&fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast)break;
    }
    if (fast == null || fast.next == null) {
        return head;
    }
    slow=head;
    while(slow!=fast){
      slow=slow.next;
      fast=fast.next;
    }
    Node start = slow;
    Node end = slow;
    while(end.next!=start){
      end = end.next;
    }
    end.next = null;
    return head;
  }
}
