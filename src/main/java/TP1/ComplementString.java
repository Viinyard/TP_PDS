package TP1;

public class ComplementString extends Complement {
	
	private String name;
	
	public ComplementString(String name) {
		this.name = name;
	}

	@Override
	public String getText() {
		return this.name;
	}
}
