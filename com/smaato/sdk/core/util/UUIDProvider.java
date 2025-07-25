package com.smaato.sdk.core.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.p552ot.pubsub.util.C26601v;
import java.util.UUID;

/* loaded from: classes7.dex */
public class UUIDProvider {
    private final int maxTimeToGenerateNewUUIDInHours;
    private final SharedPreferences preferences;
    private final String SMAATO_SDK_UUID = "SMAATO_SDK_UUID";
    private final String UUID_STORE_TIME = "UUID_STORE_TIME";
    private final int MILLIS_IN_DAY = C26601v.f69837d;

    public UUIDProvider(Context context, Integer num) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.maxTimeToGenerateNewUUIDInHours = num.intValue() / 60;
    }

    public String getUuid() {
        if ((System.currentTimeMillis() - this.preferences.getLong("UUID_STORE_TIME", 0L)) / 3600000 < this.maxTimeToGenerateNewUUIDInHours) {
            return this.preferences.getString("SMAATO_SDK_UUID", "");
        }
        String uuid = UUID.randomUUID().toString();
        this.preferences.edit().putString("SMAATO_SDK_UUID", uuid).apply();
        this.preferences.edit().putLong("UUID_STORE_TIME", System.currentTimeMillis()).apply();
        return uuid;
    }
}
