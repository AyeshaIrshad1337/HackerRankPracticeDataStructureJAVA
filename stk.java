import java.util.ArrayList;

public class stk {
   public static ArrayList<Integer> list= new ArrayList<Integer>();
    public static boolean isEmpty(){
            return list.size()==0;
}
    public static void push (int data) {
     list.add(data);
    }
 public static int pop(){
     if(isEmpty()){return -1;}
     int top = list.get(list.size()-1);
     list.remove(list.size()-1);
     return top;
    }
 public static int peek(){
    if(isEmpty()){return -1;}
     return stk.pop();

   }
   static void AtBottom(int data, ArrayList<Integer> list){
        if (list.isEmpty()){
            push(data);
            return;
        }
        int top = pop();
        AtBottom(data,list);
        push(top);
   }
   public static void reverse(ArrayList<Integer> list){
        if(isEmpty()){
            return;
        }
        int x = stk.pop();
        reverse(list);
        stk.AtBottom(x, list);
   }
public static void main(String[] args) {

        push(1);
  push(2);
    push(3);


    reverse(stk.list);

    System.out.println(pop());
    System.out.println(pop());
    System.out.println(pop());

}
}
