
public class cards
	{
		private static String name;
		private static int number;
		public cards(String n, int i )
		{
			name = n;
			number = i;
		}
		public static String getName()
			{
			return name;
			}

		public void setName(String name)
			{
			this.name = name;
			}
		
		
		public int getNumber()
			{
			return number;
			}
		public void setNumber(int number)
			{
			this.number = number;
			}
			
	}
