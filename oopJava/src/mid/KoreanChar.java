package oopJava.src.mid;

public class KoreanChar {
    public static void main(String[] args) {
        int currentUniCode = 0xAC00;//44032 / 가
        int cnt = 1;

        do {
            //int 변수에 유니코드를 16진수 값으로 담았으므로 char로 형변환.
            System.out.print((char) currentUniCode);
            currentUniCode++;

            //다음 자음으로 넘어갈때 588이 더해지는 규칙이 있으므로, cnt를 곱했을때 currentUniCode와 같다면 개행.
            if(0xAC00 + (588 * cnt) == currentUniCode) {
                cnt++;
                System.out.println("---------");
            }
        }while (currentUniCode <= 0xD7A3);//currentUniCode 가 '힣'과 같아질때까지 반복
    }
}