package accounts;

import java.util.Objects;

public class AccountHolder {
    private String lastName;
    private String name;

    public AccountHolder(String lastName, String name, Branch branch) {
        this(lastName, name);
        branch.addCustomer(this);
    }

    public AccountHolder(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()) {
            return false;
        }
        AccountHolder other = (AccountHolder) o;
        return other.name.equals(name) && other.lastName.equals(lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name);
    }

    @Override
    public String toString() {
        return lastName + " " + name;
    }

    public String getLastName() {
        return lastName;
    }
}
