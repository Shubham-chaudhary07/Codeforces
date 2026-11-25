import java.util.Scanner;
 
public class A785 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        int faces=0;
        for(String s: words){
            if(s.equals("Tetrahedron")){
                faces+=4;
            } else if (s.equals("Cube" )) {
                faces+=6;
                
                
            } else if (s.equals("Octahedron")) {
                faces+=8;
                
            } else if (s.equals("Dodecahedron" )) {
                faces+=12;
                
            }
            else {
                faces+=20;
            }
        }
        System.out.println(faces);
 
    }
}