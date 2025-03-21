enum CourseName{
	PYTHONDATASCIENCE,SQL,CLOUDCOMPUTING,JAVA,PYTHON;
}
class Cost{
	public static void cost(CourseName course)
	{
		if(course == CourseName.PYTHONDATASCIENCE)
		{
			System.out.println("PYTHONDATASCIENCE:12000");
		}
		else if(course == CourseName.SQL)
		{
			System.out.println("SQL: 13000");
		}
		else if(course == CourseName.JAVA)
		{
			System.out.println("JAVA: 15000");
		}
		else if(course == CourseName.PYTHON)
		{
			System.out.println("PYTHON:  16000");
		}
		else if(course == CourseName.CLOUDCOMPUTING)
		{
			System.out.println("CLOUDCOMPUTING: 17000");
		}
	}
}
