public class HalloweenCandies {
  public static void main(String[] args) {
    int num_candies =3;
    int prices[] ={5,5,106};
    int money =16;
    int candies =0;
    for(int i=0;i<num_candies;i++){
      if(prices[i]%5==0){
        candies = candies+1;
      }
      else if(money>=prices[i]){
        candies = candies+1;
        money= money-prices[i];
      }
    }
    System.out.println(candies);
  }
}
