//anwser 200
//Array manipulation hackerrank

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import static java.util.Arrays.*;

import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Array_Manipulation {

        /*
         * Complete the 'arrayManipulation' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. 2D_INTEGER_ARRAY queries
         */

        public static long arrayManipulation(int n, List<List<Integer>> q) {
            // Write your code here
            long[] a = new long[n];
            long max=-99999;
            long m= q.size();

            for(int i=0;i<n;i++)
            {
                a[i]=0;
            }
            //git_ke liye
            for(int i=0;i<m;i++)
            {
                a[q.get(i).get(0)-1]+=q.get(i).get(2);
                if(q.get(i).get(1)<n)
                    a[q.get(i).get(1)]-=q.get(i).get(2);
            }
            for(int i=1;i<n;i++)
            {
                a[i]+=a[i-1];
                if(a[i]>max)
                    max=a[i];
            }
            return max;
        }


        public static void main(String[] args) throws IOException {
            Array_Manipulation r= new Array_Manipulation();
            List<List<Integer>> list = asList(
                    asList(1,2,100),
                    asList(2,5,100),
                    asList(3,4,100)
                    );
            System.out.println(  r.arrayManipulation(5,list));

        }
    }



