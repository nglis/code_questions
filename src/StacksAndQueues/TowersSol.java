package StacksAndQueues;

// Book solution for Towers of Hanoi
public class TowersSol {
    public static void main(String[]args){
        int n = 3;
        Tower[] towers = new Tower[n];

        for (int i = 0; i < 3; i++)
            towers[i] = new Tower(i);

        for (int i = 0; i < n; i++)
            towers[0].add(i);

        towers[0].moveDisks(n, towers[2], towers[1]);

    }
}

class Tower {
    private Stack disks;
    private int index;

    public Tower(int i) {
        disks = new Stack();
        index = i;
    }

    public int index() {
        return index;
    }

    public void add(int d) {
        if (!disks.isEmpty() && (Integer) disks.peek() >= d)
            return;
        else
            disks.push(d);
    }

    public void moveTopTo(Tower t) {
        int top = (Integer) disks.pop();
        t.add(top);
    }

    public void moveDisks(int n, Tower dest, Tower buffer) {
        if (n > 0) {
            moveDisks(n - 1, buffer, dest);
            moveTopTo(dest);
            buffer.moveDisks(n - 1, dest, this);
        }
    }
}
