class BinarySearch
{
    public static void main(String args[])
    {
    	BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40,50};
        int n = arr.length;
        System.out.println(n);
        int x = 50;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+arr[result]);
    }
    
    private static int binarySearch(int[] arr, int low, int high, int x) {
		
    	int mid = low+(high-low)/2;
    	System.out.println("mid"+mid);
    	if (high>=low) {
    		if (arr[mid] == x) {
    			return mid;
    		}
        	if (arr[mid] > x) {
    			return binarySearch(arr, low, mid-1, x);
    		}
        	System.out.println("high--"+high);
    		return binarySearch(arr, mid+1, high, x);
		}
		return -1;
	}
}
