import java.util.Random;
public class BaseBallGameProject0511 {

    public static void main(String[] args) {
        Random random = new Random();
        int always = 1;

        int[] ans = {random.nextInt(10), random.nextInt(10), random.nextInt(10) };
        for(int i =0; i<3; i++) {
            while(always==1) {
                if (ans[i] == 0) {
                    ans[i] = random.nextInt(9);
                }else {
                    break;
                }

                if (i == 1) {
                    while(always==1) {
                        if (ans[i] == ans[0] || ans[i] == ans[2]) {
                            ans[i] = random.nextInt(9);
                        }else {
                            break;
                        }
                    }
                } else if (i == 2) {
                    while(always==1) {
                        if (ans[i] == ans[1] || ans[i] == ans[0]) {
                            ans[i] = random.nextInt(9);
                        }else {
                            break;
                        }
                    }
                }

            }
            System.out.print(ans[i] + " ");
        }

    }
}

/*
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BaseBallGameProject0511 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 3) {
            int randomNum = random.nextInt(9) + 1;
            uniqueNumbers.add(randomNum);
        }

        int[] ans = uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
*/

