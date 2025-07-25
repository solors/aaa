package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.rl */
/* loaded from: classes8.dex */
public interface InterfaceC31296rl {

    /* renamed from: com.yandex.mobile.ads.impl.rl$a */
    /* loaded from: classes8.dex */
    public static class C31297a extends IOException {
        public C31297a(String str) {
            super(str);
        }

        public C31297a(String str, Throwable th) {
            super(str, th);
        }

        public C31297a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31298b {
        /* renamed from: a */
        void mo29987a(C30255em c30255em);

        /* renamed from: a */
        void mo29986a(InterfaceC31296rl interfaceC31296rl, C30255em c30255em);

        /* renamed from: a */
        void mo29985a(InterfaceC31296rl interfaceC31296rl, C30255em c30255em, C30255em c30255em2);
    }

    @WorkerThread
    /* renamed from: a */
    File mo27759a(String str, long j, long j2) throws C31297a;

    @WorkerThread
    /* renamed from: a */
    void mo27766a(C30255em c30255em);

    @WorkerThread
    /* renamed from: a */
    void mo27762a(File file, long j) throws C31297a;

    @WorkerThread
    /* renamed from: a */
    void mo27760a(String str);

    @WorkerThread
    /* renamed from: a */
    void mo27758a(String str, C31762wq c31762wq) throws C31297a;

    /* renamed from: b */
    long mo27752b(String str, long j, long j2);

    /* renamed from: b */
    C30130cy mo27753b(String str);

    /* renamed from: b */
    void mo27756b(C30255em c30255em);

    @Nullable
    @WorkerThread
    /* renamed from: c */
    C30255em mo27747c(String str, long j, long j2) throws C31297a;

    /* renamed from: d */
    long mo27746d(String str, long j, long j2);

    @WorkerThread
    /* renamed from: e */
    C30255em mo27745e(String str, long j, long j2) throws InterruptedException, C31297a;
}
