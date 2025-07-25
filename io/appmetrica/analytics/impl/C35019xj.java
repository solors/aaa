package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.xj */
/* loaded from: classes9.dex */
public final class C35019xj {

    /* renamed from: a */
    public final C34993wj f95608a;

    /* renamed from: b */
    public volatile C35009x9 f95609b;

    /* renamed from: c */
    public volatile C35009x9 f95610c;

    /* renamed from: d */
    public volatile C35009x9 f95611d;

    /* renamed from: e */
    public volatile C35009x9 f95612e;

    /* renamed from: f */
    public volatile C35009x9 f95613f;

    /* renamed from: g */
    public volatile C35009x9 f95614g;

    /* renamed from: h */
    public volatile ExecutorC34967vj f95615h;

    public C35019xj() {
        this(new C34993wj());
    }

    /* renamed from: a */
    public final IHandlerExecutor m20773a() {
        if (this.f95614g == null) {
            synchronized (this) {
                if (this.f95614g == null) {
                    this.f95608a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-SDE");
                    this.f95614g = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f95614g;
    }

    /* renamed from: b */
    public final IHandlerExecutor m20772b() {
        if (this.f95609b == null) {
            synchronized (this) {
                if (this.f95609b == null) {
                    this.f95608a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-SC");
                    this.f95609b = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f95609b;
    }

    /* renamed from: c */
    public final IHandlerExecutor m20771c() {
        if (this.f95611d == null) {
            synchronized (this) {
                if (this.f95611d == null) {
                    this.f95608a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-SMH-1");
                    this.f95611d = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f95611d;
    }

    /* renamed from: d */
    public final IHandlerExecutor m20770d() {
        if (this.f95612e == null) {
            synchronized (this) {
                if (this.f95612e == null) {
                    this.f95608a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-SNTPE");
                    this.f95612e = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f95612e;
    }

    /* renamed from: e */
    public final IHandlerExecutor m20769e() {
        if (this.f95610c == null) {
            synchronized (this) {
                if (this.f95610c == null) {
                    this.f95608a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-STE");
                    this.f95610c = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f95610c;
    }

    /* renamed from: f */
    public final Executor m20768f() {
        if (this.f95615h == null) {
            synchronized (this) {
                if (this.f95615h == null) {
                    this.f95608a.getClass();
                    this.f95615h = new ExecutorC34967vj(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.f95615h;
    }

    public C35019xj(C34993wj c34993wj) {
        new HashMap();
        this.f95608a = c34993wj;
    }
}
