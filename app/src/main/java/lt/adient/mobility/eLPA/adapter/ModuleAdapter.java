package lt.adient.mobility.eLPA.adapter;

import android.content.Context;

import java.util.List;

import lt.adient.mobility.eLPA.database.model.ModuleData;

public class ModuleAdapter extends BaseAdapter<ModuleData> {

    public ModuleAdapter(Context context, int textViewResourceId, List<ModuleData> items) {
        super(context, textViewResourceId, items);
    }

    @Override
    public String getText(int position) {
        return getItem(position).getModuleName();
    }
}
