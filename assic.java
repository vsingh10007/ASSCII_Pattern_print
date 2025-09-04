import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class assic {
    String s[][] = {
            { " ---   ---   ----  ---   ----  ----  ---  |   | ----- ----- |  /  |           |   |  ---   ---   ---   ---   ---- ----- |   | |   | |   | \\   / \\   / ----- " },
            { "|   | |   | |     |   | |     |     |     |   |   |     |   | /   |     |\\ /| |\\  | |   | |   | |   | |   | |       |   |   | |   | |   |  \\ /   \\ /     /  " },
            { "|___| |---  |     |   | |---- |---  |  _  |---|   |     |   |/    |     | v | | \\ | |   | |---   ---| |---  |____   |   |   | \\   / | ^ |   /     |     /   " },
            { "|   | |   | |     |   | |     |     | | | |   |   |   | |   | \\   |     |   | |  \\| |   | |         | | \\        |  |   |   |  \\ /  |/ \\|  / \\    |    /    " },
            { "|   |  ---   ---- |__/   ---- |     |_| | |   | ----- |_|   |  \\  |____ |   | |   |  ---  |         | |  \\   ____|  |    ---    v         /   \\   |   -----" },
    };
    String space[][] = {
            { "  " },
            { "  " },
            { "  " },
            { "  " },
            { "  " }
    };
    String num[][] = {
        {"             ___    _   ____  ____         ___   ____ ____   ___   ___   __    __                     ____   ______                                                                                     "},
        {"         /  |   |  /|       |     | |   | |     |         | |   | |   | |__|  |__|     /        \\         | |  __  |                                                                                   "},
        {"        /   |   | / |    ___| ____| |___| |___  |___      | |___| |___|  __           /   _____  \\     ___| | |  | |                                                                                                 "},
        {"  _    /    |   |   |   |         |     |     | |   |     | |   |     | |__|   /      \\   _____  /    |     | |__|_|                                                                                                                      "},
        {" |_|  /     |___| __|__ |____ ____|     |  ___| |___|     | |___|     |       /        \\        /     -     |______                                                                                                      "},
    };
    String s1;
    char c[];
    int i, j, cnt, p;

    void mainModule() {
        System.out.println("\t\t\t\t\t---- These Programe Print ASSIC ---- \n");
        System.out.println("\t\t\t\t\t1.To Print All ASSIC Character....");
        System.out.println("\t\t\t\t\t2.To Print One Character of ASSIC....");
        System.out.println("\t\t\t\t\t3.To Print Word in ASSIC....");
        System.out.println("\t\t\t\t\t4.To Print ASSIC in Range....");
        String input = JOptionPane.showInputDialog("Enter the Choiss -- ");
        switch (input) {
            case "1":
                PrintAll();
                break;

            case "2":
                PrintOne();
                break;
            case "3":
                PrintWord();
                break;
            case "4":
                PrintRange();
            default:
                break;
        }
        continuee();
    }

    void continuee() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nDo Want To Continue Press 1.....");
        String inner = in.nextLine();
        if (inner.equals("1")) {
            mainModule();
        }
    }

    void PrintAll() {
        for (i = 0; i < 5; i++) {
            System.out.println(s[i][0]);
        }
    }

    void PrintOne() {
        s1 = JOptionPane.showInputDialog("Enter the One Character -- ");
        p = Character.toUpperCase(s1.charAt(0)) - 64;
        cnt = (5 * (p - 1)) + (p - 1);
        for (i = 0; i < 5; i++) {
            c = String.valueOf(s[i][0]).toCharArray();
            for (j = cnt; j < cnt + 5; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
    void PrintWord() {
        s1 = JOptionPane.showInputDialog("Enter the word Character -- ");
        for (i = 0; i < 5; i++) {
            for (int k = 0; k < s1.length(); k++) {
                if (s1.charAt(k) >= '.' && s1.charAt(k) <= '@') {
                    p = (Character.toUpperCase(s1.charAt(k)) - 45);
                    cnt = (5 * (p - 1)) + (p - 1);
                    int end = (s1.charAt(k) != '@')? cnt + 6 : cnt + 8;
                    c = String.valueOf(num[i][0]).toCharArray();
                    for (j = cnt; j < end; j++) {
                        System.out.print(c[j]);
                    }
                    // System.out.println("hii");
                }
                else if (s1.charAt(k) == ' ') {
                    for (j = 0; j < 2; j++) {
                        System.out.print(space[j][0]);
                    }
                }
                else{
                    p = (Character.toUpperCase(s1.charAt(k)) - 64);
                    cnt = (5 * (p - 1)) + (p - 1);
                    c = String.valueOf(s[i][0]).toCharArray();
                    for (j = cnt; j < cnt + 6; j++) {
                        System.out.print(c[j]);
                    }
                }
            }
            System.out.println();
        }
    }

    void PrintRange() {
        String start, end;
        start = JOptionPane.showInputDialog("Enter the Starting Character -- ");
        end = JOptionPane.showInputDialog("Enter the Ending Character -- ");
        for (i = 0; i < 5; i++) {
            cnt = Character.toUpperCase(start.charAt(0)) - 64;
            p = Character.toUpperCase(end.charAt(0)) - 64;
            c = String.valueOf(s[i][0]).toCharArray();
            for (j = (5 * (cnt - 1)) + (cnt - 1); j < ((5 * (p - 1)) + (p - 1)) + 5; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // String s[][] = {
        // { " --- --- ---- --- ---- ---- --- | | ----- ----- | / | | | --- --- --- ---
        // ---- ----- | | | | | | \\ / \\ / ----- " },
        // { "| | | | | | | | | | | | | | | / | |\\ /| |\\ | | | | | | | | | | | | | | |
        // | | \\ / \\ / / " },
        // { "|___| |--- | | | |---- |--- | - |---| | | |/ | | - | | \\ | | | |--- ---|
        // |--- |____ | | | \\ / | * | / | / " },
        // { "| | | | | | | | | | | | | | | | | | \\ | | | | \\| | | | | | \\ | | | | \\
        // / |* *| / \\ | / " },
        // { "| | --- ---- --/ ---- | |_| | | | ----- |_| | \\ |____ | | | | --- | | |
        // \\ ____| | --- - * * / \\ | -----" },
        // };
        // String space[][] = {
        // { " " },
        // { " " },
        // { " " },
        // { " " },
        // { " " }
        // };
        // String s1;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the Chara -- ");
        // s1 = input.nextLine();
        // System.out.print("\n\n");
        // int p, i, j, cnt;

        // // System.out.println(p + " " + cnt);
        // char c[];
        // for (i = 0; i < 5; i++) {
        // for (int k = 0; k < s1.length(); k++) {
        // if (s1.charAt(k) != ' ') {
        // p = (Character.toUpperCase(s1.charAt(k)) - 64);
        // cnt = (5 * (p - 1)) + (p - 1);
        // c = String.valueOf(s[i][0]).toCharArray();
        // for (j = cnt; j < cnt + 6; j++) {
        // System.out.print(c[j]);
        // }
        // } else {
        // for (j = 0; j < 2; j++) {
        // System.out.print(space[j][0]);
        // }
        // }
        // }
        // System.out.println();
        // }
        assic a = new assic();
        a.mainModule();
    }
}

/*
 * String s[][] =
 * {
 * {" ---   ---   ----  ---   ----  ----  ---  |   | ----- ----- |  /  |           |   |  ---   ---   ---   ---   ---- ----- |   | |   | |   | *   * *   * ----- "
 * },
 * {"|   | |   | |     |   | |     |     |     |   |   |     |   | /   |     |* *| |*  | |   | |   | |   | |   | |       |   |   | |   | |   |  * *   * *     /  "
 * },
 * {"|___| |---  |     |   | |---- |---  |  -  |---|   |     |   |/    |     | * | | * | |   | |---   ---| |---  |____   |   |   | *   * | * |   *     *     /   "
 * },
 * {"|   | |   | |     |   | |     |     | | | |   |   |   | |   | *   |     |   | |  *| |   | |         | | *        |  |   |   |  * *  |* *|  * *    *    /    "
 * },
 * {"|   |  ---   ----  --/   ---- |     |_| | |   | ----- |_|   |  *  |____ |   | |   |  ---  |         | |  *   ____|  |    ---    *   *   * *   *   *   -----"
 * },
 * };
 * 
 *               ____   _____ 
 *        \\       |  |  _  | 
 * _____  \\    __|  | | | |  
 * _____   /   |     | |_|_|  
 *        /    -     |______  
 */