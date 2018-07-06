package com.desafiolatam.sismoschile.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.desafiolatam.sismoschile.R;
import com.desafiolatam.sismoschile.network.GetInfoMovement;

public class MainActivity extends AppCompatActivity {

    private TextView resultadoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new BackgroundInfoSismo().execute();

    }

    private class BackgroundInfoSismo extends GetInfoMovement {

        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.show();
        }

        @Override
        protected void onPostExecute(String info) {
            if (info != null) {
                TextView result = findViewById(R.id.sismoResult);
                result.setText(info);
            }
            progressDialog.dismiss();
        }
    }


}
