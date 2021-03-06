package il.ac.hit.project.model;

public class Branch {
	private int id;
	private String name;
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	//*Constructor */
	public Branch(int id, String name,double x,double y) {
		//super();
		setId(id);
		setName(name);
		setX(x);
		setY(y);
	}

	public Branch() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + id + ", name=" + name + "]";
	}

}
