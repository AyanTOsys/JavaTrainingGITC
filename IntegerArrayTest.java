import java.util.Iterator;

public class IntegerArrayTest {

	public static void main(String[] args) {
		int score1[]={10,20,30,40};
		
		int score2[]=new int[11];
		
		score2[0]=10;
		score2[1]=20;
		score2[2]=30;
		score2[3]=40;
		
		int score1Total = 0;
		int score2Total = 0;
		
		for(int i=0;i<score1.length;i++) {
			System.out.println("score :"+score1[i]);
			score1Total = score1Total + score1[i];
			
		}
			
		System.out.println("Score 1 total:"+score1Total);
		
		System.out.println("--------------------------------");
		
		for(int i=0;i<score2.length;i++) {
			System.out.println("score :"+score2[i]);
			score2Total = score2Total + score2[i];
			
		}
		System.out.println("Score 2 total:"+score2Total);	
	}

}
