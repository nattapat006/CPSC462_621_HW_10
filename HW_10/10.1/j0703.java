import java.io.*;
public class j0703 {
  public static void main (String args[]) throws IOException {
    int i = 0;
    String b;
    String[] fields;
    String[] recs = new String[100];
    //
    FileReader fin = new FileReader("orderdetails.txt");
    BufferedReader bin = new BufferedReader (fin);
    //
    while ((b =  bin.readLine()) != null) {
      recs[i] = b;
      i = i + 1;
    }
    fin.close();
    //
    FileOutputStream fout1 = new FileOutputStream("orderdetails1.txt");
    BufferedOutputStream bout1 = new BufferedOutputStream(fout1);
    PrintStream pout1 = new PrintStream(bout1);
    for(int j=0;j<i;j++) {
      fields = recs[j].split(",");
	if(Integer.parseInt(fields[0]) <1111106)
{
      pout1.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
}
    }
    pout1.close();
  
	FileOutputStream fout2 = new FileOutputStream("orderdetails2.txt");
    BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
    PrintStream pout2 = new PrintStream(bout2);
    for(int j=0;j<i;j++) {
      fields = recs[j].split(",");
	if(Integer.parseInt(fields[0]) > 1111105)
{
      pout2.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
      //System.out.println(fields[0]+","+fields[1]+","+Integer.valueOf(fields[3]).intValue() + 100+","+fields[3]);
} 
   }
    pout2.close();
}
}
