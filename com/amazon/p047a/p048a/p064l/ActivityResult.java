package com.amazon.p047a.p048a.p064l;

import android.app.Activity;
import android.content.Intent;
import com.ironsource.C21114v8;

/* renamed from: com.amazon.a.a.l.a */
/* loaded from: classes2.dex */
public class ActivityResult {

    /* renamed from: a */
    private final Activity f2498a;

    /* renamed from: b */
    private final int f2499b;

    /* renamed from: c */
    private final int f2500c;

    /* renamed from: d */
    private final Intent f2501d;

    public ActivityResult(Activity activity, int i, int i2, Intent intent) {
        this.f2498a = activity;
        this.f2499b = i;
        this.f2500c = i2;
        this.f2501d = intent;
    }

    /* renamed from: a */
    public Activity m103029a() {
        return this.f2498a;
    }

    /* renamed from: b */
    public int m103028b() {
        return this.f2499b;
    }

    /* renamed from: c */
    public Intent m103027c() {
        return this.f2501d;
    }

    /* renamed from: d */
    public int m103026d() {
        return this.f2500c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f2499b + ", resultCode: " + this.f2500c + ", activity: " + this.f2498a + ", intent: " + this.f2501d + C21114v8.C21123i.f54139e;
    }
}
