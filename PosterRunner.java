class PosterRunner{

public static void main(String[] args){
      
	 double width = 7.6d;
	 double length = 3.5d;
     String material = "paper";
     String content = "about Clothes"; 
	 
	 
	 Poster poster = new Poster();
	 poster.info();
	 
	 Poster poster1 = new Poster(width);
	 poster1.info();
	 
	 Poster poster2 = new Poster(width,length);
	 poster2.info();
	 
	 Poster poster3 = new Poster(width,length,material);
	 poster3.info();
	 
	 Poster poster4 = new Poster(width,length,material,content);
	 poster4.info();
    }
}