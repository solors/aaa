package com.chartboost.sdk.privacy.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class COPPA extends GenericDataUseConsent {
    @NotNull
    public static final String COPPA_STANDARD = "coppa";
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public COPPA(boolean z) {
        super(null, 1, null);
        m79714b("coppa");
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
