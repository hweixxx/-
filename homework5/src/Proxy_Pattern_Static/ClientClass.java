package Proxy_Pattern_Static;

public class ClientClass {
	// ��̬����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CLocalPicShow cls = new CLocalPicShow(); //�����߳�ͼƬ
		IShowPic cls = new CLocalPicShow();
		cls.ShowPic("photo");
	}

}
