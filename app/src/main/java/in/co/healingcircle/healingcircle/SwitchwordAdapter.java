package in.co.healingcircle.healingcircle;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SwitchwordAdapter extends RecyclerView.Adapter<SwitchwordAdapter.MyViewHolder> {

    private Typeface typefaceHeading, typefaceContent;
    private List<SwitchwordModel> list = new ArrayList<>();

    public SwitchwordAdapter(List<SwitchwordModel> list) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row, parent, false);
        typefaceHeading = Typeface.createFromAsset(view.getContext().getAssets(), "fonts/TitilliumWeb-Light.ttf");
        typefaceContent = Typeface.createFromAsset(view.getContext().getAssets(), "fonts/EncodeSans-Light.ttf");
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SwitchwordModel switchword = list.get(position);
        holder.heading.setText(switchword.getHeading());
        holder.heading.setTypeface(typefaceContent);
        holder.description.setText(switchword.getDescription());
        holder.description.setTypeface(typefaceContent);
        holder.number.setText(switchword.getNumber());
        holder.number.setTypeface(typefaceContent);

        holder.descriptionHeading.setTypeface(typefaceHeading);
        holder.numberHeading.setTypeface(typefaceHeading);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView heading, description, number, descriptionHeading, numberHeading;


        public MyViewHolder(View itemView) {
            super(itemView);
            heading = (TextView) itemView.findViewById(R.id.headingTV);
            description = (TextView) itemView.findViewById(R.id.descriptionTV);
            number = (TextView) itemView.findViewById(R.id.numberTV);
            descriptionHeading = (TextView) itemView.findViewById(R.id.description);
            numberHeading = (TextView) itemView.findViewById(R.id.number);

        }
    }
}
