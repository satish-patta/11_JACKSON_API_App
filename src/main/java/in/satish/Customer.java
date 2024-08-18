package in.satish;

public class Customer {
	private Integer cusId;
	private String cusName;
	private String cusEmail;
	private Long cusPhn;
	private Address cusAdd;

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusEmail=" + cusEmail + ", cusPhn=" + cusPhn
				+ ", cusAdd=" + cusAdd + "]";
	}

	public Address getCusAdd() {
		return cusAdd;
	}

	public void setCusAdd(Address cusAdd) {
		this.cusAdd = cusAdd;
	}

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public Long getCusPhn() {
		return cusPhn;
	}

	public void setCusPhn(Long cusPhn) {
		this.cusPhn = cusPhn;
	}

}
