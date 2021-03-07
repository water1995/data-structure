import org.w3c.dom.TypeInfo;


public class BubbleSort {

  public static void main(String[] args) {

    int[] a = {36,19,29,12,5};
    String[] ab = {"deepak","amit","deepesh","veronika","rahul"};
    int tempi;
    String temps;

    for(int i=0;i<a.length;i++){

      int flagi=0;
      for(int j=0;j<a.length-1-i;j++){

        if(a[j] > a[j+1]){

          tempi = a[j];
          a[j] = a[j+1];
          a[j+1] = tempi;
          flagi = 1;
        }
      }
      if(flagi == 0){ 
        break; 
      }
    }

    for(int k=0; k < a.length ; k++){

      System.out.print(a[k]+" ");
    }
    System.out.println("\n");

    for(int l=0; l < ab.length;l++){

      int flags = 0;

      for(int m =0; m < ab.length-1-l;m++){

        if(ab[m].compareTo(ab[m+1]) > 0){

          temps = ab[m];
          ab[m] = ab[m+1];
          ab[m+1] = temps;
          flags = 1;
        }

      }
      if(flags == 0){
        break;
      }
    }

    for(int n=0 ; n < ab.length ; n++){

      System.out.print(ab[n]+" ");
    }

    




    
  }
  
}
