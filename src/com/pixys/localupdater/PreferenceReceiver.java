package com.pixys.localupdater;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.pixys.localupdater.misc.Utilities;

public class PreferenceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Utilities.resetPreferences(context);
        Utilities.cleanInternalDir();
    }
}
