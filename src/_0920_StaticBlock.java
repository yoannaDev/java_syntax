// 정적 변수의 초기화가 복잡할 때 정적 블록 사용
public class _0920_StaticBlock {
    static int sumOneToTen;

    static {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        sumOneToTen = sum;
    }
    public static void main(String[] args){
        System.out.println(sumOneToTen);

    }
}
