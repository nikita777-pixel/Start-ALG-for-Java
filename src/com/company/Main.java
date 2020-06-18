package com.company;

// Include library here:

import java.util.Random; // Include Rundom Library here:

// Include file (project) here:

import com.company.BubbleSorted; // Include BubbleSorted class here.
import com.company.LinearSearch; // Include LinearSearch class here.

public class Main
{
    // Variable for Main class here:

    Main()
    {
        // Constructor here:

        Main_While(); // Created Main_While method here:
    }

    private static void Main_While()
    {
        // Main While and Main methods for this project here:

        boolean IsRun = true;

        while ( IsRun )
        {
            // Oll Method here:

            CreatedBubbleSorted();
            CreatedLinearSearch();

            IsRun = false;
        }
    }

    private static void CreatedBubbleSorted()
    {
        // Created Bubble Sorted Class to Main file here:

        BubbleSorted bubbleSorted = new BubbleSorted(); // Created BubbleSorted object here.
    }

    private static void CreatedLinearSearch()
    {
        // Created Linear Sorting here:

        LinearSearch linearSearch = new LinearSearch(); // Created LinarySearch object hereю
    }

    public static void main(String[] args)
    {
        // Created Obejcts (Main) here:

        Main main = new Main(); // Created Main.
    }
}
