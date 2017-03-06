import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by developer on 1/12/17.
 */
public class TowersOfHanoiKoan {

    private static Stack<Integer>[] towers = new Stack[3];
    private static void move(int n, int from, int to, int temp){
        if(n > 0) {
            move(n -1, from, temp, to);
            Integer i = towers[from].pop();
            towers[to].push(i);
            System.out.println(String.format("Move %s from tower %s %s to tower %s %s", i, from, towers[from], to, towers[to]));
            move(n -1, temp, to, from);
        }
    }

    public static void run(int num){
        for(int i = 0; i < 3; i++)
            towers[i] = new Stack<Integer>();

        for(int i = num; i > 0; i--){
            towers[0].add(i);
        }

        move(num, 0, 1, 2);
    }
}
