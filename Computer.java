public class Computer {
    int sum1(int[] values){
        int sum=0;
        for(int i=0; i< values.length; i++){
            sum+= values[i];
        }
        return sum;
    }
    int sum2(int ... values){//여기서 ...은 리스트를 나타낸다. 매개변수로 배열을 받지 않아도 되어서 간편하다.
        // 또한 매개변수를 배열로 받아도 사용 가능하다.
        int sum = 0;
        for(int i=0; i< values.length; i++){
            sum+=values[i];
        }
        return sum;
    }
}
