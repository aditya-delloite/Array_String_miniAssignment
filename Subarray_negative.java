
import java.util.*;

public class Subarray_negative {




        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);

            System.out.println("Size Of Array");
            int n = scn.nextInt();

            int  [] arr= new int[n];

            for(int i=0;i<arr.length;i++)
            {
                arr[i] = scn.nextInt();
            }

            System.out.println(Subarraycount(arr));
        }

        public static int Subarraycount(int [] arr)
        {
            int count =0;

            for(int i=0;i<arr.length;i++)
            {
                int sum=0;

                for(int j=i;j<arr.length;j++)
                {
                    sum += arr[j];

                    if(sum<0)
                    {
                        count++;
                        sum = 0;
                    }
                }
            }

            return count;
        }

    }

