package Stack.With.Array;

import java.util.List;

public class StackThree {
    private int size;
    private Integer arr[];
    private int top;

    public StackThree(int s){
         this.size = s;
         Integer arr[] = new Integer[s];
         top = -1;
     }
     // какие методы я хочу?
    // 1) addElement
    // 2) popElement
    // 3) isEmpty
    // 4) ifFull
     public boolean isEmpty(){
         if(top ==-1){
             System.out.println("Stack is empty now: "+ top);
             return true;
         }
         else{
             return false;
         }
     }
     public void addElement(int element){
         top =top + 1;
         arr[top] = element;
         System.out.println("index now: "+ top);
     }

      public int popElemetn(){
         if(isEmpty()){
             System.out.println(" Stack is empty: "+ top);
             return  0;
         } else {
             System.out.println("удален индекс: " + top);
             return arr[top--];

         }
      }
      public int isFull(){
          System.out.println("Stack is full: "+ top);
         return arr[top-1];
      }
      public int getSize(){
         return  size;
      }
      public void setSize() {
          this.size = size;
      }

    public static void main(String[] args) {
        StackThree stackArr = new StackThree(3);
        stackArr.addElement(1);
        stackArr.addElement(2);
        stackArr.addElement(3);
        System.out.println(stackArr);

        System.out.println(stackArr.isEmpty());
        System.out.println(stackArr.popElemetn());
    }

}
