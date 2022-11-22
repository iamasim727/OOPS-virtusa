import java.util.*;
import javax.lang.model.util.ElementScanner14;
import java.io.*;
class Book{
    Scanner in=new Scanner(System.in);
    ArrayList<String> arr= new ArrayList<String>(Arrays.asList("murdernyts", "ghostbusters","lifeofpie","redemption","imprisoned","harrypotter"));
    ArrayList<String> user=new ArrayList<String>();
    void available(){
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i) + " "); 
        }
        System.out.println();
    }
    void addbook(){
        int f1=0;
        System.out.println("Enter a book name to add : ");
        String s=in.nextLine();
        for(int i=0;i<arr.size();i++){
            if(arr.contains(s)){
                user.add(s);
                arr.remove(s);
                f1=1;
                System.out.println("Your book "+s+" Added Successfully\n");
                break;
            }
        }
        if(f1==0)
            System.out.println("Book Not found!");
       
    }
    void removebook(){
        int f1=0;
        System.out.println("Enter a book name to remove : ");
        String r=in.nextLine();
        for(int i=0;i<user.size();i++){
            if(user.contains(r)){
                user.remove(r);
                arr.add(r);
                f1=1;
                System.out.println("Your book "+r+" removed Successfully\n");
                break;
            }
        }
        if(f1==0)
            System.out.println("Book Not found!");
    }
    void mybooks(){
        if(user.size()==0)
            System.out.println("Your Book List is Empty");
        else{
            System.out.println("Your Book List : ");
            for (int i = 0; i < user.size(); i++){
                System.out.println(user.get(i) + " "); 
            }
            System.out.println();
        }
        
    }
    
}
class Project extends Book{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int login=123;
        String pwd="123MLRIT";
        int flag=0;
        while(true){
            System.out.print("ENTER LOGIN ID: ");
            int log=in.nextInt();
            System.out.print("ENTER PASSWORD: ");
            String pwds=in.next();
            if(log==login && pwd.equals(pwds))
            {
                System.out.println("\nLogged in Successfully!!!");
                Project p=new Project();
                while(true)
                {    
                    System.out.println("--------------------------");
                    System.out.println("Welcome to Library System\n");
                    System.out.println("1.Available books\n2.Add Book\n3.Remove Book\n4.My Book List\n5.Logout\n");
                    System.out.println("--------------------------");
                    System.out.println("Enter your choice : ");
                    int ch=in.nextInt();
                    switch(ch)
                    {
                        case 1: System.out.println("Available Books are : ");
                                p.available();
                                break;
                        case 2: p.addbook();
                                break;
                        case 3: p.removebook();
                                break;
                        case 4: p.mybooks();
                                break;
                        case 5: System.out.println("Logged out successfully!");
                                if(flag==0){
                                    flag=1;
                                }
                                break;
                    }
                if(flag==1)
                    break;
                }
            }
            else
                System.out.println("Invalid Credntials ");
        }
    }
}
