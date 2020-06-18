package com.company;

import java.util.Random; // Include Rundom Library here:

// Realization BubbleSorted ALG here:

public class BubbleSorted
{
    // Created Variable and Const for BubbleSorted here:

    public static int[] mas = new int[5]; // In mas 5 numbers.

    BubbleSorted()
    {
        // Constructor here:

        // Created Random Massive here:

        Random random = new Random(); // Created Rundom object (Library).

        for ( int i = 0; i < mas.length; i++ )
        {
            mas[i] = random.nextInt();
        }

        Main();
    }

    private static void Main()
    {
        // Created Main While And Created Main Methods here:

        boolean IsRun = true;

        while ( IsRun )
        {
            // Created Oll Methods BubbleSorted class here:

            RealizationBubbleSorted();
            CheckNoSortedMas();
            RealizationBubbleSorted();

            IsRun = false;
        }
    }

    private static void CheckNoSortedMas()
    {
        // Check Don't Sorted mas here:

        for ( int i = 0; i < mas.length; i++ ) // Check Don't Sorted Mas here:
        {
            System.out.println(mas[i]);
        }
    }

    private static void RealizationBubbleSorted()
    {
        // Realization BubbleSorted ALG here:

        for ( int i = 0; i < mas.length; i++ ) // walk ten times through the array in a row
        {
            for ( int j = 0; j < mas.length - 1; j++ ) // we pass completely through the array
            {
                // Check if mas[0] > mas[1]:

                if ( mas[j] > mas[j + 1] )
                {
                   // Swap

                    int buf = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = buf;
                }
            }
        }

        // Check Sorted Massive here:

        System.out.println("Sorted Massive here: ");

        for ( int i = 0; i < mas.length; i++ )
        {
            System.out.println(mas[i]);
        }
    }
}
