import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
public class Employee implements Serializable
{
	private int empno;
	private String name;
	public List<LeaveRequest> leaveRequest;
	private final int maxLeavesLimit = 8;

	public static int emplastId=0;

	public Employee(String name)
	{
		this.empno = ++(Employee.emplastId);
		this.name = name;
		leaveRequest = new ArrayList<LeaveRequest>();
	}

	public int getEmpNo()
	{
		return this.empno;
	}

	public int getMaxLeavesLimit()
	{
		return this.maxLeavesLimit;
	}
	public String getName()
	{
		return this.name;
	}

	public LeaveRequest addLeaveRequest(String reason)
	{
		if(leaveRequest.size() >= maxLeavesLimit)
		{
			return null;
		}
		LeaveRequest newLeaveRequest = new LeaveRequest(reason);
		leaveRequest.add(newLeaveRequest);
		return newLeaveRequest;
	}

	public LeaveRequest removeLeaveRequest(int id)
	{
		LeaveRequest canceledLeaveRequest = null;
		for(int i=0; i < leaveRequest.size(); i++)
		{
			if(id == leaveRequest.get(i).getRequestId())
			{
				canceledLeaveRequest = leaveRequest.get(i);
				leaveRequest.remove(i);
				return canceledLeaveRequest;
			}
		}
		return canceledLeaveRequest;
	}

	public int currentLeaveCount(){
		return leaveRequest.size();
	}

	public int availableLeaves(){
		return leaveRequest.size();
	

}
}