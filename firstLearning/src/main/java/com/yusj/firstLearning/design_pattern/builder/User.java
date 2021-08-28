package com.yusj.firstLearning.design_pattern.builder;

public class User {
    private String name;
    private Integer age;
    private String password;
    private String nickName;
    private User(String name,Integer age,String password,String nickName){
        this.name = name;
        this.age = age;
        this.password = password;
        this.nickName = nickName;
    }

    private static class UserBuilder{
        private String name;
        private Integer age;
        private String password;
        private String nickName;

        public User builder(){
            return new User(name,age,password,nickName);
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserBuilder nickName(String nickName){
            this.nickName = nickName;
            return this;
        }
    }

    public static void main(String[] args) {
        User user = new UserBuilder().name("yusj").builder();
    }
}
