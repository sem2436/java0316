package java0316;

public class extends0316 implements duck{
	public static void main(String[] args) {
		System.out.println("== û�տ��� ==");
		û�տ��� aû�տ��� = new û�տ���();
		aû�տ���.����(); // ������ ������ ���ư��ϴ�.
		aû�տ���.�����ϴ�(); // ������ �������� �����մϴ�.
		
		System.out.println("== ����� ==");
		����� a����� = new �����();
		a�����.����(); // ������ ������ ���ư��ϴ�.
		a�����.�����ϴ�(); // ������ �������� �����մϴ�.
		
		System.out.println("== ������ ==");
		������ a������ = new ������();
		a������.����(); // ���� �� ���ƿ� �Ф�
		a������.�����ϴ�(); // ������ ���� �յ� ���ٴմϴ�.
		
		System.out.println("== ��2���� ==");
		��2���� a��2���� = new ��2����();
		a��2����.����(); // ���� �� ���ƿ� �Ф�
		a��2����.�����ϴ�(); // ������ ���� �յ� ���ٴմϴ�.
		
		System.out.println("== �κ����� ==");
		extends0316 a�κ����� = new extends0316();
		a�κ�����.����(); // ������ ������ ���ư��ϴ�.
		a�κ�����.�����ϴ�(); // ������ ���� �յ� ���ٴմϴ�.
	}

	@Override
	public void ����() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ ���ư��ϴ�");
	}

	@Override
	public void �����ϴ�() {
		// TODO Auto-generated method stub	
		System.out.println("������ ���� �յ� ���ٴմϴ�.");
	}
}
class ���� {
	void ����() {
		System.out.println("������ ������ ���ư��ϴ�.");
	}
	
	void �����ϴ�() {
		System.out.println("������ �������� �����մϴ�.");
	}
}
class ����� extends ���� { }
class û�տ��� extends ���� { }
class ������ extends ���� {
	void ����() {
		System.out.println("���� �� ���ƿ�. �̤�");
	}
	
	void �����ϴ�() {
		System.out.println("������ ���� �յ� ���ٴմϴ�.");
	}
}
class ��2���� extends ������ { }

