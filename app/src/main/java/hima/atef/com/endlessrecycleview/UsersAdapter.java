package hima.atef.com.endlessrecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ViewHolder> {
    private Context context;
    private List<Users> mList;

    public UsersAdapter(Context context, List<Users> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public UsersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_users, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.ViewHolder holder, int position) {

        holder.textName.setText(mList.get(position).getName());
        holder.textEmail.setText(mList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        if (mList.size() > 0) {
            return mList.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View mView;
        TextView textName,textEmail;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            textName = mView.findViewById(R.id.user_name);
            textEmail = mView.findViewById(R.id.user_email);
        }
    }
}
