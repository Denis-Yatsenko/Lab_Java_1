//User
package com.company.Task7;

public class User {
    public String FirstName;
    public String LastName;
    public String email;
    public int age;

    public User(String FirstName, String LastName, String email, int age) {
        setFirstName(FirstName);
        setLastName(LastName);
        setEmail(email);
        setAge(age);
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
        public String getFirstName() {
            return FirstName;
        }

        public String getLastName() {
            return LastName;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        User guest = (User) obj;
        return age == guest.age
                && (FirstName == guest.FirstName
                || (FirstName != null && FirstName.equals(guest.getFirstName()))) && (LastName == guest.LastName
                || (LastName != null && LastName.equals(guest.getLastName()) && (email == guest.email
                || (email != null && email.equals(guest.getEmail())
        ))));
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result +
                ((FirstName == null) ? 0 :FirstName.hashCode());
        result = prime * result +
                ((LastName == null) ? 0 : LastName.hashCode());
        result = prime * result +
                ((email == null) ? 0 : email.hashCode());
        result = prime * result + age;
        return result;
    }
}





