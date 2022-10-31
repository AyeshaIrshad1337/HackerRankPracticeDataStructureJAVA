public class StackArray {
     private int arr[];
     private int top;
     private int size;
     StackArray(int size){
         arr=new int[size];
         top=-1;
         this.size = size;
     }
     public boolean isEmpty(){
   return top==-1;
     }
     public boolean isFull(){return top==size-1;}
    public void push(int x){
         if(isFull()){
             System.out.println("Stack Overflow");
             return;
         }
         arr[++top] = x;
      }
      public int pop() {
          if (isEmpty()) {
              return -1;
          }
          return arr[top--];
      }
    public static void main(String[] args) {
       StackArray arr = new StackArray(10);
       arr.push(1);
       arr.push(2);
       arr.push(3);
       arr.push(4);
       arr.push(5);
       arr.push(6);
       arr.push(7);
       arr.push(8);
       arr.push(9);
       arr.push(10);
        System.out.println(arr.pop());
    }
}
