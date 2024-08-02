package in.image.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao
{

	public OracleReportDaoImpl()
	{
		System.out.println("ReportDaoImpl : : Constructor");
	}

	@Override
	public String findData()
	{

		System.out.println("fetching data report from Oracle db...");
		return "Report Data";
	}
}
