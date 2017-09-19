package com.khilman.mybrowser;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtURL)
    EditText txtURL;
    @BindView(R.id.btnGo)
    Button btnGo;
    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toast.makeText(this, "onCreate di jalankan", Toast.LENGTH_SHORT).show();
        // menampilkan webview
        TampilkanWebView();
    }

    @OnClick(R.id.btnGo) // event untuk btnGO
    public void onViewClicked() {
        TampilkanWebView();
    }
    public void TampilkanWebView(){
        // dapatkan url dari editext
        String url_tujuan = txtURL.getText().toString();
        // siapkan webview
        webView.getSettings().setJavaScriptEnabled(true); // aktifkan javascript
        webView.getSettings().getTextZoom();
        // setting web client
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //txtURL.setText(view.getUrl().toString());
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        webView.loadUrl(url_tujuan);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                showAbout();
                break;
            case R.id.report:
                showReport();
                break;
            case R.id.exit:
                showExit();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void showExit() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Konfirmasi");
        alert.setMessage("Keluar dari aplikasi?");
        alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
                System.exit(0);
            }
        });
        alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }

    private void showReport() {
        startActivity(new Intent(MainActivity.this, ReportActivity.class));

    }

    private void showAbout() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Tentang Browser");
        alert.setMessage("My Browser V.1.0.0 - Copyright 2017");
        alert.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart di jalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume di jalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause di jalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop di jalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy di jalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart di jalankan", Toast.LENGTH_SHORT).show();
    }
}
