public class Std {
    int arrn[];
    public int length(char arr[]){
        return arr.length;
    }
    public char[] add(char arr[],int at,char value){
        int l = arr.length;
        int i;
        for(i = l;i>at;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=value;
        return arr;
    }
}
