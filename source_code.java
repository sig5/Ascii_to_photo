/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
import java.awt.*;
class source_code
{
	public static void main (String[] args) throws Exception
	{
try
{Color myWhite = new Color(255, 255, 255); // Color white
int rgb = myWhite.getRGB();
Color mblack = new Color(0, 0, 0); // Color white
int rgb2 = mblack.getRGB();
		int h=200,w=200;
		BufferedImage image=null;
System.out.println("Enter the string:()");
		String s[]=new String[200];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<200;i++)
		{
			s[i]=sc.nextLine();
		}
System.out.println("Enter the width");
w=sc.nextInt();
System.out.println("Enter the height");
h=sc.nextInt();
		image=new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<w;j++)
			{
				int a=s[i].charAt(j);

				if(a=='0')
				image.setRGB(i,j,rgb);
				else
				image.setRGB(i,j,rgb2);
			}}
System.out.println(" enter output file name");
	String c=new String();
	Scanner k=new Scanner(System.in);
	c=k.nextLine();

	System.out.println("okay");
            ImageIO.write(image, "png",new File(c));
		System.out.println("done");}
catch(Exception e)
{ System.out.println("caught Exception");}

			}}
		

