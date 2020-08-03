import java.util.ArrayList;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int[] list = new int[40];
        int a = 0;

        while (N>0){
            int res = N%2;
            list[a] = res;
            N = N/2;
            a++;
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int j = a-1; j >= 0; j --){
            if (list[j] == 0){
                int ctr = 0;
                while (list[j] == 0){
                    ctr++;
                    j--;
                    if (j<0){
                        ctr = 0;
                        break;
                    }
                }
                al.add(ctr);
            }
        }
        int gap = 0;
        if(al.size()>0){
            for( int i = 0; i < al.size(); i ++){
                if (gap < al.get(i)) {
                    gap = al.get(i);
                }
            }
        }
        return gap;
    }
}