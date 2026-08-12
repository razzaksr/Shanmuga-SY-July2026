package day3;

public class GasStationViaaGreedy {
    public static int circuit(int[] gas, int[] cost){
        int total=0, start=0, tank=0, size = gas.length;
        for(int index=0;index<size;index++){
            int diff = gas[index]-cost[index];
            total+=diff;tank+=diff;
            if(tank<0){start=index+1;tank=0;}
        }
        return (total>=0)?start:-1;
    }
    public static void main(String[] args) {
        System.out.println(circuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        System.out.println(circuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }
}
