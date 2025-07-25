package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.Nullable;
import com.google.android.material.C16310R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
class UtcDates {

    /* renamed from: a */
    static AtomicReference<TimeSource> f37439a = new AtomicReference<>();

    private UtcDates() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m71502a(long j) {
        Calendar m71491l = m71491l();
        m71491l.setTimeInMillis(j);
        return m71498e(m71491l).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m71501b(Locale locale) {
        return m71499d("MMMd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m71500c(Locale locale) {
        return m71499d("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: d */
    private static DateFormat m71499d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m71492k());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Calendar m71498e(Calendar calendar) {
        Calendar m71490m = m71490m(calendar);
        Calendar m71491l = m71491l();
        m71491l.set(m71490m.get(1), m71490m.get(2), m71490m.get(5));
        return m71491l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static SimpleDateFormat m71497f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m71494i());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m71496g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C16310R.C16316string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C16310R.C16316string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C16310R.C16316string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: h */
    static TimeSource m71495h() {
        TimeSource timeSource = f37439a.get();
        if (timeSource == null) {
            return TimeSource.m71503c();
        }
        return timeSource;
    }

    /* renamed from: i */
    private static TimeZone m71494i() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Calendar m71493j() {
        Calendar m71505a = m71495h().m71505a();
        m71505a.set(11, 0);
        m71505a.set(12, 0);
        m71505a.set(13, 0);
        m71505a.set(14, 0);
        m71505a.setTimeZone(m71494i());
        return m71505a;
    }

    @TargetApi(24)
    /* renamed from: k */
    private static android.icu.util.TimeZone m71492k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Calendar m71491l() {
        return m71490m(null);
    }

    /* renamed from: m */
    static Calendar m71490m(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m71494i());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: n */
    public static DateFormat m71489n(Locale locale) {
        return m71499d("yMMMd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: o */
    public static DateFormat m71488o(Locale locale) {
        return m71499d("yMMMEd", locale);
    }
}
