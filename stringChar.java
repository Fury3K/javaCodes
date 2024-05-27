package ExerciseGroup2;

import java.util.Scanner;

public class stringChar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.next();
        getOccurence(string);
        sc.close();
    }

    static void getOccurence(String str)
    {
        int cnt[] = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++)
            cnt[str.charAt(i)]++;

        char ch[] = new char[str.length()];

        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println(str.charAt(i) + " - " + cnt[str.charAt(i)]);
        }
    }
}

