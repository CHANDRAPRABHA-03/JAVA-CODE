class Poster{
    double width;
	double length;
	String content;
	String material;
	
public Poster( )
{
	System.out.println("Default values :");
}
public Poster(double width)
    {
      this.width = width;
     }
public Poster(double width,double length)
{
	this.width =width;
	this.length = length;
}
public Poster(double width,double length,String content)
{
	this.width = width;
	this.length = length;
    this.content = content;	
}
public Poster(double width,double length,String content,String material)
{
	this.width = width;
	this.length = length;
    this.content = content;
	this.material = material;
}
public void info(){
	System.out.println("width :" + this.width);
	System.out.println("length :" + this.length);
	System.out.println("Content :" + this.content);
	System.out.println("Material :" + this.material);
}
}