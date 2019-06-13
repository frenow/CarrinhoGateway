package loja;

public class Carrinho {
	private long id;
	private float total;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Carrinho(long id, float total) {
		this.id = id;
		this.total = total;
	}
	
	

}
