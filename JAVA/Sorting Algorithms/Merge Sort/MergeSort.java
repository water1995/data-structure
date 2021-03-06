public class MergeSort{

  int[] array;
  int[] tempMergeArr;
  int length;

  public static void main(String[] args) {
    int[] inputArr = {48,36,13,52,19,94,21};
    MergeSort ms = new MergeSort();
    ms.sort(inputArr);

    for(int i: inputArr){

      System.out.print(i+" ");
    }
  }

  public void sort(int inputArr1[]){
    this.array = inputArr1;
    this.length = inputArr1.length;
    this.tempMergeArr = new int[this.length];
    divideArray(0,length-1);
  }

  public void divideArray(int lowerIndex,int higherIndex){

    if(lowerIndex < higherIndex){

      int middle = lowerIndex+(higherIndex-lowerIndex)/2;

      //It will sort the left side of the array
      divideArray(lowerIndex,middle);

      //It will sort the right side of the array
      divideArray(middle+1, higherIndex);

      mergeArray(lowerIndex,middle,higherIndex);
    }
  }

  public void mergeArray(int lowerIndex,int middle,int higherIndex){

    for(int i=lowerIndex; i<= higherIndex ; i++){

      tempMergeArr[i] = array[i];
    }

    int i = lowerIndex;
    int j = middle + 1;
    int k = lowerIndex;

    while(i <= middle && j <= higherIndex){

      if(tempMergeArr[i] <= tempMergeArr[j]){

        array[k] = tempMergeArr[i];
        i++;
      }
      else{

        array[k] = tempMergeArr[j];
        j++;
      }
      k++;
    }

    while(i <= middle){

      array[k] = tempMergeArr[i];
      k++; i++;
    }
  }

  
  }
  

