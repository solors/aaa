package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.networktasks.impl.c */
/* loaded from: classes9.dex */
public final class C35122c {

    /* renamed from: a */
    public final String f95851a;

    public C35122c(String str) {
        this.f95851a = m20659a(str);
    }

    /* renamed from: a */
    public static String m20659a(String str) {
        if (str != null && str.length() != 0) {
            Uri parse = Uri.parse(str);
            if (Intrinsics.m17075f("http", parse.getScheme())) {
                return parse.buildUpon().scheme("https").build().toString();
            }
            return str;
        }
        return str;
    }
}
