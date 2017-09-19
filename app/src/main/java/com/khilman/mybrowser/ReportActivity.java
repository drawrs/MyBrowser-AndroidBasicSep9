package com.khilman.mybrowser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReportActivity extends AppCompatActivity {

    @BindView(R.id.edtReport)
    EditText edtReport;
    @BindView(R.id.btnReport)
    Button btnReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnReport)
    public void onViewClicked() {
        Toast.makeText(this, "Laporan telah dikirim ! Terimakasih :)", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(ReportActivity.this, MainActivity.class));
        finish();
    }
}
