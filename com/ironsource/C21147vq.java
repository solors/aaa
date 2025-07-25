package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.vq */
/* loaded from: classes6.dex */
public final class C21147vq implements InterfaceC21093uq {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20206kg f54263a;

    @Metadata
    /* renamed from: com.ironsource.vq$a */
    /* loaded from: classes6.dex */
    public static final class C21148a {
        @NotNull

        /* renamed from: a */
        public static final C21148a f54264a = new C21148a();
        @NotNull

        /* renamed from: b */
        public static final String f54265b = "sessionNumber";
        @NotNull

        /* renamed from: c */
        public static final String f54266c = "firstSessionTimestamp";

        private C21148a() {
        }
    }

    public C21147vq() {
        this(null, 1, null);
    }

    @Override // com.ironsource.InterfaceC19850eq
    /* renamed from: a */
    public long mo54394a(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f54263a.mo54095b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC21190wq
    /* renamed from: b */
    public int mo54304b(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f54263a.mo54096b(context, C21148a.f54265b, i);
    }

    public C21147vq(@NotNull InterfaceC20206kg sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f54263a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC21190wq
    /* renamed from: a */
    public void mo54305a(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54263a.mo54098a(context, C21148a.f54265b, i);
    }

    @Override // com.ironsource.InterfaceC19850eq
    /* renamed from: b */
    public void mo54393b(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54263a.mo54097a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ C21147vq(InterfaceC20206kg interfaceC20206kg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C21234xq() : interfaceC20206kg);
    }
}
