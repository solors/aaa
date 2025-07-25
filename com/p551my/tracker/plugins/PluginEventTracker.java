package com.p551my.tracker.plugins;

import com.p551my.tracker.obfuscated.C26382p;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.plugins.PluginEventTracker */
/* loaded from: classes7.dex */
public final class PluginEventTracker {

    /* renamed from: b */
    private static final Executor f69137b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    private final C26382p f69138a;

    private PluginEventTracker(C26382p c26382p) {
        this.f69138a = c26382p;
    }

    public static PluginEventTracker newTracker(C26382p c26382p) {
        return new PluginEventTracker(c26382p);
    }

    public static void onBackground(Runnable runnable) {
        f69137b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.f69138a.m41887a(i, bArr, z, z2, runnable);
    }
}
