import java.io.*;
import java.util.*;
//https://codeforces.com/problemset/problem/1471/B

public class B1471{
	public static void main(String arg[]) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++){
			int sum=0;
			List<Integer> nums = new ArrayList<Integer>();
			String[] input1 = br.readLine().split(" ");
			int x=Integer.parseInt(input1[1]);
			String[] tokens = br.readLine().split(" ");
			for(int i = 0; i < tokens.length; i++) {
				nums.add(Integer.parseInt(tokens[i]));
			}
			int i;
			for(i=0;i<nums.size();i++){
				int y = x;
				int num = nums.get(i);
				sum+=nums.get(i);
				if(num%x==0){
					while(y-->0){
						nums.add((int)num/x);
					}
				}
				else{
					break;
				}
			}
			while(++i<nums.size()){
				sum+=nums.get(i);
			}
			System.out.println(sum);
		}
	}
}
