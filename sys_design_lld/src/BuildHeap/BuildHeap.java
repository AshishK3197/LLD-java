class BuildHeap{
//Building heap from arr
    public void buildHeap(int arr[] , int n) {
        for (int i = n / 2; i > 0; i--) {
            heapify(arr, n, i);
        }
    }

    public void heapify(){
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (l <= n && a[l] > a[largest]){
            largest = l;
        }
        if (r <= n && a[r] > a[largest]){
            largest = r;
        }

        if (largest != i){
            swap(arr, i , largest);
            heapify(arr,n,largest);
        }
    }

}