package PartOne.Lecture.Week1;

public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
}
