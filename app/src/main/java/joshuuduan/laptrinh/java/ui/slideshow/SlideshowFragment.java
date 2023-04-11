package joshuuduan.laptrinh.java.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import joshuuduan.laptrinh.java.R;
import joshuuduan.laptrinh.java.databinding.FragmentSlideshowBinding;
import joshuuduan.laptrinh.java.ui.MainFileIOHTML;
import joshuuduan.laptrinh.java.ui.MainJavaCoBan;

public class SlideshowFragment extends Fragment {
    ListView lv;
    ArrayAdapter<String> adapter;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);


        String[] storyNames =getActivity().getResources().getStringArray(R.array.stories_file_io);
        View view=inflater.inflate(R.layout.fragment_slideshow,container,false);
        lv=(ListView) view.findViewById(R.id.idLvFileio);
        adapter=new ArrayAdapter<>(getActivity(),R.layout.item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(getActivity(), MainFileIOHTML.class);
                intent.putExtra("FileIO",i);
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