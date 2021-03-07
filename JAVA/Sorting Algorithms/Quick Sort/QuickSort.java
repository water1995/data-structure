class QuickSort{

  public static void main(String[] args) {
    
    int[] inputArr = {48,36,13,52,19,94,21};
    int length = inputArr.length;
    QuickSort qsm = new QuickSort();
    qsm.quickSortRecursion(inputArr,0,length-1);
    qsm.printArray(inputArr);
  }

  int partition(int[] arr,int low,int high){

    int pivot = arr[(low+high)/2];

    while(low <= high){

    while(arr[low] < pivot){
      low++;
    }
    while(arr[high] > pivot){
      high--;
    }
    if(low <= high){
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }
    return low;

  }

  void quickSortRecursion(int[] arr,int low,int high){

    int pi = partition(arr,low,high);

    if(low < pi-1){
      quickSortRecursion(arr,low,pi-1);
    }
    if(pi < high){
      quickSortRecursion(arr,pi,high);
    }

  }

  void printArray(int[] arr){

    for(int i: arr){
      System.out.print(i+" ");
    }
  }
}