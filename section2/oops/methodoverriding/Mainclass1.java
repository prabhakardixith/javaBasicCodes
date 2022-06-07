class Androidos
{
	public void showhomescreen()
	{
		System.out.println("showhomescreen of Androidos");
	}
}
class Oxygenos extends Androidos
{
	@Override
	public void showhomescreen()
	{
		System.out.println("showhomescreen of Oxygenos");
	}
}
class Coloros extends Androidos
{
	@Override
	public void showhomescreen()
	{
		System.out.println("showhomescreen of Coloros");
	}
}
class Onemi extends Androidos
{
	@Override
	public void showhomescreen()
	{
		System.out.println("showhomescreen of Onemi");
	}
}
class Moto extends Androidos
{
	@Override
	public void showhomescreen()
	{
		System.out.println("showhomescreen of Androidos");

	}

}
class Mainclass1
{
	public static void main(String[] args) {
		Androidos a = new Androidos();
		a.showhomescreen();
		Oxygenos o = new Oxygenos();
		o.showhomescreen();
		Coloros c = new Coloros();
		c.showhomescreen();
		Moto m = new Moto();
		m.showhomescreen();
	}
}