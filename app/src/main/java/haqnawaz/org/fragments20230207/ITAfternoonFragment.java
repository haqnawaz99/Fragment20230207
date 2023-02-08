package haqnawaz.org.fragments20230207;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ITAfternoonFragment extends Fragment {

    TextView AftIT;
    public ITAfternoonFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_i_t_afternoon, container, false);
        AftIT = view.findViewById(R.id.AftITtext);
        AftIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AftIT.setText("I'm Changed!BOOM!");
            }
        });
        return view;
    }
}