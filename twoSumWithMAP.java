
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class twoSumWithMAP {
    public static int[] sum(int[] nums, int target) {
    	List<List<String>> ls = Arrays.asList(Arrays.asList("Anand","vardhan"),Arrays.asList("Anand","vardhan"));
    	ls.add(Arrays.asList("Anand","vardhan"));
    	System.out.println(ls);
        int start =0;
        int end =nums.length;
        Map<Integer ,Integer> result = new HashMap<>();
        for(int i=start;i<end;i++){
        	if(null != result.get(target - nums[i])) {
            	return new int[] {result.get(target - nums[i]),i};
           }
            result.put(nums[i], i);
            
        }
        
    return new int[]{0,0};
}
    
    public static void main(String[] Args) {
    	int[] nums = {6,3,2,4};
    	int target = 6;
			int[] result = sum(nums ,target);
			System.out.println(Arrays.toString(result));
    }
}