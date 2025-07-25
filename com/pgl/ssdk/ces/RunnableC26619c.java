package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.C26643k0;
import com.pgl.ssdk.C26645l0;
import java.util.Map;

/* renamed from: com.pgl.ssdk.ces.c */
/* loaded from: classes7.dex */
public class RunnableC26619c implements Runnable {

    /* renamed from: a */
    private Context f69878a;

    /* renamed from: b */
    private String f69879b;

    /* renamed from: c */
    private Map<String, Object> f69880c;

    public RunnableC26619c(Context context, String str, Map<String, Object> map) {
        this.f69878a = context;
        this.f69879b = str;
        this.f69880c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bArr = (byte[]) C26614a.meta(222, this.f69878a, new Object[]{this.f69879b, this.f69880c});
            if (bArr == null || bArr.length <= 0 || TextUtils.isEmpty(C26645l0.m40834a())) {
                return;
            }
            new C26643k0(this.f69878a, null).m40826a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
