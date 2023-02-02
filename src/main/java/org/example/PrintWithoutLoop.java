package org.example;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        printNumber(1, 100);
    }

        public static void printNumber(int startNo, int tillNo)
        {
            if(startNo>tillNo)
            {
                return;
            }
            System.out.print(startNo + " ");
            printNumber(startNo+1,tillNo);
        }

}
