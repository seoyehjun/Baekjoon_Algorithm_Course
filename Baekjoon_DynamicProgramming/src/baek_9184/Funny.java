package baek_9184;

import java.util.HashMap;
import java.util.Scanner;

public class Funny {
    static HashMap<String, Integer> map;

    public static void main(String[] args) {
        map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == -1 && b == -1 && c == -1) break;

            int result = wfunc(a, b, c);
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + result);
        }
    }

    public static int wfunc(int a, int b, int c) {
        String key = a + "," + b + "," + c;

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            if (map.containsKey(key)) return map.get(key);
            else {
                int temp = wfunc(20, 20, 20);
                map.put(key, temp); // 메모이제이션
                return temp;
            }
        } else if (a < b && b < c) {
            if (map.containsKey(key)) return map.get(key);
            else {
                int temp = wfunc(a, b, c - 1) + wfunc(a, b - 1, c - 1) - wfunc(a, b - 1, c);
                map.put(key, temp); // 메모이제이션
                return temp;
            }
        } else {
            if (map.containsKey(key)) return map.get(key);
            else {
                int temp = wfunc(a - 1, b, c) + wfunc(a - 1, b - 1, c) + wfunc(a - 1, b, c - 1) - wfunc(a - 1, b - 1, c - 1);
                map.put(key, temp); // 메모이제이션
                return temp;
            }
        }
    }
}
