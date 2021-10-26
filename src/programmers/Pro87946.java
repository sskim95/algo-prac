package programmers;

public class Pro87946 {

    boolean[] isVisited;
    int[][] dungeons;
    int N, ans = 0;

    public int solution(int k, int[][] dungeons) {
        N = dungeons.length;
        this.dungeons = dungeons;
        isVisited = new boolean[N];
        permutation(k, 0);
        return ans;
    }

    public void permutation(int energy, int depth) {
        if (ans == N) return;

        for (int i = 0; i < N; i++) {
            if (!isVisited[i] && dungeons[i][0] <= energy) {
                isVisited[i] = true;
                permutation(energy - dungeons[i][1], depth + 1);
                isVisited[i] = false;
            }
        }

        ans = Math.max(ans, depth);
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        Pro87946 pro87946 = new Pro87946();
        int solution = pro87946.solution(k, dungeons);
        System.out.println("solution = " + solution);
    }
}
