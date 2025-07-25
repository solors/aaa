package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.f5 */
/* loaded from: classes3.dex */
public final class C9846f5 {

    /* renamed from: a */
    public final InterfaceC10347x4 f21976a;

    public C9846f5(InterfaceC10347x4 fileCaching) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        this.f21976a = fileCaching;
    }

    /* renamed from: a */
    public final File m81712a(C9827e4 c9827e4) {
        return AbstractC9845f4.m81714a(c9827e4, this.f21976a.mo79904c());
    }

    /* renamed from: b */
    public final File m81711b(C9827e4 c9827e4) {
        return AbstractC9845f4.m81714a(c9827e4, this.f21976a.mo79907a());
    }

    /* renamed from: c */
    public final void m81710c(C9827e4 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (C10023l9.f22528a.m81168d()) {
            m81711b(download).createNewFile();
        }
    }

    /* renamed from: d */
    public final void m81709d(C9827e4 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (C10023l9.f22528a.m81168d()) {
            m81712a(download).delete();
            m81711b(download).delete();
        }
    }

    /* renamed from: e */
    public final void m81708e(C9827e4 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (C10023l9.f22528a.m81168d()) {
            m81711b(download).delete();
            m81712a(download).createNewFile();
        }
    }
}
