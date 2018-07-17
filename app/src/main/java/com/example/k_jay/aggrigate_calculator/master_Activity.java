package com.example.k_jay.aggrigate_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class master_Activity extends AppCompatActivity {
    Button btnOkMstr, btnClearMstr;

    TextView tvAnswerMstr;

    EditText matricObtainMstr, matricTotalMstr;
    EditText interObtainMstr, interTotalMstr;
    EditText bachularObtainMstr, bachularTotalMastr;
    EditText ntsObtain;

    float matric_obtain;
    float matric_total;
    float inter_obtain;
    float inter_total;
    float bachular_obtain;
    float bachular_total;
    float nts_obtain;
    float matric_percent;
    float inter_percent;
    float bachular_percent;
    float nts_percent;
    float matric_10_percent;
    float inter_15_percent;
    float bachular_25_percent;
    float nts_50_percent;
    float marit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_);
        btnOkMstr = (Button) findViewById(R.id.btnOKmstr);
        btnClearMstr = (Button) findViewById(R.id.btnClearMstr);
        tvAnswerMstr = (TextView) findViewById(R.id.tvAnswerMstr);
        matricObtainMstr = (EditText) findViewById(R.id.matricObtainMstr);
        matricTotalMstr = (EditText) findViewById(R.id.matricTotalMstr);
        interObtainMstr = (EditText) findViewById(R.id.interObtainMstr);
        interTotalMstr = (EditText) findViewById(R.id.interTotalMstr);
        bachularObtainMstr = (EditText) findViewById(R.id.bachularObtainMstr);
        bachularTotalMastr = (EditText) findViewById(R.id.bachularTotalMstr);
        ntsObtain = (EditText) findViewById(R.id.ntsObtainMstr);

        btnOkMstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(matricObtainMstr.getText()) || TextUtils.isEmpty(matricTotalMstr.getText()) || TextUtils.isEmpty(interObtainMstr.getText()) || TextUtils.isEmpty(interTotalMstr.getText()) || TextUtils.isEmpty(ntsObtain.getText()) || TextUtils.isEmpty(bachularObtainMstr.getText()) || TextUtils.isEmpty(bachularTotalMastr.getText()))
                {
                    Toast.makeText(getApplicationContext(), "Some thing wrong! Check input!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    matric_obtain = Float.parseFloat(matricObtainMstr.getText().toString());
                    matric_total = Float.parseFloat(matricTotalMstr.getText().toString());
                    inter_obtain = Float.parseFloat(interObtainMstr.getText().toString());
                    inter_total = Float.parseFloat(interTotalMstr.getText().toString());
                    bachular_obtain = Float.parseFloat(bachularObtainMstr.getText().toString());
                    bachular_total = Float.parseFloat(bachularTotalMastr.getText().toString());
                    nts_obtain = Float.parseFloat(ntsObtain.getText().toString());
                    matric_percent = (matric_obtain / matric_total) * 100.0f;
                    inter_percent = (inter_obtain / inter_total) * 100.0f;
                    bachular_percent = (bachular_obtain / bachular_total) * 100.0f;
                    nts_percent = (nts_obtain / 100) * 100;
                    matric_10_percent = (matric_percent / 100.0f) * 10.0f;
                    inter_15_percent = (inter_percent / 100.0f) * 15.0f;
                    bachular_25_percent = (bachular_percent / 100.0f) * 25.0f;
                    nts_50_percent = (nts_percent / 100.0f) * 50.0f;
                    marit = matric_10_percent + inter_15_percent + bachular_25_percent + nts_50_percent;
                    tvAnswerMstr.setText(Float.valueOf(marit).toString());
                }
            }
        });

        btnClearMstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswerMstr.setText("");
                matricObtainMstr.setText("");
                matricTotalMstr.setText("");
                interObtainMstr.setText("");
                interTotalMstr.setText("");
                bachularObtainMstr.setText("");
                bachularTotalMastr.setText("");
                ntsObtain.setText("");
            }
        });
    }
}
