package com.effectivejava.tutorial.effectivejava.itema45.anagrams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

// Overuse of streams - don't do this! (page 205)
public class StreamAnagrams {
	
	// coin
	
	public static void main(String[] args) throws IOException {
		Path dictionary = Paths.get("D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema45\\anagrams\\words");
		int minGroupSize = 1;

		try (Stream<String> words = Files.lines(dictionary)) 
		{
			words.collect(groupingBy(word -> word.chars().sorted()
					.collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append).toString()))
					.values()
					.stream().filter(group -> group.size() >= minGroupSize)
					.map(group -> group.size() + ": " + group)
					.forEach(System.out::println);
		}
	}
	
}
