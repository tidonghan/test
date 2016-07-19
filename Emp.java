import java.io.*;
public class Emp implements Serializable
{
	private Integer id;
	private String name;
	private String job;
	private Double sal;
	private Double common;

	public String toString(){
	  return "一位雇员!";
	}
}
