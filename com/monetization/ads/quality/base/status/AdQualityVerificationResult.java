package com.monetization.ads.quality.base.status;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface AdQualityVerificationResult {

    @Metadata
    /* loaded from: classes7.dex */
    public static final class NotImplemented implements AdQualityVerificationResult {
        static {
            new NotImplemented();
        }

        private NotImplemented() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotImplemented)) {
                return false;
            }
            NotImplemented notImplemented = (NotImplemented) obj;
            return true;
        }

        public int hashCode() {
            return 26621389;
        }

        @NotNull
        public String toString() {
            return "NotImplemented";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class NotVerified implements AdQualityVerificationResult {
        @NotNull

        /* renamed from: a */
        private final AdQualityVerificationError f66569a;

        public NotVerified(@NotNull AdQualityVerificationError reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f66569a = reason;
        }

        public static /* synthetic */ NotVerified copy$default(NotVerified notVerified, AdQualityVerificationError adQualityVerificationError, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationError = notVerified.f66569a;
            }
            return notVerified.copy(adQualityVerificationError);
        }

        @NotNull
        public final AdQualityVerificationError component1() {
            return this.f66569a;
        }

        @NotNull
        public final NotVerified copy(@NotNull AdQualityVerificationError reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new NotVerified(reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof NotVerified) && Intrinsics.m17075f(this.f66569a, ((NotVerified) obj).f66569a)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AdQualityVerificationError getReason() {
            return this.f66569a;
        }

        public int hashCode() {
            return this.f66569a.hashCode();
        }

        @NotNull
        public String toString() {
            AdQualityVerificationError adQualityVerificationError = this.f66569a;
            return "NotVerified(reason=" + adQualityVerificationError + ")";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Verified implements AdQualityVerificationResult {
        @NotNull

        /* renamed from: a */
        private final AdQualityVerificationStateFlow f66570a;

        public Verified(@NotNull AdQualityVerificationStateFlow verifiedAd) {
            Intrinsics.checkNotNullParameter(verifiedAd, "verifiedAd");
            this.f66570a = verifiedAd;
        }

        public static /* synthetic */ Verified copy$default(Verified verified, AdQualityVerificationStateFlow adQualityVerificationStateFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationStateFlow = verified.f66570a;
            }
            return verified.copy(adQualityVerificationStateFlow);
        }

        @NotNull
        public final AdQualityVerificationStateFlow component1() {
            return this.f66570a;
        }

        @NotNull
        public final Verified copy(@NotNull AdQualityVerificationStateFlow verifiedAd) {
            Intrinsics.checkNotNullParameter(verifiedAd, "verifiedAd");
            return new Verified(verifiedAd);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Verified) && Intrinsics.m17075f(this.f66570a, ((Verified) obj).f66570a)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return this.f66570a;
        }

        public int hashCode() {
            return this.f66570a.hashCode();
        }

        @NotNull
        public String toString() {
            AdQualityVerificationStateFlow adQualityVerificationStateFlow = this.f66570a;
            return "Verified(verifiedAd=" + adQualityVerificationStateFlow + ")";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class WaitingForVerification implements AdQualityVerificationResult {
        static {
            new WaitingForVerification();
        }

        private WaitingForVerification() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingForVerification)) {
                return false;
            }
            WaitingForVerification waitingForVerification = (WaitingForVerification) obj;
            return true;
        }

        public int hashCode() {
            return 375455509;
        }

        @NotNull
        public String toString() {
            return "WaitingForVerification";
        }
    }
}
