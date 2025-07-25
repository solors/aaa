package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.AbstractC22930u;

/* compiled from: Common.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.d */
/* loaded from: classes6.dex */
public final class C22920d {
    /* renamed from: a */
    public static String m49447a(String str, AbstractC22930u<?> abstractC22930u) {
        if (!TextUtils.isEmpty(str) && abstractC22930u != null) {
            byte[] m49398p = abstractC22930u.m49398p();
            if (m49398p != null && m49398p.length != 0) {
                if (str.endsWith("?")) {
                    return str + new String(m49398p);
                }
                return str + "?" + new String(m49398p);
            }
            return str;
        }
        return "";
    }
}
