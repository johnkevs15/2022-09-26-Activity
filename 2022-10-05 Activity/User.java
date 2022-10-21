

// package 10-03-22;

public class User { 
String Fname;
String Lname;

public  User(String Fname, String Lname){
  this.Fname = Fname;
  this.Lname = Lname;
    
  }
  public void setFname(String fname) {
      Fname = fname;
  }
  public String getFname() {
      return Fname;
  }
  public String getLname() {
      return Lname;
  }
  public void setLname(String lname) {
      Lname = lname;
  }
// public String toString(){
//   String user = "The user "+ this.getFname()+ "and the last name: "+this.getLname();
//   return user;
// }
}
