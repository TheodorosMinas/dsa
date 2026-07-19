package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target){
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.keySet().contains(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
            }else {
                map.put(nums[i],i);
            }
        }

        return res;

    }

    public int maxProfit(int[] prices){
        int min=Integer.MIN_VALUE;
        int maxprofit=0;
        int profit;
        int k=0;
        while (k<prices.length){
            if(prices[k]<min){
                min=prices[k];
            }else {
                profit=prices[k]-min;
                if (profit>maxprofit){
                    maxprofit=profit;
                }
            }

            k++;
        }
        return maxprofit;
    }




    public int lengthOfLongestSubstringKDistinct(String s, int k){
        Set<Character> set=new HashSet<>();
        char[] array=s.toCharArray();
        int max=Integer.MIN_VALUE;
        
        return 0;

    }

    public static int lengthOfLongestSubstring(String s){
        Set<Character> set=new HashSet<>();
        char[] array=s.toCharArray();
        int max=Integer.MIN_VALUE;
        int curr=0;


        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(set.contains(array[j])){
                    break;
                }else {
                    set.add(array[j]);
                    curr++;
                }
            }
            if(curr>max){
                max=curr;
            }
            set.clear();
            curr=0;

        }

return 0;
    }













}