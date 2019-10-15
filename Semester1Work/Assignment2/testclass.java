package com.james.a2a;
public class testclass {
    public static final  int test = 1;
    public static void main(String[] args) {

        BinaryMaximiser individual = new BinaryMaximiser();
        Weasel individual = new individual();

        individual.numberOfChromosomes = 100;
        individual.crossOverProbability = 0.02;
        individual.mutationProbability = 0.01;
        individual.chromosome = 34;
        individual.testing = 0.124;
        individual.helloworld = "Hello world";
        //individual.initialPopulation = {'5', '7', '3', 'a'};
        System.out.println(individual.chromosomeSize);
        System.out.println(individual.numberOfChromosomes);
        System.out.println(individual.crossOverProbability);
        System.out.println(individual.mutationProbability);
        System.out.println(individual.chromosome);
        System.out.println(individual.testing);
        System.out.println(individual.helloworld);
        System.out.println(individual.size);
        //System.out.println(individual.initalPopulation);
        int number = 1;
        System.out.println(test);
         String output = BinaryMaxmiser.testing(individual.chromosomeSize);
        System.out.print(output);

        Weasel population = new Weasel();
        System.out.println(population.chromosome());
    }

}
