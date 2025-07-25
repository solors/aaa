package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes5.dex */
class DateStrings {
    private DateStrings() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Pair<String, String> m71605a(@Nullable Long l, @Nullable Long l2) {
        return m71604b(l, l2, null);
    }

    /* renamed from: b */
    static Pair<String, String> m71604b(@Nullable Long l, @Nullable Long l2, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, m71602d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return Pair.create(m71602d(l.longValue(), simpleDateFormat), null);
        }
        Calendar m71493j = UtcDates.m71493j();
        Calendar m71491l = UtcDates.m71491l();
        m71491l.setTimeInMillis(l.longValue());
        Calendar m71491l2 = UtcDates.m71491l();
        m71491l2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (m71491l.get(1) == m71491l2.get(1)) {
            if (m71491l.get(1) == m71493j.get(1)) {
                return Pair.create(m71600f(l.longValue(), Locale.getDefault()), m71600f(l2.longValue(), Locale.getDefault()));
            }
            return Pair.create(m71600f(l.longValue(), Locale.getDefault()), m71595k(l2.longValue(), Locale.getDefault()));
        } else {
            return Pair.create(m71595k(l.longValue(), Locale.getDefault()), m71595k(l2.longValue(), Locale.getDefault()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m71603c(long j) {
        return m71602d(j, null);
    }

    /* renamed from: d */
    static String m71602d(long j, @Nullable SimpleDateFormat simpleDateFormat) {
        Calendar m71493j = UtcDates.m71493j();
        Calendar m71491l = UtcDates.m71491l();
        m71491l.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (m71493j.get(1) == m71491l.get(1)) {
            return m71601e(j);
        }
        return m71596j(j);
    }

    /* renamed from: e */
    static String m71601e(long j) {
        return m71600f(j, Locale.getDefault());
    }

    /* renamed from: f */
    static String m71600f(long j, Locale locale) {
        return UtcDates.m71501b(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m71599g(long j) {
        return m71598h(j, Locale.getDefault());
    }

    /* renamed from: h */
    static String m71598h(long j, Locale locale) {
        return UtcDates.m71500c(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static String m71597i(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static String m71596j(long j) {
        return m71595k(j, Locale.getDefault());
    }

    /* renamed from: k */
    static String m71595k(long j, Locale locale) {
        return UtcDates.m71489n(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static String m71594l(long j) {
        return m71593m(j, Locale.getDefault());
    }

    /* renamed from: m */
    static String m71593m(long j, Locale locale) {
        return UtcDates.m71488o(locale).format(new Date(j));
    }
}
