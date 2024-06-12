package org.example.behavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User user = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(user);
        chat.addUser(user2);

        user.sendMessage("i'm user");
        admin.sendMessage("i'm admin");
    }
}

interface User {
    void sendMessage(String message);
    void getMessage(String message);
}

interface Chat {
    void sendMessage(String message, User user);
}

class Admin implements User {
    private Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin got message: '" + message + "'");
    }
}

class SimpleUser implements User {
    private Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("SimpleUser got message: '" + message + "'");
    }
}

class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!u.equals(user)) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}