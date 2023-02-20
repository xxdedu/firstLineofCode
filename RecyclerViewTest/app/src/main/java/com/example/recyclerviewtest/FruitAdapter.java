package com.example.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> mFruitList;

    /**
     * ViewHolder的构造函数中传入一个View参数，这个参数通常就是RecyclerView子项的最外层布局，
     * 那我们就可以通过findViewById()方法获取到布局的ImageView和TextView的实例
     */
    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView fruitImage;
        TextView textView;

        public ViewHolder(@NonNull View view) {
            super(view);
            fruitImage = view.findViewById(R.id.fruit_image);
            textView = view.findViewById(R.id.fruit_name);
        }
    }

    /**
     * 把要展示的数据源传进来，并赋值给全局变量mFruitList，后续的操作都在此进行
     * @param fruitList
     */
    public FruitAdapter(List<Fruit> fruitList) {
        mFruitList = fruitList;
    }

    /**
     * 用于创建ViewHolder实例
     * 将fruit_item布局加载进来；然后创建一个ViewHolder实例；并把加载出来的布局传入构造函数中；最后返回ViewHolder的实例
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public FruitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    /**
     * 用于对RecyclerView子项的数据进行赋值
     * 会在每个子项被滚动到屏幕内的时候执行，通过position参数得到当前项的Fruit实例，然后再将数据设置到ViewHolder的ImageView
     * 和TextView中
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.textView.setText(fruit.getName());
    }

    /**
     * 用于显示RecyclerView一共有多少子项，直接返回数据源长度即可
     * @return
     */
    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
