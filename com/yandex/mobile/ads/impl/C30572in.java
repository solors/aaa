package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C15633C;
import java.nio.charset.Charset;

/* renamed from: com.yandex.mobile.ads.impl.in */
/* loaded from: classes8.dex */
public final class C30572in {

    /* renamed from: a */
    public static final Charset f80562a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f80563b = Charset.forName(C15633C.ISO88591_NAME);

    /* renamed from: c */
    public static final Charset f80564c = Charset.forName("UTF-8");

    /* renamed from: d */
    public static final Charset f80565d;

    /* renamed from: e */
    public static final Charset f80566e;

    static {
        Charset.forName("UTF-16BE");
        f80565d = Charset.forName(C15633C.UTF16LE_NAME);
        f80566e = Charset.forName("UTF-16");
    }
}
