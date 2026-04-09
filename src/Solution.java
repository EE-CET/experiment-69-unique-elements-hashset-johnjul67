import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < N; i++){
            set.add(sc.nextInt());
        }

        for(int num : set){
            System.out.print(num + " ");
        }

        sc.close();
    }
}