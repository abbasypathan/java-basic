package com.javabasic.java17features.randomnumber;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomNumberGenerators {

	public static void main(String[] args) {
		// Will return default algorithm
		RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
		System.out.println(randomGenerator.getClass());
		int i = 0;

		while (i < 10) {
			int nextInt = randomGenerator.nextInt(20);
			System.out.println(nextInt);
			i++;
		}

		// It will use all algorithm
		RandomGeneratorFactory.all().map(factory -> factory.group() + " : " + factory.name()).sorted()
				.forEach(System.out::println);

		// We can get generator by specifying algorithm name
		RandomGenerator generator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
		System.out.println(generator.nextInt(100));
	}
}
