package com.inmobi.media;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.H2 */
/* loaded from: classes6.dex */
public final class C18946H2 extends AbstractC19145W2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public final Thread.UncaughtExceptionHandler f47307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18946H2(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC19132V2 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47307b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC19145W2
    /* renamed from: a */
    public final void mo60493a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC19145W2
    /* renamed from: b */
    public final void mo60491b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f47307b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        ((C19158X2) this.f47884a).m60566a(new C18960I2(t, e));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f47307b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
