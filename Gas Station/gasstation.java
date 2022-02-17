class gasstation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel = 0, start = 0, sum = 0;
    
    for(int i = 0; i < gas.length; i++){
        sum = sum + (gas[i] - cost[i]);
        fuel = fuel + (gas[i] - cost[i]);
        if(fuel < 0){
            fuel = 0;
            start = i+1;
        }
    }
    
    if(sum >= 0){
        return start % (gas.length);
    }
    
    return -1;
    }
}