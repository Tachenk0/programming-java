
public class Main {
    public static void main(String[] args){
        System.out.println("hello");
        rectangle r1= new rectangle();
        rectangle r2= new rectangle(3,4);
        System.out.println(r1);
        System.out.println(r2);
        rectangle[] rectArr= new rectangle[10];
        rectArr[0]= new rectangle(1,3);
        rectArr[1]= new rectangle(3,1);
        rectArr[2]= new rectangle(4,5);
        rectArr[3]= new rectangle(10,3);
        rectArr[4]= new rectangle(2,3);
        rectArr[5]= new rectangle(3,8);
        rectArr[6]= new rectangle(4,7);
        rectArr[7]= new rectangle(2,1);
        rectArr[8]= new rectangle(1,4);
        rectArr[9]= new rectangle(1,7);

        for (int i=0;i<rectArr.length; i++){
            System.out.println(rectArr[i]);
        }
    }
}