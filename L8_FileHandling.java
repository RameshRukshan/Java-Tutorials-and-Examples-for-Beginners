//Byte Stream

//File handling URL :- https://www.geeksforgeeks.org/file-handling-java-using-filewriter-filereader/

import java.io.*;		

class fH
{
	public static void main(String args[])
	{/*
		byte data1[] = {'A','B','C','D'};

//---------------File Writing--------------------------------------
		try{
			FileOutputStream st = new FileOutputStream("dataText.txt");
			st.write(data1);
			st.close();
		}catch(FileNotFoundException ex){
			System.out.println("File Not Found Error");
		}catch(IOException exx){
			System.out.println("IO Error");
		}

*/
//---------------File Reading--------------------------
		
		int result;
		try{
			FileInputStream stI = new FileInputStream("dataText.txt");

			while((result=stI.read()) != -1){
				System.out.println((char) result);
			}
			stI.close();
		}catch(FileNotFoundException ex){
			System.out.println("File Not Found Error");
		}catch(IOException exx){
			System.out.println("IO Error");
		}
/*
		char data[] = {'A','B','C','D'};

//---------------File Writing--------------------------------------
		try{
			FileWriter wr = new FileWriter("dataText.txt");
			wr.write(data);
			wr.close();
		}catch(FileNotFoundException ex){
			System.out.println("File Not Found Error");
		}catch(IOException exx){
			System.out.println("IO Error");
		}
*/
	}
}