package com.springTest.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		
		try {
			// 创建一个ServerSocket，监听8080端口
			ServerSocket serverSocket = new ServerSocket(8080);
			// 等待请求
			Socket socket = serverSocket.accept();
			//  接收请求后使用Socket进行通信，创建BufferedReader用于读取数据 
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 接收数据
			String line = bufferedReader.readLine();
			System.out.println("Received from client:" + line);
			// 创建PrintWriter用于发送数据
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			// 发送数据
			printWriter.println("received data:" + line);
			printWriter.flush();
			// 关闭资源
			printWriter.close();
			bufferedReader.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
