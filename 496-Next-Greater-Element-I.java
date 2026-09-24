class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Stack<Integer> stack = new Stack<>();
        int[] preAns = new int[n2];

        for(int i=n2-1; i>=0; i--){
            if(stack.size() == 0){
                preAns[i] = -1;
            }
            else if(stack.size() != 0 && stack.peek()>nums2[i]){
                preAns[i] = stack.peek();
            } 
            else if(stack.size() != 0 && stack.peek() <= nums2[i]) {
                while(stack.size() > 0 && stack.peek() <=nums2[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    preAns[i] = -1;
                } else {
                    preAns[i] = stack.peek();
                }
            }
            stack.push(nums2[i]);
        }


        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n2; i++){
            map.put(nums2[i], preAns[i]);
        }

        int[] ans = new int[n1];

        for(int i=0; i<n1; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}