package Flyweight_Pattern;

public abstract class APiece {
	protected String inKind;

	public APiece(String inKind) {
		this.inKind = inKind;
	}

	// �������ӵ�λ��
	public abstract void Play(int x, int y);
}
