package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        if (k <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (k == 0)
            return -1;


        // initialization
        int maxReach = 0;
        int step = 0;
        int jump = 1;



        for (int i = 1; i < k; i++)
        {

            if (i == k - 1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i+k);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0)
            {
                //  we must have used a jump
                jump++;


                if(i>=maxReach)
                    return -1;


                step = maxReach - i;
            }
        }

        return -1;

    }
}
