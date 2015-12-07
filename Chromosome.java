package Genetic_Algorithms;

import java.util.Random;

/**
 * This class is used to define a chromosome for the gentic algorithm
 * 
 * This class is a container for the details of the chromosome, 
 * i.e. the gene (the string that represents our target 
 * string) and the fitness (how close the gene is to the target string).
 * 
 * @author Delia Lazarescu 
 * @version 1.0
 */
public class Chromosome{
	
	private final String gene;
	private final int fitness;
	
	private static final char[] TARGET_GENE = "010011".toCharArray();

	private static final Random rand = new Random(System.currentTimeMillis());
	
	public Chromosome(String gene) {
		this.gene    = gene;
		this.fitness = calculateFitness(gene);

	public String getGene() {
		return gene;
	
	
	public static String [] crossover(String bits[] ){
	
		String children[] = new String[2];
		Random random = new Random();
		
		int length1 = bits[1].length();
		int length2 = bits[2].length();
		int shorter;
		
		if (length1 <= length2){
			shorter = length1;
		}
		else{
			shorter = length2;
		}
		
		int swap = random.nextInt(shorter);
		
		String oneB = bits[1].substring(0, length1 - swap);
		String oneE = bits[2].substring(length2 - swap, -1);
		String twoB = bits[1].substring(0,length2 - swap);
		String twoE = bits[2].substring(length1 - swap, -1);
		
		children[1] = oneB + oneE;
		children[2] = twoB + twoE;
		
		return children;
	}
	
	public void mutate(){
		this.gene = continuousMutate(this.gene,0,9);
		//return boundaryMutate(str,0,9);
	}
	
	public String boundaryMutate(String str, int low, int high){
		int value = low;
		if(Math.random() > 0.5)
			value = high;
		int position = (int)(Math.random()*(str.length()));
		if(position == str.length())
			position--;
				
		StringBuilder temp = new StringBuilder(str);
		temp.setCharAt(position, Character.forDigit(value, 10));
		
		return temp.toString();
	}
	
	public String continuousMutate(String str, int low, int high){
		int value = (int)(Math.random()*((high - low) + 1)) + low;
		int position = (int)(Math.random()*(str.length()));
		if(position == str.length())
			position--;
		
		StringBuilder temp = new StringBuilder(str);
		temp.setCharAt(position, Character.forDigit(value, 10));
		
		return temp.toString();
	}

}	
