package com.monetization.ads.quality.base.state;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface AdQualityVerificationState {

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Blocked implements AdQualityVerificationState {
        @NotNull

        /* renamed from: a */
        private final AdQualityVerificationBlockingReasons f66566a;

        public Blocked(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f66566a = reason;
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationBlockingReasons = blocked.f66566a;
            }
            return blocked.copy(adQualityVerificationBlockingReasons);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons component1() {
            return this.f66566a;
        }

        @NotNull
        public final Blocked copy(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Blocked(reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Blocked) && Intrinsics.m17075f(this.f66566a, ((Blocked) obj).f66566a)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.f66566a;
        }

        public int hashCode() {
            return this.f66566a.hashCode();
        }

        @NotNull
        public String toString() {
            AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons = this.f66566a;
            return "Blocked(reason=" + adQualityVerificationBlockingReasons + ")";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Error implements AdQualityVerificationState {
        @NotNull

        /* renamed from: a */
        private final AdQualityVerificationError f66567a;

        public Error(@NotNull AdQualityVerificationError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f66567a = error;
        }

        public static /* synthetic */ Error copy$default(Error error, AdQualityVerificationError adQualityVerificationError, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationError = error.f66567a;
            }
            return error.copy(adQualityVerificationError);
        }

        @NotNull
        public final AdQualityVerificationError component1() {
            return this.f66567a;
        }

        @NotNull
        public final Error copy(@NotNull AdQualityVerificationError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Error) && Intrinsics.m17075f(this.f66567a, ((Error) obj).f66567a)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AdQualityVerificationError getError() {
            return this.f66567a;
        }

        public int hashCode() {
            return this.f66567a.hashCode();
        }

        @NotNull
        public String toString() {
            AdQualityVerificationError adQualityVerificationError = this.f66567a;
            return "Error(error=" + adQualityVerificationError + ")";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class NotStarted implements AdQualityVerificationState {
        static {
            new NotStarted();
        }

        private NotStarted() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotStarted)) {
                return false;
            }
            NotStarted notStarted = (NotStarted) obj;
            return true;
        }

        public int hashCode() {
            return 1691080461;
        }

        @NotNull
        public String toString() {
            return "NotStarted";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {
        @NotNull

        /* renamed from: a */
        private final AdQualityVerificationBlockingReasons f66568a;

        public ShouldBeBlockedOnDisplay(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f66568a = reason;
        }

        public static /* synthetic */ ShouldBeBlockedOnDisplay copy$default(ShouldBeBlockedOnDisplay shouldBeBlockedOnDisplay, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationBlockingReasons = shouldBeBlockedOnDisplay.f66568a;
            }
            return shouldBeBlockedOnDisplay.copy(adQualityVerificationBlockingReasons);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons component1() {
            return this.f66568a;
        }

        @NotNull
        public final ShouldBeBlockedOnDisplay copy(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new ShouldBeBlockedOnDisplay(reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ShouldBeBlockedOnDisplay) && Intrinsics.m17075f(this.f66568a, ((ShouldBeBlockedOnDisplay) obj).f66568a)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.f66568a;
        }

        public int hashCode() {
            return this.f66568a.hashCode();
        }

        @NotNull
        public String toString() {
            AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons = this.f66568a;
            return "ShouldBeBlockedOnDisplay(reason=" + adQualityVerificationBlockingReasons + ")";
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Verified implements AdQualityVerificationState {
        static {
            new Verified();
        }

        private Verified() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Verified)) {
                return false;
            }
            Verified verified = (Verified) obj;
            return true;
        }

        public int hashCode() {
            return -800540825;
        }

        @NotNull
        public String toString() {
            return "Verified";
        }
    }
}
