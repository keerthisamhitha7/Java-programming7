
public class GenericClassEx 
{
public static void main(String[] aa)
{
	dictionary <String,String> data = new dictionary <String,String> ("Apple", "It is a type of Fruit");
	data.printmeaning();
}
static class dictionary<W,M>
{
	private W word;
	private M meaning;
	public dictionary(W word, M meaning)
	{
		this.word=word;
		this.meaning=meaning;
	}
private void printmeaning()
{
	System.out.println(word);
	System.out.println(meaning);
}
}
}
