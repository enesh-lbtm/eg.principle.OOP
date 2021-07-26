package method.examples;

public class MinMaxExample {
                                        //ЭТО БЫЛ МОЙ ВАРИАНТ НЕ ОПТИМИЗИРОАВННЫЙ!!!!!!
//    public static void main(String ... args){
//        Search s = new Search();
//        s.max(9,9);
//    }
//

    //ОПТИМИЗИРОВАННЫЙ ВАРИАНТ!!! НО НЕ МОЙ!!!
    static  int max(int a, int b){
        if(a > b){
            return a;
        }
        else if(a < b){
            return b;
        }
        else{
            System.out.println("number is equal, please, try again");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(max(9,9));
    }
}
class Search{
//    int max=0;
//
//    public void max(int a, int b){
//        if(a>b) {
//            max = a;
//            System.out.println("Max " + max);
//        }
//    else if(a<b){
//            max = b;
//            System.out.println("max "+ max);
//        }
//    else{
//            System.out.println("Обе цифры равны");
//        }
//    }
    //НЕ МОЙ ОПТИМИЗИРОВАННЫЙ ВАРИАНТ

}
