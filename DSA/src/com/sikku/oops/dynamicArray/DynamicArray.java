package com.sikku.oops.dynamicArray;

public class DynamicArray {

    private int[] array;
    private int index;


    public DynamicArray() {
        this.array = new int[5];
        index = 0;
    }

    public void add(int num) {
        if (index == array.length) {
            createArray(index + 10);
        }
        this.array[index++] = num;
    }

    public int get(int index){
        if(index> this.index){
            return -1;
        }
        return array[index];
    }

    public int replace(int index, int num){
        if(index> this.index){
            return -1;
        }
        return array[index] = num;
    }

    public int removeLast(){
        if(this.index==0){
            return -1;
        }
        int num = array[index-1];
        array[index-1] = 0;
        return num;
    }

    public int getSize(){
        return this.index;
    }

    public boolean isEmpty(){
        return index==0;
    }

    private void createArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < index; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
    }
}
