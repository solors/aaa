package com.yandex.mobile.ads.impl;

import android.net.wifi.ScanResult;
import java.util.Comparator;
import p850qd.C39385c;

/* loaded from: classes8.dex */
public final class jd1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int m12778d;
        m12778d = C39385c.m12778d(Integer.valueOf(((ScanResult) t2).level), Integer.valueOf(((ScanResult) t).level));
        return m12778d;
    }
}
