import java.time.LocalDate;

public class CallLog {
	String logType;
	String contactName;
	LocalDate date;

	public CallLog(String logType, String contactName, LocalDate date) {
		super();
		this.logType = logType;
		this.contactName = contactName;
		this.date = date;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CallLog [logType=" + logType + ", contactName=" + contactName + ", date=" + date + "]";
	}
}
