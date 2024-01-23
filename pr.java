package testpack;

class student{
	protected int id;
	protected String name;
	protected String address;
	public student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
class maths extends student{
	protected int math;
	public maths(int id, String name, String address,int math) {
		super(id, name, address);
		this.math=math;
		
	}
	@Override
	public String toString() {
		return super.toString()+"maths [math=" + math + "]";
	}
	
	

}
class sceince extends maths{
	protected int chem;
	protected int phy;
	public sceince(int id, String name, String address, int math,int chem,int phy) {
		super(id, name, address, math);
		this.chem=chem;
		this.phy=phy;
		
	}
	@Override
	public String toString() {
		return super.toString() +"sceince [chem=" + chem + ", phy=" + phy + "]";
	}
	
	
}
public class multiple {
	public static void main(String[] args) {
		sceince s=new sceince(1, "jareena", "ja", 23, 87, 98);
		System.out.println(s);
	}
	
	
}


