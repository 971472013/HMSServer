package dataservice;

import po.promotionPO;

public interface promotionData {
	public boolean insert(promotionPO user);
	public boolean delete(promotionPO user);
	public boolean update(promotionPO user);
	public promotionPO getPromotion(String promotionID);
	public promotionPO[] getPromotionList(String userID);
}
