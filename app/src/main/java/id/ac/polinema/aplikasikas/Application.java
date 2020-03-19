package id.ac.polinema.aplikasikas;

import id.ac.polinema.aplikasikas.model.Account;

public class Application extends android.app.Application {
    private static Account account;

    public static Account getAccount() {
        return account;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        account = new Account("Gaizka");
    }
}
