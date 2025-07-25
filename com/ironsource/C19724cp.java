package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.cp */
/* loaded from: classes6.dex */
public final class C19724cp implements InterfaceC19602au {
    @Nullable

    /* renamed from: a */
    private final C21082uk f49489a;

    @Metadata
    /* renamed from: com.ironsource.cp$a */
    /* loaded from: classes6.dex */
    static final class C19725a extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C19725a f49490a = new C19725a();

        C19725a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58186d("Load task config is null");
        }
    }

    public C19724cp(@Nullable C21082uk c21082uk) {
        this.f49489a = c21082uk;
    }

    @Override // com.ironsource.InterfaceC19602au
    /* renamed from: a */
    public void mo54173a() {
        boolean z;
        if (this.f49489a != null) {
            z = true;
        } else {
            z = false;
        }
        m59390a(z, C19725a.f49490a);
    }
}
