public class CustomArray {
    public int[] items;
    public int count;
    public CustomArray(int length){
        items=new int[length];
    }

    public void insert(int item){
        //If the array is full,resize it
        if(items.length == count){
        //Create new array of double of size
        int[] newItems=new int[count*2];
        //Copy all existing items
        for (int i = 0; i < count; i++) {
            newItems[i]=items[i];
        }
        //Set item to the new Array
        items=newItems;
    }

        //Add the new item at the end
        items[count]=item;
        count++;
    }

    public void removeAt(int index){
        //Validate the index
        if(index < 0 || index >=count){
            throw new IllegalArgumentException();
        }
        //Shift the items to the left to fill the hole
        //[10,20,30,40]
        //index:1
        //1<-2
        //2<-3
        //[10,30,40]

        for (int i = index; i < count; i++) {
            items[i]=items[i+1];
        }
        count--;
    }
    public int indexOf(int num){
        int index=-1;
        for (int i = 0; i < count; i++) {
            if(items[i]==num){
                index=i;
            }
        }
        return index;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}

