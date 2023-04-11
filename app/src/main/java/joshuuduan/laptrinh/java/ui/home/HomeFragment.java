package joshuuduan.laptrinh.java.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import joshuuduan.laptrinh.java.R;
import joshuuduan.laptrinh.java.databinding.FragmentHomeBinding;
import joshuuduan.laptrinh.java.ui.MainJavaCoBan;

public class HomeFragment extends Fragment {

    ListView lv;
    ArrayAdapter<String> adapter;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        String[] storyNames =getActivity().getResources().getStringArray(R.array.stories_names);
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        lv=(ListView) view.findViewById(R.id.idLvHome);
        adapter=new ArrayAdapter<>(getActivity(),R.layout.item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(getActivity(), MainJavaCoBan.class);
                intent.putExtra("JavaCoBan",i);
                startActivity(intent);
            }
        });

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}