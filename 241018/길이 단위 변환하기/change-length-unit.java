public class Main {
    public static void main(String[] args) {
        //1피트(ft)는 30.48cm이고 1마일(mi)은 160934cm입니다. 
        // 변수 선언
        double a = 9.2; //9.2피트
	    double b = 1.3; // 1.3마일

        // 출력
        System.out.printf("%.1fft = %.1fcm\n%.1fmi = %.1fcm", a, a*30.48, b, b*160934); // 피트 수에 제시된 값 곱하기
    }
}
// %.1fft = %.1fcm은 피트(feet)를 센티미터(cm)로 변환하는 공식 

// %.1fmi = %.1fcm은 마일(mile)을 센티미터(cm)로 변환하는 공식