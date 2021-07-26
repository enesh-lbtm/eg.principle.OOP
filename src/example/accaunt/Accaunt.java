package example.accaunt;

public class Accaunt {
    int acc_no;
    String name;
    float amount;
    void insetr(int a, String n, float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposite(float amt){
        amount = amount + amt;
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("ne dostatochno sredstv");
        }
    }
}
