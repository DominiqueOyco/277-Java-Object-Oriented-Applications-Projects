package assignmentSeven;

//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class MyData implements MementoAble
{	
	public MyData(String key, int value)
	{
		mKey = key;
		mValue = value;
	}
	
	public String getKey()
	{
		return mKey;
	}
	
	public int getValue()
	{
		return mValue;
	}
	
	public void setValue(String key, int value)
	{
		mKey = key;
		mValue = value;
	}
	
	public void setData(MyData me)
	{
		mKey = me.getKey();
		mValue = me.getValue();
	}
	
	@Override
	public Memento getMemento()
	{
		return new MyDataMemento(this, mKey, mValue);
	}
	
	@Override
	public void restoreMemento(Memento m)
	{
		MyDataMemento md = (MyDataMemento)m;
		mKey = md.mKey;
		mValue = md.mValue;
	}
	
	private class MyDataMemento extends Memento
	{
		public MyDataMemento(MyData me, String key, int value)
		{
			super(me);
			mKey = key;
			mValue = value;
		}
		
		private String mKey;
		private int mValue;		
	}
	
	private String mKey;
	private int mValue;
		
}