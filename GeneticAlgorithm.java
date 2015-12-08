package ai;
import java.util.LinkedList;

public abstract class GeneticAlgorithm{ 

	int numInitial;
	LinkedList<Integer> fitness = new LinkedList<Integer>();
	LinkedList<Chromosome> Population = new LinkedList<Chromosome>();


	GeneticAlgorithm(int numInitial){
		this.numInitial = numInitial;
		for(int i = 0; i < numInitial; i++){
			Population.add(new Chromosome(generate()));
		}
	}

	public void iterate(){
		int n=4;
		if(Population.size() < 8)
			n = Population.size()/2;
		for(int i = 0; i < n; i++){
			Chromosome c1 = Chromosome.clone(Population.get(fitness.get(i*2)));
			Chromosome c2 = Chromosome.clone(Population.get(fitness.get(i*2+1)));
			Chromosome.crossover(c1, c2);
			c1.mutate();
			c2.mutate();
			Population.add(c1);
			Population.add(c2);		
		}
		
		for(int i = 0; i < Population.size(); i ++){//remove invalid chromosomes
			if(!isValid(Population.get(i)))
				Population.remove(i);
		}
		
		fitness = populationFitness(Population);
		
		//kill weakest 
		if(Population.size() > 16){
			Population.removeLast();
			fitness.removeLast();
		}
			
	}
	

	

	public static String encode(float f){
		int intBits = Float.floatToIntBits(f); 
		return Integer.toBinaryString(intBits);
	}

	public static float decode(String s){
		int intBits = Integer.parseInt(s, 2);
		return Float.intBitsToFloat(intBits);
	}

	abstract public float eval(Chromosome c);

	abstract public LinkedList<Integer> populationFitness(LinkedList<Chromosome> chromosomes);

	abstract public boolean isValid(Chromosome c);

	abstract public String[] generate();

}
