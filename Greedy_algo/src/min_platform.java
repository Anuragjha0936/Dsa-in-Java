import java.util.Arrays;

public class min_platform {
    public static void main(String[] args) {
        int[] arr={900, 940, 950, 1100, 1500, 1800};
        int[] dep={910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int max=0;
        int platform=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }else{
                platform--;
                j++;
            }
            max=Math.max(max,platform);
        }
        System.out.println(max);
    }
}
