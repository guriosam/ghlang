package interfaces;

public interface GHList {

	public int size();

	public boolean add(GHType obj);

	public boolean remove(GHType obj);

	public boolean contains(GHType obj);
	
	public void reverse();
	
	public GHType get(int position);
	
	public boolean put(int index, GHType element);

}
