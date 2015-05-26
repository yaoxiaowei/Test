/** 
 * @Desription: TODO
 * @Company: CZ
 * @ClassName: CZBagsSearch.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-10-17
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package json;

import java.io.Serializable;
import java.util.Date;


public class CZBagsSearch implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bagName;
	private Date date;
	private CZBagsSearch.BagRecord bagRecord;
	private CZBagsSearch.BagRecord[] bagRecordArray;

	public static class BagRecord {
		private String recordType;
		private String refAirlineCode;
		private String refStationCode;
		private String refReferenceNumber;

		public String getRecordType() {
			return recordType;
		}

		public void setRecordType(String recordType) {
			this.recordType = recordType;
		}

		public String getRefAirlineCode() {
			return refAirlineCode;
		}

		public void setRefAirlineCode(String refAirlineCode) {
			this.refAirlineCode = refAirlineCode;
		}

		public String getRefStationCode() {
			return refStationCode;
		}

		public void setRefStationCode(String refStationCode) {
			this.refStationCode = refStationCode;
		}

		public String getRefReferenceNumber() {
			return refReferenceNumber;
		}

		public void setRefReferenceNumber(String refReferenceNumber) {
			this.refReferenceNumber = refReferenceNumber;
		}

		@Override
		public String toString() {
			return "BagRecord [recordType=" + recordType + ", refAirlineCode=" + refAirlineCode + ", refStationCode=" + refStationCode + ", refReferenceNumber=" + refReferenceNumber + "]";
		}
	}

	public String getBagName() {
		return bagName;
	}

	public void setBagName(String bagName) {
		this.bagName = bagName;
	}

	public CZBagsSearch.BagRecord getBagRecord() {
		return bagRecord;
	}

	public void setBagRecord(CZBagsSearch.BagRecord bagRecord) {
		this.bagRecord = bagRecord;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CZBagsSearch.BagRecord[] getBagRecordArray() {
		return bagRecordArray;
	}

	public void setBagRecordArray(CZBagsSearch.BagRecord[] bagRecordArray) {
		this.bagRecordArray = bagRecordArray;
	}

}
