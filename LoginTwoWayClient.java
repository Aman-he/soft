package com.sxt.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ģ���¼ ˫��
 * ����������
 * 1���������� ʹ��ServerSocke�����ͻ���+����ĵ�ַ�Ͷ˿�
 * 2���������������������
 * 3���ͷ���Դ
 * @author HZC
 *
 */
public class LoginTwoWayClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("------Client------");
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������û�����");
		String uname = console.readLine();
		System.out.println("���������룺");
		String upwd = console.readLine();
		
		//1���������� ʹ��ServerSocke�����ͻ���+����ĵ�ַ�Ͷ˿�
		Socket client = new Socket("localhost",8888);
		//2���������������������
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("uname="+uname+"&"+"upwd="+upwd);
		dos.flush();
		
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String reult = dis.readUTF();
		System.out.println(reult);
		//3���ͷ���Դ
		dos.close();
		client.close();
	}

}
