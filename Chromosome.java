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
	}
	
