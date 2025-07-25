package com.explorestack.iab.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.explorestack.iab.utils.v */
/* loaded from: classes3.dex */
public class C10541v {
    @NonNull

    /* renamed from: a */
    private final Context f24108a;

    public C10541v(@NonNull Context context) {
        this.f24108a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean m79178a() {
        return this.f24108a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
