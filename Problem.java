package ai;

import java.util.LinkedList;

public class Problem extends GeneticAlgorithm{


	Problem(int numInitial) {
		super(numInitial);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Problem p = new Problem(8);
		for(int i =0; i < 100; i++)
			p.iterate();

	}

	@Override
	public float eval(Chromosome c) {
		// TODO Auto-generated method stub
		return decode(c.getGenome()[0]);
	}

	@Override
	public LinkedList<Integer> populationFitness(
			LinkedList<Chromosome> chromosomes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(Chromosome c) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String[] generate() {
		// TODO Auto-generated method stub
		String[] v = {encode((float)0)};
		return v;
	}

}
