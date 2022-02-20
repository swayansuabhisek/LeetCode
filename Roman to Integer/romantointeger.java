public class romantointeger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int sum =0;
        char[] input= s.toCharArray();
        
        char prev = input[input.length - 1];
        sum += map.get(prev);
        
        for(int i = input.length - 2;i>=0;i--){
            char curr = input[i];
            if(map.get(curr) < map.get(prev)){
                sum -= map.get(curr);
            }
            else{
                sum += map.get(curr);
            }
            prev = input[i];
        }
        return sum;
    }
}