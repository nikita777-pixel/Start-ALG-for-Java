package com.company;

// Include Library here:

import java.util.Random; // Include Rundom Library for created Rundom massive.

// Realization Linear Search ALG here:

public class LinearSearch
{
    // Created Variable and Const for LinearSearch class here:

    public static int[] massive = new int[10]; // Created massive (arr) 10 variable.

    LinearSearch()
    {
        // Constructor here:

        // Created Random Massive here:

        Random random = new Random();

        for ( int i = 0; i < massive.length; i++ ) // Created Random Massive here:
        {
            massive[i] = random.nextInt();
        }

        Main();
    }

    private static void Main()
    {
        // Main While And Main methods here:

        boolean IsRun = true;

        while ( IsRun )
        {
            // Oll method for this class here:

            RealizationLinearSearchAlg();

            IsRun = false;
        }
    }

    private static void CheckMassive()
    {
        // Realization Check Massive here:

        for ( int i = 0; i < massive.length; i++ )
        {
            System.out.println(massive[i]);
        }
    }

    private static void IfIsKatNoToMassive()
    {
        // Realization If massive have not this variable here:

        System.out.println("Massive don't have IsKat number!");
    }

    private static void IfIsKatYesToMassive()
    {
        // Realization If massive have this variable here:

        System.out.println("Massive have IsKat number!");
    }

    private static void RealizationLinearSearchAlg()
    {
        // Realization Linear Search Alg here:

        int IsKat = 10213;

        for ( int i = 0; i < massive.length; i++ )
        {
            // Check if isKat == massive[i] here:

            if ( massive[i] == IsKat )
            {
                // Realization if IsKat == numbers to massive here:

                IfIsKatYesToMassive();
                CheckMassive();
            }else
            {
                // Realization If IsKat != numbers to massive here:

                IfIsKatNoToMassive();
                CheckMassive();
            }
        }
    }
}
