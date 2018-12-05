package Stack;

public class test {
    public static void main(String[] args) {
       StackByArray stack = new StackByArray();
       stack.push(3);
       stack.push(2);

       //stack.pop();
       stack.show();
System.out.println("--------------------------------");
        StackByArray2 stackByArray2 = new StackByArray2(2);
        stackByArray2.push(1);
        stackByArray2.push(2);
        stackByArray2.pop();

        System.out.println(2);
        System.out.println(3);
    }
}
