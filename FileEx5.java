package files;


import java.io.*;
public class FileEx5 {

	public static void main(String[] args) {
		String path="D://FJWP1";
		File ob=new File(path);
		String dir[]=ob.list();
		for(int i=0;i<dir.length;i++)
		{
			System.out.println(dir[i]);
		}
	}

}