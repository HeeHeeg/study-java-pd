package Day2;

public class Study3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = arr.clone(); //여기서 같다고 했으니까 같다. .clone();을 만들어줘서 10이 arr에만 들어가고 arr2는 바뀌지 않도록 한다.
        int[] arr3 = {1, 2, 3}; // 요소는 똑같아도 {}이 괄호 자체가 같냐? 라고 봤을 때 arr과 arr3은 주소값이 다르다.
        if (arr == arr2){
            System.out.println("true"); //같음
        }
        if(arr==arr3){
            System.out.println("true2"); //다름
        }
        arr2[0] = 10;
        System.out.println(arr2[0]);
        System.out.println(arr[0]);
    }
}
