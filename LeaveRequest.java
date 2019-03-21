import java.io.Serializable;
public class LeaveRequest implements Serializable
{
	private int requestId;
	private String reason;

	public static int leaveRequestLastId = 0;

	public LeaveRequest(String reason)
	{
		this.requestId = ++(LeaveRequest.leaveRequestLastId);
		this.reason=reason;
	}

	public int getRequestId()
	{
		return this.requestId;
	}

	public String getRequest()
	{
		return this.reason;
	}

	@Override
	public String toString() 
	{
		return "Request Id:" + requestId + "\tReason: " + reason;
	}
}