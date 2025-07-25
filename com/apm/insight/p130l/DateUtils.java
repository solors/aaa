package com.apm.insight.p130l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.apm.insight.l.b */
/* loaded from: classes2.dex */
public final class DateUtils {

    /* renamed from: a */
    private static DateFormat f3912a;

    /* renamed from: a */
    public static DateFormat m101749a() {
        if (f3912a == null) {
            f3912a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f3912a;
    }
}
