package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.fyber.inneractive.sdk.config.n */
/* loaded from: classes4.dex */
public abstract class AbstractC14395n {
    /* renamed from: a */
    public static void m77921a(Context context, C14415w c14415w) {
        String str;
        boolean z = false;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0) {
                z = true;
            }
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Settings.SettingNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            synchronized (c14415w) {
                C14414v c14414v = c14415w.f27285b;
                c14414v.f27281a = str;
                c14414v.f27282b = z;
                c14414v.f27283c = true;
            }
        }
    }
}
