package id.alterra.domain;

public class Seller {

	private Long id;
	private String name;
	private Long birthDate;

	

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(Long id, String name, Long birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Seller(Long id, Long birthDate, String name) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}


	public Seller(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}


}
