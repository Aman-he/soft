package com.sxt.udp;
/**
 * ������̣߳�ʵ��˫���� ģ��������ѯ
 * @author HZC
 *
 */
public class TalkTeacher {
	public static void main(String[] args) {
		new Thread(new TalkReceive(9999,"ѧ��")).start();//����
		
		new Thread(new TalkSend(5555,"localhost",8888)).start();//����
	}
}
