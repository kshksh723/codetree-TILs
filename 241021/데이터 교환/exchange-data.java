public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;

        int temp;
 
    // b에는 a값을 , c에는 b값을, a에는 c값을 넣어 출력
       temp = c; // temp에 7
      c = b; // c는 6
      b = a;
      a = temp; //a에 7


      

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}