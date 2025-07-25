package com.bytedance.sdk.openadsdk.p358vb.p360bX;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.bytedance.sdk.openadsdk.vb.bX.bg */
/* loaded from: classes3.dex */
public class C9577bg {

    /* renamed from: bg */
    private final SharedPreferences f21363bg;

    public C9577bg(Context context) {
        this.f21363bg = context.getSharedPreferences("pag_monitor_record", 0);
    }

    /* renamed from: bg */
    public long m82346bg() {
        return this.f21363bg.getLong("last_upload_time", 0L);
    }

    /* renamed from: bg */
    public void m82345bg(long j) {
        SharedPreferences.Editor edit = this.f21363bg.edit();
        edit.putLong("last_upload_time", j);
        edit.apply();
    }
}
