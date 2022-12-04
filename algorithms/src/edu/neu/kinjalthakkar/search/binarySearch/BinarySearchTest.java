package edu.neu.kinjalthakkar.search.binarySearch;

public class BinarySearchTest {

    public static void main(String args[]){

        String a[]= new String[]{"Anni","Foruu","Kinjal","Mridul","Naman","Pankti","Pranjal","Siddhant"};

        BinarySearch  obj = new BinarySearch();
        obj.search(a,"Kinjal");
        System.out.println("Kinjal found at : " +obj.search(a,"Kinjal"));
        System.out.println("Ashish found at : " +obj.search(a,"Ashish"));
    }
}
