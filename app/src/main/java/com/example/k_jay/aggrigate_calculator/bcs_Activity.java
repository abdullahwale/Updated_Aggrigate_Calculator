package com.example.k_jay.aggrigate_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class bcs_Activity extends AppCompatActivity {
    Button btnOKBcs, btnClearBcs;
    TextView tvAnswerBcs;
    EditText matricObtain, matricTotal, interObtain, interTotal, NtsObtain;

    float matric_Obtain;
    float matric_Total;
    float inter_Obtain;
    float inter_Total;
    float nts_obtain;

    float matric_percent;
    float matric_ten_pesent;
    float inter_percent;
    float inter_40_percent;
    float nts_percent;
    float nts_50_persent;
    float marit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcs_);
        btnOKBcs = (Button) findViewById(R.id.btnOKBcs);
        btnClearBcs = (Button) findViewById(R.id.btnClearBcs);

        tvAnswerBcs = (TextView) findViewById(R.id.TvAnswerBcs);
        matricObtain = (EditText) findViewById(R.id.matricObtain);
        matricTotal = (EditText) findViewById(R.id.matricTotal);
        interObtain = (EditText) findViewById(R.id.interObtain);
        interTotal = (EditText) findViewById(R.id.interTotal);
        NtsObtain = (EditText) findViewById(R.id.NtsObtain);

        btnOKBcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(matricObtain.getText())
                        || TextUtils.isEmpty(matricTotal.getText())
                        || TextUtils.isEmpty(interObtain.getText())
                        || TextUtils.isEmpty(interTotal.getText())
                        || TextUtils.isEmpty(NtsObtain.getText()))
                {
                    Toast.makeText(getApplicationContext(), "Something wrong! Check Input!", Toast.LENGTH_SHORT).show();
                }
                else {
                    matric_Obtain = Float.parseFloat(matricObtain.getText().toString());
                    matric_Total = Float.parseFloat(matricTotal.getText().toString());
                    inter_Obtain = Float.parseFloat(interObtain.getText().toString());
                    inter_Total = Float.parseFloat(interTotal.getText().toString());
                    nts_obtain = Float.parseFloat(NtsObtain.getText().toString());

                    matric_percent = (matric_Obtain / matric_Total) * 100.0f;
                    matric_ten_pesent = (matric_percent / 100.0f) * 10.0f;
                    inter_percent = (inter_Obtain /inter_Total) * 100.0f;
                    inter_40_percent = (inter_percent / 100.0f) * 40.0f;
                    nts_percent = (nts_obtain / 100) * 100.0f;
                    nts_50_persent = (nts_percent / 100.0f) * 50.0f ;
                    marit = matric_ten_pesent + inter_40_percent + nts_50_persent;

                    tvAnswerBcs.setText(Float.valueOf(marit).toString());
                }

            }
        });

        btnClearBcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswerBcs.setText("");
                matricObtain.setText("");
                matricTotal.setText("");
                interObtain.setText("");
                interTotal.setText("");
                NtsObtain.setText("");
            }
        });
    }
}
