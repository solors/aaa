package com.ironsource.mediationsdk.demandOnly;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.mediationsdk.demandOnly.p */
/* loaded from: classes6.dex */
public interface InterfaceC20394p {

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.p$a */
    /* loaded from: classes6.dex */
    public static class C20395a implements InterfaceC20394p {
        @NotNull

        /* renamed from: a */
        private final String f51544a;

        public C20395a(@NotNull String plumbus) {
            Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.f51544a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20394p
        @NotNull
        public String value() {
            return this.f51544a;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.p$b */
    /* loaded from: classes6.dex */
    public static final class C20396b extends C20395a {
        public C20396b() {
            super("");
        }
    }

    @NotNull
    String value();
}
