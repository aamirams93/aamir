package in.image.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MySqqlReportDaoImpl implements ReportDao
{

	public MySqqlReportDaoImpl()
	{
		System.out.println("ReportDaoImpl : : Constructor");
	}

	@Override
	public String findData()
	{

		System.out.println("fetching data report  from Mysql db...");
		return "Report Data";
	}
}
