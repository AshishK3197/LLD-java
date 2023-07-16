//class QueueUsingStack{
//    Stack <Integer> input = new Stack<>();
//    Stack <Integer> output = new Stack<>();
//
//    public QueueUsingStack(){
//
//    }
//
//    public void push(int x){
////        s1 -----> s2
//        while(input.empty() == false){
//            output.push(input.peek());
//            input.pop();
//        }
//
////        push(x) ----- > s1
//        input.push(x);
//
//
////        s2 ------>s1
//        while(output.empty() == false){
//            input.push(output.peek()); //to poeek and push that
//            output.pop();//remove that from stack top
//        }
//    }
//
//    public int pop(){
//        if (input.empty()){
//            System.out.println("Stack is empty");
//        }
//        int val = input.peek();
//        input.pop();
//        return val;
//    }
//    public int peek() {
//        // shift input to output
//        if (input.empty()) {
//            System.out.println("Stack is empty");
//
//        }
//        return input.peek();
//    }
//
//
//    int size() {
//        return input.size();
//    }
//
//}


class QueueUsingStack{
    Stack < Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();
    /** Initialize your data structure here. */
    public QueueUsingStack() {

    }

    public void push(int x) {
        System.out.println("The element pushed is " + x);
        input.push(x);
    }


    public int pop() {
        // shift input to output
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }


        int x = output.peek();
        output.pop();
        return x;
    }

    public int peek() {
        // shift input to output
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
        return output.peek();
    }
    int size() {
        return (output.size() + input.size());
    }


}


