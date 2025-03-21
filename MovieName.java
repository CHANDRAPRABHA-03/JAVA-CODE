enum MovieName{
	CHARLI,LUCIA,AVENGERS,MUFTI,KGF;
}
class Director{
	public static void directors(MovieName movie){
		if(movie == MovieName.CHARLI)
		{
			System.out.println("CHARLI:KIRANRAJ");
		}
		else if(movie == MovieName.LUCIA)
		{
			System.out.println("LUCIA: PAWANKUMAR");
		}
		else if(movie == MovieName.AVENGERS)
		{
			System.out.println("AVENGERS: JOSSWEDON");
		}
		else if(movie == MovieName.MUFTI)
		{
			System.out.println("MUFTI: NARTHAN");
		}
		else if(movie == MovieName.KGF){
			System.out.println("KGF: PRASHANTHNEEL");
		}
	}
}