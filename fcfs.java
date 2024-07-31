import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

public class fcfs {
       public static void main(String[] args) {
       float awt=0.0,atat=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of process");
int n=sc.nextInt();
int wt[]=new int[n];
int bt[]=new int[n];
int tat[]=new int[n];
 System.out.println("enter the burst time of process");
 for(int i=0;i<n;i++){
    bt[i]=sc.nextInt();
 }
 System.out.println("process  burst  waiting TAT");
    }
    