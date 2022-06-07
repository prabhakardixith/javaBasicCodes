class Cigar
{
	public static boolean cigarParty(int cigars, boolean isWeekend) 
	{
		if(isWeekend && cigars>=40)
		{
			
				//System.out.println("party is succesful");
				return true;
			}
			else if(cigars >= 40 && cigars <= 60)
			{
				//System.out.println("party is succesful");
				return true;

			}
			else
			{
				//System.out.println("party is unsuccesful");
				return false;
			}
			
		}

	public static void main(String[] args) 
	{
		boolean ans;
		//cigarParty(40,true);
		
		System.out.println(cigarParty(40,true));// this is also possible
		//cigarParty(30,false);
		ans = cigarParty(30,false);
		System.out.println(ans);
		//cigarParty(40,false);
		ans = cigarParty(40,false);
		System.out.println(ans);

	}
}