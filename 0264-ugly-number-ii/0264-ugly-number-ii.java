class Solution {
    public int nthUglyNumber(int n) {

        int[] u=new int[n];
        u[0]=1;

        int i2=0,i3=0,i5=0;

        for(int i=1;i<n;i++){

            int next=Math.min(2*u[i2],Math.min(3*u[i3],5*u[i5]));
            u[i]=next;

            if(next==2*u[i2])i2++;
            if(next==3*u[i3])i3++;
            if(next==5*u[i5])i5++;

        }
        return u[n-1];
    }
}