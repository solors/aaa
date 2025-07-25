package com.monetization.ads.quality.base.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public abstract class AdQualityVerificationError {
    @NotNull
    private static final C25615a Code = new C25615a(0);
    @Deprecated
    public static final int INTERNAL_ERROR = 1;
    @Deprecated
    public static final int INVALID_REQUEST = 2;
    @Deprecated
    public static final int UNKNOWN_ERROR = 0;
    private final int code;
    @NotNull
    private final String description;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class DisabledError extends AdQualityVerificationError {
        public DisabledError() {
            super(1, "The ad verification is disabled by configuration", null);
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class InitializationAlreadyInProcess extends AdQualityVerificationError {
        public InitializationAlreadyInProcess() {
            super(1, "The verification initialization is already in progress", null);
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class InternalError extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(@NotNull String description) {
            super(1, "The ad verification build in error: " + description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class InvalidAdObject extends AdQualityVerificationError {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InvalidAdObject(@org.jetbrains.annotations.NotNull com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork r3) {
            /*
                r2 = this;
                java.lang.String r0 = "network"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = r3.name()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "The ad object for verification "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " is invalid"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r0 = 2
                r1 = 0
                r2.<init>(r0, r3, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.quality.base.model.AdQualityVerificationError.InvalidAdObject.<init>(com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork):void");
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class InvalidInit extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidInit(@NotNull String errorDescription) {
            super(1, "The verifier initialization error: " + errorDescription, null);
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class LowUsagePercent extends AdQualityVerificationError {
        public LowUsagePercent() {
            super(1, "The ad verification is not in percent usage", null);
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class TimeoutError extends AdQualityVerificationError {
        public TimeoutError(long j) {
            super(1, "The ad verifications timed out after " + j, null);
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class UnknownError extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String description) {
            super(0, "The ad verification failed with error: " + description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class UnsupportedNetwork extends AdQualityVerificationError {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnsupportedNetwork(@org.jetbrains.annotations.NotNull com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork r3) {
            /*
                r2 = this;
                java.lang.String r0 = "network"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = r3.name()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "The "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " is unsupported for verification"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r0 = 2
                r1 = 0
                r2.<init>(r0, r3, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.quality.base.model.AdQualityVerificationError.UnsupportedNetwork.<init>(com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork):void");
        }
    }

    /* renamed from: com.monetization.ads.quality.base.model.AdQualityVerificationError$a */
    /* loaded from: classes7.dex */
    private static final class C25615a {
        public /* synthetic */ C25615a(int i) {
            this();
        }

        private C25615a() {
        }
    }

    public /* synthetic */ AdQualityVerificationError(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public String toString() {
        int i = this.code;
        String str = this.description;
        return "Ad verification error: (code: " + i + ", description: " + str + ")";
    }

    private AdQualityVerificationError(int i, String str) {
        this.code = i;
        this.description = str;
    }
}
