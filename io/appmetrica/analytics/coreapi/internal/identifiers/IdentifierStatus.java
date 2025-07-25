package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");
    
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f92351a;

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IdentifierStatus from(@Nullable String str) {
            IdentifierStatus identifierStatus;
            IdentifierStatus[] values = IdentifierStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    identifierStatus = values[i];
                    if (Intrinsics.m17075f(identifierStatus.getValue(), str)) {
                        break;
                    }
                    i++;
                } else {
                    identifierStatus = null;
                    break;
                }
            }
            if (identifierStatus == null) {
                return IdentifierStatus.UNKNOWN;
            }
            return identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.f92351a = str;
    }

    @NotNull
    public static final IdentifierStatus from(@Nullable String str) {
        return Companion.from(str);
    }

    @NotNull
    public final String getValue() {
        return this.f92351a;
    }
}
