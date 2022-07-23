package lesson20.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
* После подключение клиента сервер запрашивает имя
* в дальнейшем все сообщения будут отправляться в формате Имя: сообщение
*
 **/

public class Server {
    public static void main(String[] args) {
        try {
            ArrayList<User> users = new ArrayList<>();
            ServerSocket serverSocket = new ServerSocket(9743);
            System.out.println("Сервер запущен");
            while (true){
                Socket socket = serverSocket.accept();
                User currentUser = new User(socket);

                users.add(currentUser);
                System.out.println("Клиент подключился");

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            currentUser.getOut().writeUTF("Введите имя");
                            String name = currentUser.getIn().readUTF();
                            currentUser.setName(name);
                            while (true){
                                String userMessage = currentUser.getIn().readUTF();
                                System.out.println(userMessage);
                                for(User user:users){
                                    System.out.println(user.getName() + ", UUID:" + user.getUuid().toString());
                                    if(!currentUser.getUuid().equals(user.getUuid())){
                                    user.getOut().writeUTF(name + ":" + userMessage);
                                    }
                                }
                            }
                        } catch (IOException e) {
                            System.out.println("Клиент " + currentUser.getName() + " отключился");
                            users.remove(currentUser);
                            }
                    }
                });
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
