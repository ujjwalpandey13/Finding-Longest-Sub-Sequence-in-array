import java.util.HashSet;
class LongSubSeq {
    public static void main (String[] args) {
        int [] nums = {3,9,1,10,4,20,2};
        HashSet<Integer> hs = new HashSet<>();
          int long_len=0;
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
      
        for(int i=0; i<nums.length; i++)
        {
                   if(!hs.contains(nums[i]-1)){
                    int no = nums[i];
                    while(hs.contains(no)){
                        no++;
                    }

                    if(long_len<no-nums[i])
                    {
                        long_len= no-nums[i];
                    }
                }
            }
          System.out.println("Longest lenth of given array is "+long_len);
        }
         
    }    
    
