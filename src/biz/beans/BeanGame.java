package biz.beans;

import io.jenetics.Genotype;
import io.jenetics.IntegerChromosome;
import io.jenetics.IntegerGene;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionResult;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.IntStream;

public class BeanGame {
    private static final double MAP_BEAN_OCCUR_PROBABILITY = 0.50;

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        IntStream ints = random.ints((int) (MAP_BEAN_OCCUR_PROBABILITY * 100), 0, 100);

        ints.forEach(System.out::println);
//        boolean[][] map = generateMap();
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
//        3^5=243
//        IntegerChromosome integerChromosome = IntegerChromosome.of(0, 6, 243);
//        Genotype<IntegerGene> genotypeFactory = Genotype.of(integerChromosome);
//        Function<Genotype<IntegerGene>, Integer> fitnessFunc = (genotype) -> {
//
//            return 0;
//        };
//        Engine<IntegerGene, Integer> engine = Engine.builder(fitnessFunc, genotypeFactory)
//                .maximizing()
//                .build();
//        Genotype<IntegerGene> bestResult = engine.stream()
//                .limit(1000)
//                .collect(EvolutionResult.toBestGenotype());
//
//        System.out.println(bestResult);
    }

    private static boolean[][] generateMap() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int[] beanLocations = new int[100];
        random.ints((int)(MAP_BEAN_OCCUR_PROBABILITY * 100),0,100);
        boolean[][] map = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (random.nextDouble()<MAP_BEAN_OCCUR_PROBABILITY){
                    map[i][j] = Boolean.TRUE;
                }
            }
        }
        return map;
    }
}
