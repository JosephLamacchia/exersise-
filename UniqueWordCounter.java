package exersizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueWordCounter {

	public static void main(String[] args) {
		int count = 1;
		String test = "Paragraph on Technology Technology is the exploration of scientific knowledge to develop tools and techniques to transform the world by improving efficiency in almost everything we do. With every new technological invention, it is dramatically changing the society and the environment.";

		String[] wordsarray = test.split(" ");

		List<String> wordslist = new ArrayList<>();

		wordslist.addAll(Arrays.asList(wordsarray));

		List<WordCount> wclist = new ArrayList<>();

	
		for (String word : wordslist) {
		wordslist = wordslist.subList(1, wordslist.size());

			for (String i : wordslist) {

				if (word.equals(i)) {
					count += 1;
					

				}

			}

			WordCount wc = new WordCount();
			wc.setWord(word);
			wc.setCount(count);

			wclist.add(wc);
			count = 1;
		}
		System.out.print(wclist.toString());

	}

	public List<WordCount> countUniqueWords(String s) {

		return null;

	}

}
