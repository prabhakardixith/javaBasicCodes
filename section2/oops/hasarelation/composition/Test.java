//container
class Car
{
	String cname;
	Engine eng=null;
	int id;
	public Car(String cname,int id)
	{
		this.cname=cname;
		this.id=id;
	}

	public void ShowCarDeatails()
	{
		System.out.println("Car name : "+cname);
	}

}
//contaning
class Engine
{
	String ename;
	Car cr = null;
	int id;
	public Engine(String ename,int id)
	{
		this.ename=ename;
		this.id=id;
	}
	public void ShowEngineDeatails()
	{
		System.out.println("Engine name : "+ename);
	}
}
class CarService
{
	Engine e = null;
	Car c = null;
	int id=1;
  public void addEngine(String cname,String ename)
  {
  	e = new Engine(ename,id);
  	c = new Car(cname,id);

  	e.cr = c;
  	c.eng = e;
  	id++;

  }
  public void ShowDetails()
  {
  	System.out.println("id : "+c.eng.id);
  	c.eng.ShowEngineDeatails();
  	e.cr.ShowCarDeatails();


  }
}
class Test 
{
	
	public static void main(String[] args) 
	{ 
	CarService cs = new CarService();
	cs.addEngine("BMW","Heero");
	cs.ShowDetails();
	

	  

     }
}

