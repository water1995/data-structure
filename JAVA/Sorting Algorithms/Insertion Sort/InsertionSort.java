
class InsertionSort{

  public static void main(String[] args) {
    
    int[] a = {36,19,29,12,5};
    int temp,j;

    for(int i=1 ; i < a.length ; i++){

      temp = a[i];
      j=i;
      while( j > 0 && a[j-1] > temp){

        a[j] = a[j-1];
        j = j-1;

      }
      a[j] = temp;
    }
    for(int k=0 ; k < a.length ; k++){

      System.out.print(a[k]+" ");
    }
  }
}