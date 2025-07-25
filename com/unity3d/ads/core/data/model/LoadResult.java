package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoadResult.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class LoadResult {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    @NotNull
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    @NotNull
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    @NotNull
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    @NotNull
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    @NotNull
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    @NotNull
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    @NotNull
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    @NotNull
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    @NotNull
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    @NotNull
    public static final String MSG_OPPORTUNITY_ID = "[UnityAds] Object ID cannot be null";
    @NotNull
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    @NotNull
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    @NotNull
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: LoadResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LoadResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Failure extends LoadResult {
        @NotNull
        private final UnityAds.UnityAdsLoadError error;
        private final boolean isScarAd;
        @Nullable
        private final String message;
        @NotNull
        private final String reason;
        @Nullable
        private final String reasonDebug;
        @Nullable
        private final Throwable throwable;

        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(unityAdsLoadError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i & 2) != 0) {
                str = failure.message;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                th = failure.throwable;
            }
            Throwable th2 = th;
            if ((i & 8) != 0) {
                str2 = failure.reason;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                z = failure.isScarAd;
            }
            return failure.copy(unityAdsLoadError, str4, th2, str5, str6, z);
        }

        @NotNull
        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        @Nullable
        public final String component2() {
            return this.message;
        }

        @Nullable
        public final Throwable component3() {
            return this.throwable;
        }

        @NotNull
        public final String component4() {
            return this.reason;
        }

        @Nullable
        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        @NotNull
        public final Failure copy(@NotNull UnityAds.UnityAdsLoadError error, @Nullable String str, @Nullable Throwable th, @NotNull String reason, @Nullable String str2, boolean z) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failure(error, str, th, reason, str2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            if (this.error == failure.error && Intrinsics.m17075f(this.message, failure.message) && Intrinsics.m17075f(this.throwable, failure.throwable) && Intrinsics.m17075f(this.reason, failure.reason) && Intrinsics.m17075f(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd) {
                return true;
            }
            return false;
        }

        @NotNull
        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @Nullable
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.error.hashCode() * 31;
            String str = this.message;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode3 + hashCode) * 31;
            Throwable th = this.throwable;
            if (th == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = th.hashCode();
            }
            int hashCode4 = (((i2 + hashCode2) * 31) + this.reason.hashCode()) * 31;
            String str2 = this.reasonDebug;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i3 = (hashCode4 + i) * 31;
            boolean z = this.isScarAd;
            int i4 = z;
            if (z != 0) {
                i4 = 1;
            }
            return i3 + i4;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull UnityAds.UnityAdsLoadError error, @Nullable String str, @Nullable Throwable th, @NotNull String reason, @Nullable String str2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z;
        }
    }

    /* compiled from: LoadResult.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Success extends LoadResult {
        @NotNull
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull AdObject adObject) {
            super(null);
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i, Object obj) {
            if ((i & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        @NotNull
        public final AdObject component1() {
            return this.adObject;
        }

        @NotNull
        public final Success copy(@NotNull AdObject adObject) {
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Success) && Intrinsics.m17075f(this.adObject, ((Success) obj).adObject)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    private LoadResult() {
    }

    public /* synthetic */ LoadResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
