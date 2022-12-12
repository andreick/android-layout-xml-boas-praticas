package br.com.alura.aluraviagens.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        Pacote pacoteSp = new Pacote("São Paulo", "sao_paulo_sp", 2,
                new BigDecimal("243.99"));

        ImageView ivLocal = findViewById(R.id.resumo_pacote_iv_local);
        Drawable drawable = ResourceUtil.devolveDrawable(this, pacoteSp.getImagem());
        ivLocal.setImageDrawable(drawable);

        TextView tvLocal = findViewById(R.id.resumo_pacote_tv_local);
        tvLocal.setText(pacoteSp.getLocal());

        TextView tvDias = findViewById(R.id.resumo_pacote_tv_dias);
        tvDias.setText(pacoteSp.getLocal());

        TextView tvPreco = findViewById(R.id.resumo_pacote_tv_preco);
        String preco = MoedaUtil.formataParaBrasileiro(pacoteSp.getPreco());
        tvPreco.setText(preco);
    }
}