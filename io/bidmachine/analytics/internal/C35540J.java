package io.bidmachine.analytics.internal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: io.bidmachine.analytics.internal.J */
/* loaded from: classes9.dex */
public final class C35540J {

    /* renamed from: a */
    private final SimpleDateFormat f96314a = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());

    /* renamed from: a */
    public final Long m20383a(String str) {
        int i = Calendar.getInstance().get(1);
        SimpleDateFormat simpleDateFormat = this.f96314a;
        Date parse = simpleDateFormat.parse(i + '-' + str);
        if (parse != null) {
            return Long.valueOf(parse.getTime());
        }
        return null;
    }
}
