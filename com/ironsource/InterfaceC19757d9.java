package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.d9 */
/* loaded from: classes6.dex */
public interface InterfaceC19757d9 {

    @Metadata
    /* renamed from: com.ironsource.d9$a */
    /* loaded from: classes6.dex */
    public static final class C19758a implements InterfaceC19757d9 {

        /* renamed from: a */
        private final boolean f49736a;

        public C19758a(boolean z) {
            this.f49736a = z;
        }

        @Override // com.ironsource.InterfaceC19757d9
        /* renamed from: a */
        public void mo58958a() {
            C21223xf.m54137a(C21145vp.f54258x, new C20968sf().m54959a(C20517nb.f52199y, Boolean.valueOf(this.f49736a)).m54960a());
        }
    }

    @Metadata
    /* renamed from: com.ironsource.d9$b */
    /* loaded from: classes6.dex */
    public static final class C19759b implements InterfaceC19757d9 {

        /* renamed from: a */
        private final boolean f49737a;

        /* renamed from: b */
        private final long f49738b;
        @NotNull

        /* renamed from: c */
        private final InterfaceC20197k9 f49739c;

        public C19759b(boolean z, long j, @NotNull InterfaceC20197k9 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f49737a = z;
            this.f49738b = j;
            this.f49739c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC19757d9
        /* renamed from: a */
        public void mo58958a() {
            C20968sf m54959a = new C20968sf().m54959a(C20517nb.f52199y, Boolean.valueOf(this.f49737a));
            if (this.f49738b > 0) {
                m54959a.m54959a(C20517nb.f52155B, Long.valueOf(this.f49739c.mo57675a() - this.f49738b));
            }
            C21223xf.m54137a(C21145vp.f54257w, m54959a.m54960a());
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC20197k9 m58957b() {
            return this.f49739c;
        }
    }

    /* renamed from: a */
    void mo58958a();
}
