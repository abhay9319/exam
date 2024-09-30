public class SecondOccourence {

  public static int secondlargestcount(int arr[]){
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          secondlargest = largest;
          largest = arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]<largest){
          secondlargest = arr[i];
        }
    }
    if(secondlargest==Integer.MIN_VALUE){
      return 0;
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]==secondlargest){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,5,4,4};
    int output = secondlargestcount(arr);
    System.out.println(output);
  }
}
