package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.qm */
/* loaded from: classes6.dex */
public final class C20710qm implements InterfaceC20599oo {
    @NotNull

    /* renamed from: a */
    private final String f52613a;

    @Metadata
    /* renamed from: com.ironsource.qm$a */
    /* loaded from: classes6.dex */
    public static final class C20711a {
        @NotNull

        /* renamed from: a */
        public static final C20711a f52614a = new C20711a();
        @NotNull

        /* renamed from: b */
        public static final String f52615b = "IronSource";

        private C20711a() {
        }
    }

    public C20710qm(@NotNull String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f52613a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC20599oo
    @NotNull
    public String value() {
        boolean z;
        if (this.f52613a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (Intrinsics.m17075f(this.f52613a, "0") || Intrinsics.m17075f(this.f52613a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f52613a;
    }
}
