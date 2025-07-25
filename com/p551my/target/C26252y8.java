package com.p551my.target;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.my.target.y8 */
/* loaded from: classes7.dex */
public final class C26252y8 implements Closeable {

    /* renamed from: d */
    public static final C26252y8 f68366d = new C26252y8(1000);

    /* renamed from: e */
    public static final Handler f68367e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final int f68368a;

    /* renamed from: b */
    public final WeakHashMap f68369b = new WeakHashMap();

    /* renamed from: c */
    public final Runnable f68370c = new Runnable() { // from class: com.my.target.vf
        @Override // java.lang.Runnable
        public final void run() {
            C26252y8.this.m42298b();
        }
    };

    public C26252y8(int i) {
        this.f68368a = i;
    }

    /* renamed from: a */
    public void m42299a(Runnable runnable) {
        synchronized (this) {
            int size = this.f68369b.size();
            if (this.f68369b.put(runnable, Boolean.TRUE) == null && size == 0) {
                m42301a();
            }
        }
    }

    /* renamed from: b */
    public void m42297b(Runnable runnable) {
        synchronized (this) {
            this.f68369b.remove(runnable);
            if (this.f68369b.size() == 0) {
                f68367e.removeCallbacks(this.f68370c);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f68369b.clear();
        f68367e.removeCallbacks(this.f68370c);
    }

    /* renamed from: a */
    public static C26252y8 m42300a(int i) {
        return new C26252y8(i);
    }

    /* renamed from: b */
    public void m42298b() {
        synchronized (this) {
            for (Runnable runnable : new ArrayList(this.f68369b.keySet())) {
                runnable.run();
            }
            if (this.f68369b.keySet().size() > 0) {
                m42301a();
            }
        }
    }

    /* renamed from: a */
    public final void m42301a() {
        f68367e.postDelayed(this.f68370c, this.f68368a);
    }
}
