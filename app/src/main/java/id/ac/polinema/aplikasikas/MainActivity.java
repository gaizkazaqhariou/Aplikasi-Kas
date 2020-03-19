package id.ac.polinema.aplikasikas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import id.ac.polinema.aplikasikas.adapter.TransactionAdapter;

public class MainActivity extends AppCompatActivity {

    public static final String TRANSACTION_KEY = "TRANSACTION";
    public static final String INDEX_KEY = "INDEX";
    public static final int INSERT_REQUEST = 1;
    public static final int UPDATE_REQUEST = 2;

    private TextView welcomeText, balanceText;
    private RecyclerView transactionView;
    private TransactionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
