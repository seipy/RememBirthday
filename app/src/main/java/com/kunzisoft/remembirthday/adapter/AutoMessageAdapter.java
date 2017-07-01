package com.kunzisoft.remembirthday.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kunzisoft.remembirthday.R;
import com.kunzisoft.remembirthday.element.AutoMessage;


/**
 * Adapter who manage list of auto messages
 */
public class AutoMessageAdapter extends AbstractReminderAdapter<AutoMessage, AutoMessageViewHolder> {

    @Override
    public void addDefaultItem() {
        addReminder(new AutoMessage());
    }

    @Override
    public AutoMessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_auto_messages, parent, false);
        return new AutoMessageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AutoMessageViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        AutoMessage currentAutoMessage = listReminders.get(position);
        // TODO assign content of message
        holder.messageContent.setText(currentAutoMessage.getContent());
    }
}
