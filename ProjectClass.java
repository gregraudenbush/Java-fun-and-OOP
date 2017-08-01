import java.util.*;
import java.lang.*;

public class ProjectClass{
  // ProjectClass<String, String> project = new ProjectClass<>();
  private String name;
  private String description;
  


  public void Project(){
  }
  public void Project(String name){
    this.name = name;
  }
  public void Project(String name, String description){
    this.name = name;
    this.description = description;
  }
  
  public void elevatorPitch(){
    System.out.println(name + ": " + description);
  }
  public void getName(){
    System.out.println(name);
  }
  public void getDescription(){
    System.out.println(description);
  }
}