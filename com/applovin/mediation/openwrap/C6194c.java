package com.applovin.mediation.openwrap;

import android.os.Bundle;

/* renamed from: com.applovin.mediation.openwrap.c */
/* loaded from: classes2.dex */
public class C6194c {

    /* renamed from: a */
    public final String f12866a;

    /* renamed from: b */
    public final int f12867b;

    /* renamed from: c */
    public final String f12868c;

    public C6194c(String str, int i, String str2) {
        this.f12866a = str;
        this.f12867b = i;
        this.f12868c = str2;
    }

    /* renamed from: a */
    public static C6194c m92227a(String str, Bundle bundle) {
        Integer num;
        String str2;
        if (bundle != null) {
            str2 = bundle.getString("publisher_id");
            if (bundle.containsKey("profile_id")) {
                num = Integer.valueOf(bundle.getInt("profile_id"));
            } else {
                num = null;
            }
        } else {
            num = null;
            str2 = null;
        }
        if (num == null) {
            return null;
        }
        return new C6194c(str2, num.intValue(), str);
    }
}
