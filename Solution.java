class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> temp = new ArrayList<>();
        for(int a : arr2){
            temp.add(a);
        }

        int p = 0;

        for(int i=0; i<temp.size(); i++){
            int a = temp.get(i);

            for(int j=0; j<arr1.length; j++){
                if(arr1[j] == a){
                    int new1 = arr1[j];
                    arr1[j] = arr1[p];
                    arr1[p] = new1;
                    p++;
                }
            }
        }

        for(int i=p; i<arr1.length-1; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[j] < arr1[i]){
                    int tom = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = tom;
                }
            }
        }

        return arr1;

    }
}
