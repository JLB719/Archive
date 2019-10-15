package dsa_assignment1;

public class OrderedMruList<E extends Comparable<E>> implements OrderedMruListInterface<E>
{
	MLNodeInterface<E>	headOrdered	= new MLNode<E>(null);
	MLNodeInterface<E>	headMRU		= new MLNode<E>(null);

	public OrderedMruList()
	{
		
	}
	
	public boolean isEmptyOrdered()
	{
		/* WRITE THIS CODE */
		if (headOrdered == null) 
		{
			return true;
		} 
		else 
		{
		return false;
		}
		
	}

	public boolean isEmptyMru()
	{
		/* WRITE THIS CODE */
		if (headMRU == null) 
		{
			return true;
		} 
		else 
		{
		return false;
		}
		
	}

	public OrderedMruListInterface<E> touch(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
		return null;
	}
	
	public MLNodeInterface<E> getFirstMru()
	{
		/* WRITE THIS CODE */
		if (isEmptyMru() == false)
		{
			return headMRU;
		} else {
			return null;
		}
		
	}
	
	public MLNodeInterface<E> getFirstOrdered()
	{
		E element = null;
		/* WRITE THIS CODE */
		MLNodeInterface<E> node = new MLNode<E>(element); 
		if (isEmptyOrdered() == false) {
			return headOrdered;
		} else {
			return null;
		}
		
	}
	
	public MLNodeInterface<E> getNextOrdered(MLNodeInterface<E> current)
	{
		/* WRITE THIS CODE */
		return null;
	}

	public MLNodeInterface<E> getNextMru(MLNodeInterface<E> current)
	{
		/* WRITE THIS CODE */
		return null;
	}

	public OrderedMruListInterface<E> remove(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
		return null;
	}
	
	public OrderedMruListInterface<E> add(E element)
	{
		/* WRITE THIS CODE */
		return null;
	}
}
