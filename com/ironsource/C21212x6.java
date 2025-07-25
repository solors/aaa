package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.x6 */
/* loaded from: classes6.dex */
public final class C21212x6 implements InterfaceC19602au {
    @Nullable

    /* renamed from: a */
    private final C21082uk f54432a;
    @Nullable

    /* renamed from: b */
    private final AdSize f54433b;

    @Metadata
    /* renamed from: com.ironsource.x6$a */
    /* loaded from: classes6.dex */
    static final class C21213a extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C21213a f54434a = new C21213a();

        C21213a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58196a("Load task config is null");
        }
    }

    @Metadata
    /* renamed from: com.ironsource.x6$b */
    /* loaded from: classes6.dex */
    static final class C21214b extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C21214b f54435a = new C21214b();

        C21214b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58178l();
        }
    }

    public C21212x6(@Nullable C21082uk c21082uk, @Nullable AdSize adSize) {
        this.f54432a = c21082uk;
        this.f54433b = adSize;
    }

    @Override // com.ironsource.InterfaceC19602au
    /* renamed from: a */
    public void mo54173a() {
        boolean z;
        boolean z2 = true;
        if (this.f54432a != null) {
            z = true;
        } else {
            z = false;
        }
        m59390a(z, C21213a.f54434a);
        if (this.f54433b == null) {
            z2 = false;
        }
        m59390a(z2, C21214b.f54435a);
    }
}
