public class Main {
	public static void main(String[] args) {
		char[][] arr  = new char[6][4];
		
		for(int i= 0; i< arr.length; i++)
		{
			for (int k =0 ; k<arr[i].length; k++)
			{
				if( i == 1 && k == 1 ||
					i == 1 && k == 2 ||
					i == 4 && k == 1 ||
					i == 4 && k == 2)
				{
					arr[i][k] = ' ';
				}
				else {
					arr[i][k] = '*';
				}
			}
		}
		for (char[] chars : arr) {
			for (char aChar : chars) {
				System.out.print(aChar + " ");
			}
			System.out.println();
		}
	}
}