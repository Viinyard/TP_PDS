package TP1;

public class ComplementId extends Complement {
	private Id id;
	
	public ComplementId(Id id) {
		this.id = id;
	}

	@Override
	public String getText() {
		return this.id.getName();
	}
}
