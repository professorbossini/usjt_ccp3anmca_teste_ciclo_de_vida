package br.com.bossini.usjt_ccp3anmca_teste_ciclo_de_vida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ciclodevida";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity.onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity.onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity.onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity.onRestart");
    }

    public void segundaActivity (View view){
        Intent intent = new Intent (this, SegundaActivity.class);
        startActivity(intent);
    }
}
