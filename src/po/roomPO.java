package po;

import java.io.Serializable;


public class roomPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean valid;
	private int number;
	private Room_Type type;
	private int price;
	
	public roomPO(boolean valid, int number,Room_Type type,int price){
		this.valid =valid;
		this.number=number;
		this.type=type;
		this.price =price;
	}
	
	public boolean getValid(){
		return valid;
	}
	
	public int getNumber(){
		return number;
	}
	
	public Room_Type getRoomType(){
		return type;
	}
	
	public int getPrice(){
		return price;
	}
	
	

	
}
