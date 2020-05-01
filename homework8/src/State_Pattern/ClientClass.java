package State_Pattern;

public class ClientClass {
	// ״̬ģʽ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadContext tc = new ThreadContext();
		tc.start();
		tc.getCPU();
		tc.suspend();
		tc.resume();
		tc.getCPU();
		tc.stop();
//		tc.start();
//		tc.getCPU();
//		tc.stop();
	}

}
