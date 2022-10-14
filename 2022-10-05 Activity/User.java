

// package 10-03-22;

public class User { 
String Fname;
String Lname;

public  User(String Fname, String Lname){
  this.Fname = Fname;
  this.Lname = Lname;
    
  }
  
  public String getFname(String Fname){
    return this.Fname;

  }

  public String setFname (String Fname){
    return this.Fname = Fname;
  }

public String getLname() {
    return Lname;
}
public String setLname(String lname) {
    return Lname = lname;
}

}
