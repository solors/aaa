package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes7.dex */
public class TzSettingsImpl implements TzSettings {
    private final Context context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TzSettingsImpl(Context context) {
        this.context = context;
    }

    @Override // com.smaato.sdk.core.locationaware.TzSettings
    public boolean isAutoTimeZoneEnabled() {
        if (Settings.Global.getInt(this.context.getContentResolver(), "auto_time_zone", 0) <= 0) {
            return false;
        }
        return true;
    }
}
