
    
package com.ps.my_first_plugin;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.StringTokenizer;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


/**
 * Hello world!
 *
 */


@Mojo(name = "hello")
public class App extends AbstractMojo
{
	
	@Parameter(property = "relativePath",defaultValue = "/")
    private String relativePath;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
        	
        	String absolutePath = FileSystems.getDefault().getPath(relativePath).normalize().toAbsolutePath().toString();
        	 FileReader filer = new FileReader(
                   absolutePath);

            BufferedReader buffr = new BufferedReader(filer);


            boolean eof = false;
            boolean flag = false;
            int totalMissed=0;
            int totalCovered=0;
            while (!eof)


            {


                String s = buffr.readLine();


                if (s == null)


                {
                    eof = true;
                }


                else


                {


                    if (flag) {
                        StringTokenizer st = new StringTokenizer(s, ",");
                        st.nextToken();
                        st.nextToken();
                        String fileName = st.nextToken();
                    int missed=Integer.parseInt(st.nextToken()+"");
                    totalMissed+=missed;
                    int covered=Integer.parseInt(st.nextToken()+"");
                    totalCovered+=covered;
                    int percentage=(int)((covered*100)/(covered+missed));
                        System.out.println(fileName+"    "+percentage);
                    }
                    else {
                        flag=true;
                    }
                }


            }
            
            System.out.println("********************");
            System.out.println( "Total Coverage  "+((totalCovered*100)/(totalCovered+totalMissed)));
            System.out.println("********************");
        } catch (FileNotFoundException e) {
            System.out.println("no report generated");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
 


















