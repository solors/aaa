package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.h4 */
/* loaded from: classes9.dex */
public final class C34579h4 {

    /* renamed from: a */
    public final C34552g4 f94490a;

    /* renamed from: b */
    public volatile C35009x9 f94491b;

    /* renamed from: c */
    public volatile C35009x9 f94492c;

    public C34579h4() {
        this(new C34552g4());
    }

    /* renamed from: a */
    public final IHandlerExecutor m21639a() {
        if (this.f94491b == null) {
            synchronized (this) {
                if (this.f94491b == null) {
                    this.f94490a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-CDE");
                    this.f94491b = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f94491b;
    }

    /* renamed from: b */
    public final ICommonExecutor m21638b() {
        if (this.f94492c == null) {
            synchronized (this) {
                if (this.f94492c == null) {
                    this.f94490a.getClass();
                    HandlerThreadC34348Ya m20782a = C35009x9.m20782a("IAA-CRS");
                    this.f94492c = new C35009x9(m20782a, m20782a.getLooper(), new Handler(m20782a.getLooper()));
                }
            }
        }
        return this.f94492c;
    }

    public C34579h4(C34552g4 c34552g4) {
        this.f94490a = c34552g4;
    }
}
