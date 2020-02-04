package by.Katya.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private static int incId = 1;
    @NotBlank(message = "Введите имя")
    private String name;
    @NotBlank(message = "Введите логин")
    private String login;
    @Min(value = 18, message = "Вам нет 18")
    private int age;
    @NotBlank(message = "Введите пароль")
    private String password;
    private int id = incId++;

    public User(String name, String login, int age, String password) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.password = password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
