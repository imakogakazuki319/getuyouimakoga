public class Main3_4{
	public static void main(String[] args){
		System.out.println("���Ȃ��̉^����肢�܂�");
		int fortune=new java.util.Random().nextInt(4)+1;
		if (fortune==1){
			System.out.println("��g");
		}else if (fortune==2){
			System.out.println("���g");
		}else if (fortune==3){
			System.out.println("�g");
		}else{
			System.out.println("��");
		}
	}
}