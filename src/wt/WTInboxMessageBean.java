package wt;

import java.io.Serializable;

public class WTInboxMessageBean implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String MATCH_TYPE_SCORE = "SCORE";
	public static final String MATCH_TYPE_OHD = "OHD";
	public static final String MATCH_TYPE_QOH = "QOH";

	/** 匹配类型 */
	private String matchType;
	private WTInboxMessageBean.ScoreMatch scoreMatch;
	private WTInboxMessageBean.OHDMatch ohdMatch;
	private WTInboxMessageBean.QOHMatch qohMatch;

	/**
	 * 分数匹配信息
	 * @ClassName: ScoreMatch
	 * @author: YaoXiaowei
	 * @date: 2014-12-15
	 */
	public static class ScoreMatch implements Serializable {
		private static final long serialVersionUID = 1L;

		/** 匹配分数 */
		private String matchScore;
		/** 匹配项 */
		private String matchContent;
		/** 少收档案信息 */
		private WTInboxMessageBean.BagInfo delayedBagInfo;
		/** 多收档案信息 */
		private WTInboxMessageBean.BagInfo onhandBagInfo;

		public String getMatchScore() {
			return matchScore;
		}

		public void setMatchScore(String matchScore) {
			this.matchScore = matchScore;
		}

		public String getMatchContent() {
			return matchContent;
		}

		public void setMatchContent(String matchContent) {
			this.matchContent = matchContent;
		}

		public WTInboxMessageBean.BagInfo getDelayedBagInfo() {
			return delayedBagInfo;
		}

		public void setDelayedBagInfo(WTInboxMessageBean.BagInfo delayedBagInfo) {
			this.delayedBagInfo = delayedBagInfo;
		}

		public WTInboxMessageBean.BagInfo getOnhandBagInfo() {
			return onhandBagInfo;
		}

		public void setOnhandBagInfo(WTInboxMessageBean.BagInfo onhandBagInfo) {
			this.onhandBagInfo = onhandBagInfo;
		}

	}

	public static class OHDMatch implements Serializable {
		private static final long serialVersionUID = 1L;

		/** 少收档案信息 */
		private WTInboxMessageBean.BagInfo delayedBagInfo;
		/** 多收档案信息 */
		private WTInboxMessageBean.BagInfo onhandBagInfo;

		public WTInboxMessageBean.BagInfo getDelayedBagInfo() {
			return delayedBagInfo;
		}

		public void setDelayedBagInfo(WTInboxMessageBean.BagInfo delayedBagInfo) {
			this.delayedBagInfo = delayedBagInfo;
		}

		public WTInboxMessageBean.BagInfo getOnhandBagInfo() {
			return onhandBagInfo;
		}

		public void setOnhandBagInfo(WTInboxMessageBean.BagInfo onhandBagInfo) {
			this.onhandBagInfo = onhandBagInfo;
		}
	}

	public static class QOHMatch implements Serializable {
		private static final long serialVersionUID = 1L;

		/** 少收档案信息 */
		private WTInboxMessageBean.BagInfo delayedBagInfo;

		public WTInboxMessageBean.BagInfo getDelayedBagInfo() {
			return delayedBagInfo;
		}

		public void setDelayedBagInfo(WTInboxMessageBean.BagInfo delayedBagInfo) {
			this.delayedBagInfo = delayedBagInfo;
		}
	}

	/**
	 * 行李信息
	 * @ClassName: BagInfo
	 * @author: YaoXiaowei
	 * @date: 2014-12-15
	 */
	public static class BagInfo implements Serializable {
		private static final long serialVersionUID = 1L;

		/** 档案类型 */
		private String fileType;
		/** 档案编号 */
		private String fileNum;
		/** 旅客姓名 */
		private String passengerName;
		/** 旅客姓名简写 */
		private String passengerInitial;
		/** 行李牌号 */
		private String tagNum;
		/** 行李类型 */
		private String bagType;
		/** 航程 */
		private String route;
		/** 航班号 */
		private String flightNum;
		/** 航班日期 */
		private String flightDate;

		public String getFileType() {
			return fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public String getFileNum() {
			return fileNum;
		}

		public void setFileNum(String fileNum) {
			this.fileNum = fileNum;
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public String getPassengerInitial() {
			return passengerInitial;
		}

		public void setPassengerInitial(String passengerInitial) {
			this.passengerInitial = passengerInitial;
		}

		public String getTagNum() {
			return tagNum;
		}

		public void setTagNum(String tagNum) {
			this.tagNum = tagNum;
		}

		public String getBagType() {
			return bagType;
		}

		public void setBagType(String bagType) {
			this.bagType = bagType;
		}

		public String getRoute() {
			return route;
		}

		public void setRoute(String route) {
			this.route = route;
		}

		public String getFlightDate() {
			return flightDate;
		}

		public void setFlightDate(String flightDate) {
			this.flightDate = flightDate;
		}

		public String getFlightNum() {
			return flightNum;
		}

		public void setFlightNum(String flightNum) {
			this.flightNum = flightNum;
		}

	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public WTInboxMessageBean.ScoreMatch getScoreMatch() {
		return scoreMatch;
	}

	public void setScoreMatch(WTInboxMessageBean.ScoreMatch scoreMatch) {
		this.scoreMatch = scoreMatch;
	}

	public WTInboxMessageBean.OHDMatch getOhdMatch() {
		return ohdMatch;
	}

	public void setOhdMatch(WTInboxMessageBean.OHDMatch ohdMatch) {
		this.ohdMatch = ohdMatch;
	}

	public WTInboxMessageBean.QOHMatch getQohMatch() {
		return qohMatch;
	}

	public void setQohMatch(WTInboxMessageBean.QOHMatch qohMatch) {
		this.qohMatch = qohMatch;
	}

}
