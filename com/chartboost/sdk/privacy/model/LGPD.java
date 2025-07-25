package com.chartboost.sdk.privacy.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class LGPD extends GenericDataUseConsent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String LGPD_STANDARD = "lgpd";

    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LGPD(boolean z) {
        super(null, 1, null);
        m79714b("lgpd");
        m79716a(Boolean.valueOf(z));
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @NotNull
    public Boolean getConsent() {
        Object m79717a = m79717a();
        Intrinsics.m17073h(m79717a, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) m79717a;
    }
}
