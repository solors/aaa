package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.kf */
/* loaded from: classes9.dex */
public final class RunnableC34671kf implements Runnable {

    /* renamed from: a */
    public final File f94786a;

    /* renamed from: b */
    public final Consumer f94787b;

    /* renamed from: c */
    public final C34323X9 f94788c;

    public RunnableC34671kf(File file, C33857E1 c33857e1, C34323X9 c34323x9) {
        this.f94786a = file;
        this.f94787b = c33857e1;
        this.f94788c = c34323x9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (this.f94786a.exists() && this.f94786a.isDirectory() && (listFiles = this.f94786a.listFiles()) != null) {
            for (File file : listFiles) {
                C34931u9 m22104a = this.f94788c.m22104a(file.getName());
                try {
                    m22104a.f95458a.lock();
                    m22104a.f95459b.m22133a();
                    this.f94787b.consume(file);
                    m22104a.m20917c();
                } catch (Throwable unused) {
                    m22104a.m20917c();
                }
            }
        }
    }
}
