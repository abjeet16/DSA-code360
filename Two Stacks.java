import java.util.* ;
import java.io.*; 
public class TwoStack {
	int[] stack;
	int len;
	int t1,t2;
	// Initialize TwoStack.
	public TwoStack(int s) {
		// Write your code here
		stack = new int[s];
		len = s;
		t1 = -1;
		t2 = s;
	}

	// Push in stack 1.
	public void push1(int num) {
		// Write your code here
		if(t1+1<len&&t1+1<t2){
			stack[++t1] = num;
		}
	}

	// Push in stack 2.
	public void push2(int num) {
		// Write your code here
		if(t2-1>0&&t2-1>t1){
			stack[--t2] = num;
		}
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		// Write your code here
		if(t1<0)return -1;
		return stack[t1--];
	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
		if(t2==len)return -1;
		return stack[t2++];
	}

}
