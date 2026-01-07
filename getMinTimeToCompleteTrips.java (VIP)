class Solution {
    public static long getMinimumTime(int[] time, int totalTrips) {
        long low=1;
        long high=(long)getMinTime(time)*totalTrips;
        long ans=high;
        while(low<=high){
            long mid=low+(high-low)/2;
            long trips=0;
            for(int t:time){
                trips+=mid/t;
            }
            
            if(trips>=totalTrips){
              ans=mid;
              high=mid-1;
            }else{
              low=mid+1;
            }
        }return ans;
    }
    public static int getMinTime(int[] time){
        int min=time[0];
        for(int t: time){
            min=Math.min(min, t);
        }return min;
    }
    
    public static void main(String ar[]){
      int[] time={1,2,3};
      System.out.println("Minmum Time: "+getMinimumTime(time, 5));
    }
}
