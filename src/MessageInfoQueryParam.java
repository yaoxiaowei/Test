/** 
 * @Desription: 本站信箱信息查询参数
 * @Company: CZ
 * @ClassName: MessageInfoQueryParam.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-9-15
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */


import java.io.Serializable;

/**
 * @Description: 本站信箱信息查询参数
 * @ClassName: MessageInfoQueryParam
 * @author: YaoXiaowei
 * @date: 2014-9-15
 */
public class MessageInfoQueryParam implements Serializable {
	private static final long serialVersionUID = 967029195741463815L;
	/*
	 * 电报类型
	 */
	private String telexType;
	/*
	 * 查询编号
	 */
	private String queryNo;
	/*
	 * 发报地址
	 */
	private String sendAddress;
	/*
	 * 开始日期
	 */
	private String startDate;
	/*
	 * 结束日期
	 */
	private String endDate;
	/*
	 * 信息类型
	 */
	private String infoType;
	/*
	 * 回执
	 */
	private String receipt;

	public String getTelexType() {
		return telexType;
	}

	public void setTelexType(String telexType) {
		this.telexType = telexType;
	}

	public String getQueryNo() {
		return queryNo;
	}

	public void setQueryNo(String queryNo) {
		this.queryNo = queryNo;
	}

	public String getSendAddress() {
		return sendAddress;
	}

	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInfoType() {
		return infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

}
