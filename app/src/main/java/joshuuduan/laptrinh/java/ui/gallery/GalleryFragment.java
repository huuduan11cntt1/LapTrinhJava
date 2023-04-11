package joshuuduan.laptrinh.java.ui.gallery;

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
import joshuuduan.laptrinh.java.databinding.FragmentGalleryBinding;
import joshuuduan.laptrinh.java.ui.MainJavaCoBan;
import joshuuduan.laptrinh.java.ui.MainOopHTML;

public class GalleryFragment extends Fragment {
    ListView lv;
    ArrayAdapter<String> adapter;

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        String[] storyNames =getActivity().getResources().getStringArray(R.array.stories_oop);
        View view=inflater.inflate(R.layout.fragment_gallery,container,false);
        lv=(ListView) view.findViewById(R.id.idLvOop);
        adapter=new ArrayAdapter<>(getActivity(),R.layout.item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(getActivity(), MainOopHTML.class);
                intent.putExtra("MainOopHTML",i);
                startActivity(intent);
            }
        });

//        final TextView textView = binding.textGallery;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}