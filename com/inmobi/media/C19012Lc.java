package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.inmobi.media.C19012Lc;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Lc */
/* loaded from: classes6.dex */
public final class C19012Lc {

    /* renamed from: b */
    public static Context f47447b;

    /* renamed from: c */
    public static Handler f47448c;

    /* renamed from: d */
    public static boolean f47449d;

    /* renamed from: f */
    public static List f47451f;

    /* renamed from: a */
    public static final C19012Lc f47446a = new C19012Lc();

    /* renamed from: e */
    public static final IntentFilter f47450e = new IntentFilter("android.net.wifi.SCAN_RESULTS");

    /* renamed from: g */
    public static final Runnable f47452g = new Runnable() { // from class: o3.t0
        @Override // java.lang.Runnable
        public final void run() {
            C19012Lc.m60919b();
        }
    };

    /* renamed from: h */
    public static final C18998Kc f47453h = new C18998Kc();

    /* renamed from: b */
    public static final void m60919b() {
        f47446a.m60920a();
    }

    /* renamed from: a */
    public final synchronized void m60920a() {
        Handler handler = f47448c;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(f47452g);
        if (f47449d) {
            f47449d = false;
            try {
                Context context = f47447b;
                if (context != null) {
                    context.unregisterReceiver(f47453h);
                }
            } catch (IllegalArgumentException unused) {
                Intrinsics.checkNotNullExpressionValue("Lc", "TAG");
            }
        }
        f47448c = null;
        f47447b = null;
    }
}
