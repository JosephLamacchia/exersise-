package exersizes;

public class WordCount {
private String word;

public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

private int count;

@Override
public String toString() {
	return "WordCount [word=" + word + ", count=" + count + "]";
}
}
