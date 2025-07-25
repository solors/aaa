package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.sh */
/* loaded from: classes6.dex */
public final class C20970sh implements InterfaceC19602au {
    @Nullable

    /* renamed from: a */
    private final C21082uk f53476a;

    @Metadata
    /* renamed from: com.ironsource.sh$a */
    /* loaded from: classes6.dex */
    static final class C20971a extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20971a f53477a = new C20971a();

        C20971a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58192b("Load task config is null");
        }
    }

    public C20970sh(@Nullable C21082uk c21082uk) {
        this.f53476a = c21082uk;
    }

    @Override // com.ironsource.InterfaceC19602au
    /* renamed from: a */
    public void mo54173a() {
        boolean z;
        if (this.f53476a != null) {
            z = true;
        } else {
            z = false;
        }
        m59390a(z, C20971a.f53477a);
    }
}
