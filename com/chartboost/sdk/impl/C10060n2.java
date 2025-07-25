package com.chartboost.sdk.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.n2 */
/* loaded from: classes3.dex */
public final class C10060n2 {

    /* renamed from: a */
    public static final C10060n2 f22641a = new C10060n2();

    /* renamed from: a */
    public static final List m81042a(File file, boolean z) {
        List m17166m;
        if (file == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && !Intrinsics.m17075f(file2.getName(), ".nomedia")) {
                Intrinsics.m17074g(file2);
                arrayList.add(file2);
            } else if (file2.isDirectory() && z) {
                arrayList.addAll(m81042a(file2, z));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final String m81041b() {
        return "Chartboost-Android-SDK  9.8.1";
    }

    /* renamed from: a */
    public static final String m81043a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
