package po;

import java.io.Serializable;

public class RoomPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean valid;
	private int number;
	private RoomType type;
	private int price;
	
	public RoomPO(boolean valid, int number,RoomType type,int price){
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
	
	public RoomType getRoomType(){
		return type;
	}
	
	public int getPrice(){
		return price;
	}
	
}
