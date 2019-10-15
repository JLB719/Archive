package dsa_assignment1;

public class MLNode<E> implements MLNodeInterface<E>
{
	private E			item;
	private MLNodeInterface<E>	next1;
	private MLNodeInterface<E>	prev1;
	private MLNodeInterface<E>	next2;
	private MLNodeInterface<E>	prev2;

	MLNode(E element)
	{
		this.item = element;
		this.next1 = this.prev1 = this.next2 = this.prev2 = this;
	}

	public MLNodeInterface<E> remove1()
	{
		/* WRITE THIS CODE */
		// take some kind of list in and remove last pointer have to check list
		// look into nodes to work out what to do and make sure to remove from a certian list
		
//		this.next1 = item
//		this.prev1 = this.next1;
//		this.next1 = this.prev2;
		return this;
	}

	public MLNodeInterface<E> remove2()
	{
		/* WRITE THIS CODE */
//		this.next1 = this.item;
//		this.prev1 = this.item;
//		this.next2 = this.prev2;
//		this.prev2 = this.next2;
		return this;
	}

	public MLNodeInterface<E> addAfter1(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
		// needs to use the target node which is an interacce of type target
		// need to add some code to remove the preivous node and reset it
		// need to add pointers to other nodes to make sure so nned to work out how to write code to point to other nodes could do a lot ofthis and have it = this like in the code exmaple above
		target.remove1();
		prev1.setPrev1(next1);
		this.next1 = prev1;
		next1.setNext1(prev1);
		
		// need to integerate target into add methods so will do that tommorow moring
		
		return this; //returns object isntace 
	}

	public MLNodeInterface<E> addAfter2(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
//		target.remove2();
//		MLNodeInterface<E> target2 = target.remove1();
//		this.prev2 = this.
//		this.next2 = this.prev2;
		return this;
	}

	public MLNodeInterface<E> addBefore1(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
//		target.remove1();
//		this.next1 = this.prev1;
//		this.prev1 = this.next1;
		
		return this;
	}

	public MLNodeInterface<E> addBefore2(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
//		target.remove2();
//		this.next2 = this.next2;
//		this.prev2 = this.next2;
		return this;
	}
	
	public E getElement()
	{
		
		return item;
	}

	public MLNodeInterface<E> getNext1()
	{
		
		return next1;
	}

	public MLNodeInterface<E> getPrev1()
	{
		return prev1;
	}

	public MLNodeInterface<E> getNext2()
	{
		return next2;
	}

	public MLNodeInterface<E> getPrev2()
	{
		return prev2;
	}

	public void setNext1(MLNodeInterface<E> next1)
	{
		this.next1 = next1;
	}

	public void setPrev1(MLNodeInterface<E> prev1)
	{
		this.prev1 = prev1;
	}

	public void setNext2(MLNodeInterface<E> next2)
	{
		this.next2 = next2;
	}

	public void setPrev2(MLNodeInterface<E> prev2)
	{
		this.prev2 = prev2;
	}
}
