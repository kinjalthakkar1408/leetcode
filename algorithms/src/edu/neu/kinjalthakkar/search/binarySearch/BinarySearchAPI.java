package edu.neu.kinjalthakkar.search.binarySearch;

public interface BinarySearchAPI {

    // Main search
    public int search(String a[],String key);

    // Base search
    public int search(String a[],String key,int lo,int hi);
}
