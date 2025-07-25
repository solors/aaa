package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.jf */
/* loaded from: classes9.dex */
public final class RunnableC34644jf implements Runnable {

    /* renamed from: a */
    public final File f94709a;

    /* renamed from: b */
    public final Function f94710b;

    /* renamed from: c */
    public final Consumer f94711c;

    /* renamed from: d */
    public final Consumer f94712d;

    public RunnableC34644jf(File file, Function function, Consumer consumer, Consumer consumer2) {
        this.f94709a = file;
        this.f94710b = function;
        this.f94711c = consumer;
        this.f94712d = consumer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f94709a.exists()) {
            try {
                Object apply = this.f94710b.apply(this.f94709a);
                if (apply != null) {
                    this.f94712d.consume(apply);
                }
            } catch (Throwable unused) {
            }
            this.f94711c.consume(this.f94709a);
        }
    }
}
