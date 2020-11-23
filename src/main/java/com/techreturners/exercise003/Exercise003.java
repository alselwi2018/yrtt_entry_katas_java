package com.techreturners.exercise003;

public class Exercise003 {

    // Scenario
    // Several people are standing in a row divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1, 
    // and so on.

    // Task
    // Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, where the first one is the total weight of 
    // team 1, and the second one is the total weight of team 2.

    // Notes
    // Array size is at least 1.
    // All numbers will be positive.
    // Input >> Output Examples
    // rowWeights([13, 27, 49])  ==>  return (62, 27)
    // Explanation:
    // The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.

    // rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
    // Explanation:
    // The first element 120 is the total weight of team 1, and the second element 140 is the total weight of team 2.

    // rowWeights([80])  ==>  return (80, 0)
    // Explanation:
    // The first element 80 is the total weight of team 1, and the second element 0 is the total weight of team 2.

    public static int[] rowWeights(final int[] weights) {
        List<Integer> team1 = new ArrayList<>();
        List<Integer> team2 = new ArrayList<>();
        int group1 = 0;
        int group2 = 0;
        for(int i = 0; i < weights.length; i++){
            if(i % 2 == 0){
                team1.add(weights[i]);
            }else{
                team2.add(weights[i]);
            }
        }
        for(int x = 0; x < team1.size();x++){
            group1 += team1.get(x);
        }
        for(int y = 0; y < team2.size(); y++){
            group2 +=team2.get(y);
        }
        int[] res = {group1, group2};

        //return new int[]{0, 0};
        return res;
    }

}
