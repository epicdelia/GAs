import java.util.Random;

public class Main {
	static int nov = 10;
	static String f = "a[1]*a[2]+a[1]*a[3]+a[1]*a[4]+a[1]*a[5]+a[1]*a[6]+a[1]*a[7]+a[1]*a[8]+a[1]*a[9]+a[1]*a[10]+a[2]*a[3]+a[2]*a[4]+a[2]*a[5]+a[2]*a[6]+a[2]*a[7]+a[2]*a[8]+a[2]*a[9]+a[2]*a[10]+a[3]*a[4]+a[3]*a[5]+a[3]*a[6]+a[3]*a[7]+a[3]*a[8]+a[3]*a[9]+a[3]*a[10]+a[4]*a[5]+a[4]*a[6]+a[4]*a[7]+a[4]*a[8]+a[4]*a[9]+a[4]*a[10]+a[5]*a[6]+a[5]*a[7]+a[5]*a[8]+a[5]*a[9]+a[5]*a[10]+a[6]*a[7]+a[6]*a[8]+a[6]*a[9]+a[6]*a[10]+a[7]*a[8]+a[7]*a[9]+a[7]*a[10]+a[8]*a[9]+a[8]*a[10]+a[9]*a[10]";
	// The maximum number of generations
	final int maxGenerations = 20000;
	
	    public static void main(String[] args) {
	        float r = evaluation(11,-1,1);
			System.out.println(r); // Display the string
	        }
	    public static float generateRandom(int lowerbound,int upperbound){
	    	Random r = new Random();
	    	float n = r.nextFloat()*(upperbound-lowerbound) + lowerbound;
	    	return n;
	    }
	    public static float evaluation(int nov,int lowerbound,int upperbound){
	    	float a[] = new float[nov];
	        for(int i=1; i<nov; i++){
	              a[i] = (float) generateRandom(lowerbound,upperbound);
	         }
	    	float n = a[1]*a[2]+a[1]*a[3]+a[1]*a[4]+a[1]*a[5]+a[1]*a[6]+a[1]*a[7]+a[1]*a[8]+a[1]*a[9]+a[1]*a[10]+a[2]*a[3]+a[2]*a[4]+a[2]*a[5]+a[2]*a[6]+a[2]*a[7]+a[2]*a[8]+a[2]*a[9]+a[2]*a[10]+a[3]*a[4]+a[3]*a[5]+a[3]*a[6]+a[3]*a[7]+a[3]*a[8]+a[3]*a[9]+a[3]*a[10]+a[4]*a[5]+a[4]*a[6]+a[4]*a[7]+a[4]*a[8]+a[4]*a[9]+a[4]*a[10]+a[5]*a[6]+a[5]*a[7]+a[5]*a[8]+a[5]*a[9]+a[5]*a[10]+a[6]*a[7]+a[6]*a[8]+a[6]*a[9]+a[6]*a[10]+a[7]*a[8]+a[7]*a[9]+a[7]*a[10]+a[8]*a[9]+a[8]*a[10]+a[9]*a[10];
	    	return n;
	    }
}
