package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9353eqN;

/* renamed from: com.bytedance.sdk.openadsdk.core.bX */
/* loaded from: classes3.dex */
public class C8879bX {

    /* renamed from: bg */
    private static volatile C8879bX f19639bg;

    private C8879bX() {
    }

    /* renamed from: bg */
    public static C8879bX m84507bg(Context context) {
        if (f19639bg == null) {
            synchronized (C8879bX.class) {
                if (f19639bg == null) {
                    f19639bg = new C8879bX();
                }
            }
        }
        return f19639bg;
    }

    /* renamed from: IL */
    public String m84508IL(String str, String str2) {
        return C9353eqN.m82984IL("ttopenadsdk", str, str2);
    }

    /* renamed from: IL */
    public int m84510IL(String str, int i) {
        return C9353eqN.m82980bg("ttopenadsdk", str, i);
    }

    /* renamed from: IL */
    public Long m84509IL(String str, long j) {
        return Long.valueOf(C9353eqN.m82979bg("ttopenadsdk", str, j));
    }

    /* renamed from: bg */
    public void m84504bg(String str, String str2) {
        C9353eqN.m82974bg("ttopenadsdk", str, str2);
    }

    /* renamed from: bg */
    public void m84506bg(String str, int i) {
        C9353eqN.m82977bg("ttopenadsdk", str, Integer.valueOf(i));
    }

    /* renamed from: bg */
    public void m84505bg(String str, long j) {
        C9353eqN.m82976bg("ttopenadsdk", str, Long.valueOf(j));
    }
}
