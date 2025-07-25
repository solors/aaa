package com.chartboost.sdk.impl;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p1046xd.C44986p;
import p1046xd.Closeable;

/* renamed from: com.chartboost.sdk.impl.h9 */
/* loaded from: classes3.dex */
public final class C9919h9 {

    /* renamed from: a */
    public final Resources f22218a;

    public C9919h9(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f22218a = resources;
    }

    /* renamed from: a */
    public final String m81501a(int i) {
        BufferedReader bufferedReader;
        try {
            InputStream openRawResource = this.f22218a.openRawResource(i);
            Intrinsics.m17074g(openRawResource);
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            String m1163g = C44986p.m1163g(bufferedReader);
            Closeable.m1220a(bufferedReader, null);
            Closeable.m1220a(openRawResource, null);
            return m1163g;
        } catch (Exception e) {
            C9763c7.m81920b("Raw resource file exception", e);
            return null;
        }
    }
}
