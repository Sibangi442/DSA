public class String6 {
    public static void main(String args[]){
        String fruits[]={"apple","banana","mango"};
        String largest =fruits[0];
        for(int i = 1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){ //on comparing here largest will be smaller than fruits[i]
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
