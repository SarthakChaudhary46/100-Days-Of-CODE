class Solution {
    private int getf(int[] f, int x) {
        return f[x] == x ? x : (f[x] = getf(f, f[x]));
    }
    
    private void merge(int[] f, int[] num, int x, int y) {
        x = getf(f, x);
        y = getf(f, y);
        if (x == y) {
            return;
        }
        if (num[x] < num[y]) {
            int t = x;
            x = y;
            y = t;
        }
        f[y] = x;
        num[x] += num[y];
    }
        
    public boolean canTraverseAllPairs(int[] nums) {
        final int n = nums.length;
        if (n == 1) {
            return true;
        }
        int[] f = new int[n], num = new int[n];
        for (int i = 0; i < n; ++i) {
            f[i] = i;
            num[i] = 1;
        }
        Map<Integer, Integer> have = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int x = nums[i];
            if (x == 1) {
                return false;
            }
            for (int d = 2; d * d <= x; ++d) {
                if (x % d == 0) {
                    if (have.containsKey(d)) {
                        merge(f, num, i, have.get(d));
                    } else {
                        have.put(d, i);
                    }
                    while (x % d == 0) {
                        x /= d;
                    } 
                }
            }
            if (x > 1) {
                if (have.containsKey(x)) {
                    merge(f, num, i, have.get(x));
                } else {
                    have.put(x, i);
                }
            }
        }
        return num[getf(f, 0)] == n;
        
    }
}
