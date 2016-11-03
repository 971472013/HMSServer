package stub;
import dataservice.promotionData;
import po.promotionPO;

public class promotionData_stub implements promotionData{
	@Override
	public boolean insert(promotionPO user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(promotionPO user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(promotionPO user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public promotionPO[] getPromotionList(String userID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public promotionPO getPromotion(String promotionID) {
		// TODO Auto-generated method stub
		return null;
	}
}
