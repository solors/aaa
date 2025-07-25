package com.p552ot.pubsub.util;

import androidx.work.PeriodicWorkRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.ot.pubsub.util.v */
/* loaded from: classes7.dex */
public class C26601v {

    /* renamed from: a */
    public static final long f69834a = 604800000;

    /* renamed from: b */
    public static final long f69835b = 86400000;

    /* renamed from: c */
    public static final long f69836c = 43200000;

    /* renamed from: d */
    public static final int f69837d = 3600000;

    /* renamed from: e */
    public static final int f69838e = 60000;

    /* renamed from: f */
    public static final int f69839f = 1000;

    /* renamed from: g */
    public static final String f69840g = "yyyyMMdd";

    /* renamed from: h */
    private static final String f69841h = "TimeUtil";

    /* renamed from: a */
    public static boolean m40959a(long j) {
        long m40948f = m40948f();
        return m40948f <= j && j < 86400000 + m40948f;
    }

    /* renamed from: b */
    public static boolean m40954b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        return timeInMillis <= j && j < 86400000 + timeInMillis;
    }

    /* renamed from: c */
    public static long m40953c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = (currentTimeMillis - (currentTimeMillis % 86400000)) - 86400000;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    /* renamed from: d */
    public static long m40951d() {
        return (m40953c() + 86400000) - 1;
    }

    /* renamed from: e */
    public static String m40949e() {
        return TimeZone.getDefault().getDisplayName(false, 0);
    }

    /* renamed from: f */
    public static long m40948f() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: g */
    public static long m40947g() {
        return (m40948f() + 86400000) - 1;
    }

    /* renamed from: h */
    public static long m40946h() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: i */
    public static long m40945i() {
        return (m40948f() + 86400000) - 1;
    }

    /* renamed from: j */
    public static boolean m40944j() {
        long m40948f = m40948f() + 86400000;
        long j = m40948f - PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        long currentTimeMillis = System.currentTimeMillis();
        if (j < currentTimeMillis && currentTimeMillis < m40948f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static long m40960a() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    public static boolean m40950d(long j) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    /* renamed from: a */
    public static String m40956a(Date date) {
        return new SimpleDateFormat(f69840g).format(date);
    }

    /* renamed from: c */
    public static int m40952c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(11);
    }

    /* renamed from: a */
    public static Date m40957a(String str) {
        Date date = new Date();
        try {
            return new SimpleDateFormat(f69840g).parse(str);
        } catch (Exception e) {
            C26586j.m41073b(f69841h, "integerStringToDate exception:", e);
            return date;
        }
    }

    /* renamed from: b */
    public static long m40955b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        C26586j.m41080a(f69841h, "getTodayLocalBeginTime " + timeInMillis);
        return timeInMillis;
    }

    /* renamed from: a */
    public static boolean m40958a(long j, long j2) {
        return Math.abs(System.currentTimeMillis() - j) >= j2;
    }
}
