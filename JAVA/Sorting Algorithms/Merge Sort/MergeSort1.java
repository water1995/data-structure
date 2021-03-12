class MergeSort1{

  int[] array1;
  int length1;
  int[] tempMergeArray1;

  public static void main(String[] args) {
    
    int[] inputArr = {48,36,13,52,19,94,21};
    MergeSort1 ms1 = new MergeSort1();
    ms1.sort1(inputArr);

    for(int i : inputArr){
      System.out.print(i+" ");
    }
  }

  public void sort1(int[] arr1){

    this.array1 = arr1;
    this.length1 = arr1.length;
    this.tempMergeArray1 = new int[this.length1];
    divideArray1(0,length1-1);

  }

  public void divideArray1(int lowerIndex1,int higherIndex1){

    if(lowerIndex1 < higherIndex1){

      int middle1 = lowerIndex1 + (higherIndex1-lowerIndex1)/2;

      divideArray1(lowerIndex1, middle1);

      divideArray1(middle1+1, higherIndex1);

      mergeArray1(lowerIndex1,middle1,higherIndex1);
    }
  }

  public void mergeArray1(int li,int mid,int hi){

    for(int i=li; i <= hi; i++){

      tempMergeArray1[i] = array1[i];
    }

    int l=li;
    int j = mid;
    int k = li;

    while(l <= mid && j <= hi){

      if(tempMergeArray1[l] <= tempMergeArray1[j]){

        array1[k] = tempMergeArray1[l];
        l++;
      }
      else{

        array1[k] = tempMergeArray1[j];
        j++;
      }
      k++;
    }

    while(l <= mid){

      array1[k] = tempMergeArray1[l];
      k++;l++;
    }
  }


}