package software;

public class Framework extends Software {

	private int robustness;

	public int getRobustness() {
		return robustness;
	}

	public void setRobustness(int robustness) {
		this.robustness = robustness;
	}

	public int quanlity() {
		
		return robustness + getFriendliness();
	}
	
	
}
