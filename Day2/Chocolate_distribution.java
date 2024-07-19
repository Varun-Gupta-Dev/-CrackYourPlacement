package Day2;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        // ArrayList<Integer> choclt = new ArrayList();
        int minDiff = Integer.MAX_VALUE;
        int i;
        int j;
        for(i=0, j=m-1; j<n; i++,j++){
           
            minDiff = Math.min((a.get(j) - a.get(i)),minDiff);
            
        }
        return minDiff;
    }
}
