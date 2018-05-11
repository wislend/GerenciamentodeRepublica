package com.example.deyvi.gerenciamentoderepublica.fragments;


import android.support.v4.app.Fragment;
import android.widget.EditText;

import com.example.deyvi.gerenciamentoderepublica.R;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;


@EFragment(R.layout.fragment_passo_um_cadastro)
public class PassoUmCadastroFragment extends Fragment {

        @ViewById
        EditText edtNome;
        @ViewById
        EditText edtTelefone;
        @ViewById
        EditText edtEmail;
        @ViewById
        EditText edtSenha;
        @ViewById
        EditText edtConfirmacaoSenha;




}
