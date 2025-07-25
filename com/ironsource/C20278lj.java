package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.lj */
/* loaded from: classes6.dex */
public class C20278lj {

    /* renamed from: c */
    private static C20278lj f51022c;

    /* renamed from: a */
    private final HashSet<ImpressionDataListener> f51023a = new HashSet<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, List<String>> f51024b = new ConcurrentHashMap<>();

    C20278lj() {
    }

    /* renamed from: b */
    public static synchronized C20278lj m57433b() {
        C20278lj c20278lj;
        synchronized (C20278lj.class) {
            if (f51022c == null) {
                f51022c = new C20278lj();
            }
            c20278lj = f51022c;
        }
        return c20278lj;
    }

    /* renamed from: a */
    public HashSet<ImpressionDataListener> m57436a() {
        return this.f51023a;
    }

    /* renamed from: c */
    public ConcurrentHashMap<String, List<String>> m57431c() {
        return this.f51024b;
    }

    /* renamed from: d */
    public void m57430d() {
        synchronized (this) {
            this.f51023a.clear();
        }
    }

    /* renamed from: a */
    public void m57435a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f51023a.add(impressionDataListener);
        }
    }

    /* renamed from: b */
    public void m57432b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f51023a.remove(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void m57434a(String str, List<String> list) {
        this.f51024b.put(str, list);
    }
}
