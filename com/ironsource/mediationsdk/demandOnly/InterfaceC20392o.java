package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC19778dl;
import com.ironsource.InterfaceC21302za;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.mediationsdk.demandOnly.o */
/* loaded from: classes6.dex */
public interface InterfaceC20392o extends InterfaceC21302za<String> {

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.o$a */
    /* loaded from: classes6.dex */
    public static final class C20393a implements InterfaceC20392o {
        @NotNull

        /* renamed from: a */
        private final String f51543a;

        public C20393a(@NotNull String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.f51543a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC21302za
        @NotNull
        /* renamed from: b */
        public String mo53859a() {
            return this.f51543a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20392o
        /* renamed from: a */
        public <T> T mo56888a(@NotNull InterfaceC19778dl<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.mo53929a(this.f51543a);
        }
    }

    /* renamed from: a */
    <T> T mo56888a(@NotNull InterfaceC19778dl<String, T> interfaceC19778dl);
}
