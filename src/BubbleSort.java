import java.util.Arrays;

public class BubbleSort {
    public int[] items={10,1,2,3,20,13,3,11,16};


    public int[] sort(){
        boolean isSorted;
        for (int i = 0; i < items.length; i++) {
            isSorted=true;
            for (int j = i+1; j < items.length; j++) {
                if(items[i] > items[j]){
                    int temp=items[i];
                    items[i]=items[j];
                    items[j]=temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                return items;
            }
        
        }
        return items;
    }
}
