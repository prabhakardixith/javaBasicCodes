//container
class Car
{
	String name="BMW";
	String color="red";
	MusicPlayer mc;

	public void showCarDetails()
	{
		System.out.println("car name : "+name);
		System.out.println("car color : "+color);
	}
}
//contaning
class MusicPlayer
{
	String Bname;
	String Mname;
	int id;

	public MusicPlayer(String Bname,String Mname,int id)
	{
		this.Bname=Bname;
		this.Mname=Mname;
		this.id=id;
	}
	public  void showMPdetails()
	{
		System.out.println("Brand id : "+id);
		System.out.println("Brand name : "+Bname);
		System.out.println("Model name : "+Mname);
	}
}
class CarService
{
	static int id=1;
	Car c = new Car();

	public  void addMP(String Bname,String Mname)
	{
		c.mc = new MusicPlayer(Bname,Mname,id);
		id++;
	}
	 public  void showCarDetails()
	 {
	 	c.showCarDetails();
	 	if(c.mc == null)
	 	{
	 		System.out.println("no MusicPlayer added");
	 	}
	 	else
	 	{
	 		c.mc.showMPdetails();
	 	}
	 }
}
class Test 
{
	
	public static void main(String[] args) 
	{ 
	CarService cs = new CarService();
	cs.addMP("boat","Blutooth");
	cs.showCarDetails();
	cs.addMP("Jbl","Wired");
	cs.showCarDetails();


	  

     }
}

