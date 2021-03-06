public class SelectionSort {

  public static void main(String[] args) {
    
    int[] a = {36,19,29,12,5};
    String[] ab = {"deepak","amit","deepesh","veronika","rahul"};
    int mini,tempi;
    int mins;
    String temps;

    for(int i=0;i<a.length;i++){

      mini = i;
      for(int j=i+1;j < a.length ; j++){

        if(a[j] < a[mini]){

          mini = j;
        }
      }
      tempi = a[i];
      a[i] = a[mini];
      a[mini] = tempi;
    }

    for(int k=0; k < a.length;k++){

      System.out.print(a[k]+" ");
    }

    System.out.println("\n");

    for(int l=0 ; l < ab.length ; l++){

      mins = l;
      for(int j=l+1; j < ab.length ; j++){

        if(ab[j].compareTo(ab[mins])<0){

            mins = j;
        }
      }
      temps = ab[l];
      ab[l] = ab[mins];
      ab[mins] = temps;

    }

    for(int m=0; m < ab.length;m++){

      System.out.print(ab[m]+" ");
    }
  }
  
}
