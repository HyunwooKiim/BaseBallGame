import java.util.Scanner;
import java.util.Random;
public class BaseBallGameProject0511 {

        public static void main(String[] args) {

            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            int always = 1;

            int[] ans = {random.nextInt(10), random.nextInt(10), random.nextInt(10)};
            for (int i = 0; i < 3; i++) {
                while (always == 1) {
                    if (ans[i] == 0) {
                        ans[i] = random.nextInt(9);
                    } else {
                        break;
                    }
                }
                if (i == 1) {
                    while (always == 1) {
                        if (ans[i] == ans[0] || ans[i] == 0) {
                            ans[i] = random.nextInt(9);
                        } else {
                            break;
                        }
                    }
                } else if (i == 2) {
                    while (always == 1) {
                        if (ans[i] == ans[1] || ans[i] == ans[0] || ans[i] == 0) {
                            ans[i] = random.nextInt(9);
                        } else {
                            break;
                        }
                    }
                }
                //System.out.print(ans[i] + " ");
            }
            int life = 9;
            System.out.println("--야구게임--");
            System.out.println("숫자 세개를 입력하시오.");
            while (life > 0) {
                System.out.println("");
                int strike = 0;
                int ball = 0;
                int[] gus = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
                for (int i = 0; i < 3; i++) {
                    if (gus[i] == ans[i]) {
                        strike++;
                    } else if (i == 0) {
                        if (gus[0] == ans[1] || gus[0] == ans[2]) {
                            ball++;
                        }
                    } else if (i == 1) {
                        if (gus[1] == ans[0] || gus[1] == ans[2]) {
                            ball++;
                        }
                    } else if (i == 2) {
                        if (gus[2] == ans[0] || gus[2] == ans[0]) {
                            ball++;
                        }
                    }
                }
                if (strike == 3) {
                    System.out.println("아웃!");
                    break;
                } else {
                    System.out.println(strike + " 스트라이크, " + ball + " 볼.");
                    life--;
                    System.out.println("남은 생명 : " + life);
                }
            }
            if (life==0) {
                System.out.println("정답은 " + ans[0] + ", " + ans[1] + ", " + ans[2] + "입니다!");
            }

        }
}