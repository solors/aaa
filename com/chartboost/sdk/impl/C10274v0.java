package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* renamed from: com.chartboost.sdk.impl.v0 */
/* loaded from: classes3.dex */
public class C10274v0 {

    /* renamed from: a */
    public static C10274v0 f23340a = new C10274v0();

    /* renamed from: b */
    public static C10274v0 m80326b() {
        return f23340a;
    }

    /* renamed from: a */
    public Task m80328a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e) {
            C9763c7.m81920b("Cannot retrieve appSetId client", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean m80327a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }

    /* renamed from: a */
    public String m80329a() {
        return Build.VERSION.RELEASE;
    }
}
