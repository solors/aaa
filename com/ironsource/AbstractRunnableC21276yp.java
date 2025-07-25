package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.yp */
/* loaded from: classes6.dex */
public abstract class AbstractRunnableC21276yp implements Runnable {
    /* renamed from: a */
    public abstract void mo53791a() throws Exception;

    /* renamed from: a */
    public void mo53790a(@NotNull Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        C20220ks.m57609a(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo53791a();
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            try {
                mo53790a(th);
            } catch (Throwable th2) {
                C20086i9.m57997d().m58003a(th2);
            }
        }
    }
}
