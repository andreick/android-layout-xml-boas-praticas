package br.com.alura.aluraviagens.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.MoedaUtil;

public class PagamentoActivity extends AppCompatActivity {

    private static final String TITULO_APPBAR = "Pagamento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        setTitle(TITULO_APPBAR);

        Pacote pacoteSp = new Pacote("São Paulo", "sao_paulo_sp", 2,
                new BigDecimal("2430000000.99"));

        mostraPreco(pacoteSp);
    }

    private void mostraPreco(Pacote pacote) {
        TextView tvPrecoPacote = findViewById(R.id.pagamento_tv_preco_pacote);
        String precoFormatado = MoedaUtil.formatarParaBrasileiro(pacote.getPreco());
        tvPrecoPacote.setText(precoFormatado);
    }
}