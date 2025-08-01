import java.util.*;
import java.util.ArrayList;

    public class _3sum {
        public static void main(String[] args) {
            int[] arr={-1,0,1,2,-1,-4};
//        ArrayList<Integer> list=new ArrayList<>();
//        List<List<Integer>>  list1=new ArrayList<>();
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            int low=i+1;
//            int high=arr.length-1;
//            if(i>0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            while(low<high){
//                if(arr[i]+arr[low]+arr[high]==0){
//                    list.add(arr[i]);
//                    list.add(arr[low]);
//                    list.add(arr[high]);
//                    list1.add(new ArrayList<>(list));
//                    list.clear();
//                    if(arr[low]==arr[low+1]){
//                        low++;
//                    }
//                    if(arr[high]==arr[high-1]){
//                        high--;
//                    }
//                    low++;
//                    high--;
//                }
//                else if(arr[i]+arr[low]+arr[high]<0){
//                    low++;
//                }else{
//                    high--;
//                }
//            }
//        }


            HashSet<Integer> set=new HashSet<>();
            Set<List<Integer>> set1=new HashSet<>();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int sumk=-(arr[i]+arr[j]);
                    if(set.contains(sumk)){
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(sumk);
                        set.add(arr[j]);
                        Collections.sort(list);
                        set1.add(new ArrayList<>(list));
                        list.clear();
                    }else{
                        set.add(arr[j]);
                    }
                }
                set.clear();
            }
            System.out.println(set1);

        }
    }


