class Solution {
    public int[] replaceElements(int[] arr) {
        int maxValue = arr[arr.length - 1];
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] > maxValue){
                int aux = arr[i];
                arr[i] = maxValue;
                maxValue = aux;
                }            
            else{
                arr[i] = maxValue;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}