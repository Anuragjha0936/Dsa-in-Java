public class mediansortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr={6,7,8,9,10,11,12,13,14,15,16,17};

        int n1=arr.length;
        int n2=brr.length;
        int[] merge=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i <n1 && j <n2){
            if(arr[i]<= brr[j]){
                merge[k]=arr[i];
                k++;
                i++;
            }else {
                merge[k] = brr[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            merge[k]=arr[i];
            i++;
            k++;
        }

        while(j<n2){
            merge[k]=brr[j];
            j++;
            k++;
        }

        median(merge,0,merge.length-1);
    }
    public static void median(int[] merge,int low,int high){
        int mid=(low+high)/2;
        if(merge.length%2!=0){
            System.out.println((double)merge[mid]);
        }else{
            System.out.println((double) (merge[mid]+merge[mid+1])/2);
        }

    }
}
