public class Arrays4 {
    public static int TrappedRainwater(int height[]){
        int n= height.length;
        // TO calculate left max boundary
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i = 1; i<n;i++){
            leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }
        //  To calcullate Right max boundary
        int rightmax[]= new int[n];
        rightmax[n-1]= height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater = 0; 
        int waterlevel = 0;
        //loop
        for(int i = 0;i<n;i++){
            // water level = min(leftmax, right max)
            waterlevel = Math.min(leftmax[i], rightmax[i]);
             //trapped water = waterlevel - height[i]
            trappedwater += waterlevel- height[i];

            //If width is not 1 then - trappedwater = waterlevel- height[i]*width;
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped water is : "+TrappedRainwater(height));
    }
}
