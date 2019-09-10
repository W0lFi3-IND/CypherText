package com.wolfie.cyphertext;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class encrypt extends Fragment {
    EditText ed1,ed2;
    ImageButton btn1;
    TextView tv1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.encrypt,viewGroup, false);

btn1=(ImageButton)RootView.findViewById(R.id.imageButton2);
        ed1 = (EditText)RootView.findViewById(R.id.editText3);
        ed2 = (EditText)RootView.findViewById(R.id.editText4);
        tv1=(TextView)RootView.findViewById(R.id.textView5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getContext()
                        .getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(((Activity) getContext()).getWindow()
                        .getCurrentFocus().getWindowToken(), 0);
                String data;
                String finall = "";
                String aa=ed2.getText().toString();
                String print = "";
                int i, n, key = 0;
                data = ed1.getText().toString().toLowerCase();
              key=Integer.parseInt(aa);
                n = data.length();
                char data2;
                char data1[] = data.toCharArray();
                String[] chemsym = new String[]{"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga",
                        "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb",
                        "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es",
                        "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"};
                // string array to char array
                //encryption
                for (i = 0; i < n; i++) {
                    if (Character.isLetter(data1[i])) {
                        data2 = (char) (((int) data1[i] + key - 97) % 26 + 97);
                        print = print + data2;
                    } else if (data1[i] == ' ') {
                        print = print + data1[i];
                    }
                }
                char print1[]=print.toCharArray();
                String[] data3 = new String[500];
                for(i=0; i<print1.length; i++)
                {
                    if(print1[i]=='a')
                    {
                        data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                else if(print1[i]=='b')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='c')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='d')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='e')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='f')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='g')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='h')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='j')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='k')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='l')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='m')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='n')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='o')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='p')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='q')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='r')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='s')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='t')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='u')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='v')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='w')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='x')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='y')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                    else if(print1[i]=='z')
                    { data3[i]=chemsym[(i+ key - 97) % 26 + 97];
                    }
                }
                List<String> list = new ArrayList<String>();
                for(String s : data3) {
                    if(s != null && s.length() > 0) {
                        list.add(s);
                    }
                }

                data3 = list.toArray(new String[list.size()]);

                for(i=0;i<data3.length;i++)
{
    finall+=data3[i];
}
tv1.setText(finall);

            }
        });
        return RootView;
    }
}
