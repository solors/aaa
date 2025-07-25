package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes5.dex */
class TimeSource {

    /* renamed from: c */
    private static final TimeSource f37436c = new TimeSource(null, null);
    @Nullable

    /* renamed from: a */
    private final Long f37437a;
    @Nullable

    /* renamed from: b */
    private final TimeZone f37438b;

    private TimeSource(@Nullable Long l, @Nullable TimeZone timeZone) {
        this.f37437a = l;
        this.f37438b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static TimeSource m71503c() {
        return f37436c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar m71505a() {
        return m71504b(this.f37438b);
    }

    /* renamed from: b */
    Calendar m71504b(@Nullable TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f37437a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
