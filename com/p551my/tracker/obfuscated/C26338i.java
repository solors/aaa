package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.my.tracker.obfuscated.i */
/* loaded from: classes7.dex */
final class C26338i {

    /* renamed from: a */
    int f68630a = 1;

    /* renamed from: b */
    int f68631b = -1;

    /* renamed from: a */
    public void m42037a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            this.f68630a = 1;
            this.f68631b = -1;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        this.f68630a = registerReceiver.getIntExtra("status", 1);
        if (intExtra < 0 || intExtra2 <= 0) {
            this.f68631b = -1;
        } else {
            this.f68631b = (intExtra * 100) / intExtra2;
        }
    }

    /* renamed from: a */
    public void m42036a(C26405s0 c26405s0, Context context) {
        c26405s0.m41674f(this.f68630a);
        int i = this.f68631b;
        if (i >= 0) {
            c26405s0.m41678e(i);
        }
    }

    /* renamed from: b */
    public void m42035b(Context context) {
    }
}
