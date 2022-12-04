package edu.neu.kinjalthakkar.search.binarySearch;

public class BinarySearch implements BinarySearchAPI {
    @Override
    public int search(String[] a, String key) {
        return search(a,key,0,a.length);
    }
    @Override
    public int search(String[] a, String key, int lo, int hi) {

        //key not found
        if(hi<=lo)
            return -1;

        //calculate mid value
        int mid = lo+(hi-lo)/2;

        //compare the mid value and key
        int cmp = a[mid].compareTo(key);

        //for lower half
        if(cmp > 0){
            return search(a, key, lo, mid);
        }
        //for upper half
        else if(cmp < 0){
            return search(a,key,mid+1,hi);
        }
        //mid == key
        else
            return mid;

    }
}
