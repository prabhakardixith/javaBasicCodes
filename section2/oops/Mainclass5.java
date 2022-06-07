//Model / Entity
class User
{
   int uid;
   String name;
   String email;
   long mob;

   public User(int uid,String name,String email,long mob)
   {
    //gv  = lv
      this.uid   = uid;
      this.name  = name;
      this.email = email;
      this.mob   = mob;
   }
}

//Service
class UserService
{
    static User u1;
    static int uid;

    //signup
    public static void createUser(String name,String email,long mob)
    {
       u1 = new User(uid,name,email,mob);
       //save data to db
       System.out.println("user acnt created");
       uid++;
    }

    //profile
    public static void showUser()
    {
      System.out.println("UID : "+uid);
      System.out.println("Name  : "+u1.name);
      System.out.println("Email : "+u1.email);
      System.out.println("mob   : "+u1.mob);
    }
}

//FE
class Mainclass6
{
  public static void main(String[] args)//fm
	{
	   System.out.println("Program starts...");

     UserService.createUser("Arjun","arjun@gmail.com",987661231l);
     UserService.showUser();

     UserService.createUser("Virat","virat@gmail.com",878672811l);
     UserService.showUser();
	   
     System.out.println("Program ends...");	
	}
}