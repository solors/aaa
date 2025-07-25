package com.five_corp.p372ad.internal.storage;

import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.five_corp.ad.internal.storage.r */
/* loaded from: classes4.dex */
public final class C14093r {

    /* renamed from: b */
    public static final Pattern f26299b = Pattern.compile("(\\.\\w+)$");

    /* renamed from: a */
    public final Random f26300a;

    public C14093r(Random random) {
        this.f26300a = random;
    }

    /* renamed from: a */
    public static String m78106a(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            str = str.substring(0, lastIndexOf);
        }
        String[] split = str.split("=");
        if (split.length != 3) {
            return null;
        }
        return split[1];
    }
}
