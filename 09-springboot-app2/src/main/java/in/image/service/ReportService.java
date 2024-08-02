package in.image.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.image.dao.ReportDao;

@Service
public class ReportService
{

	private ReportDao reportDao;

	@Autowired
	@Qualifier("oracle")
	public void setReportDao(ReportDao reportDao)
	{
		System.out.println("setReportDao() method called");
		this.reportDao = reportDao;
	}

	public void genrateReport()
	{
		String findData = reportDao.findData();
		System.out.println("genrating report..");
	}
}
