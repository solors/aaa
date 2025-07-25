package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InitializationException.kt */
@Metadata
/* loaded from: classes7.dex */
public final class InitializationException extends Exception {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String message;
    @NotNull
    private final String reason;
    @Nullable
    private final String reasonDebug;
    @Nullable
    private final Throwable throwable;

    /* compiled from: InitializationException.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InitializationException parseFrom(@NotNull Exception e) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof Timeout) {
                z = true;
            } else {
                z = e instanceof NetworkTimeoutException;
            }
            if (z) {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_TIMEOUT, e, "timeout", e.getMessage());
            }
            if (e instanceof UnityAdsNetworkException) {
                UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e;
                if (unityAdsNetworkException.getCode() == null) {
                    str = "network";
                } else {
                    str = "network." + unityAdsNetworkException.getCode();
                }
                return new InitializationException(AndroidInitializeBoldSDK.MSG_NETWORK, e, str, unityAdsNetworkException.getMessage());
            } else if (e instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            } else if (e instanceof InitializationException) {
                return (InitializationException) e;
            } else {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, e, "unknown", e.getMessage());
            }
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
    }

    @NotNull
    public final String component1() {
        return getMessage();
    }

    @Nullable
    public final Throwable component2() {
        return this.throwable;
    }

    @NotNull
    public final String component3() {
        return this.reason;
    }

    @Nullable
    public final String component4() {
        return this.reasonDebug;
    }

    @NotNull
    public final InitializationException copy(@NotNull String message, @Nullable Throwable th, @NotNull String reason, @Nullable String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new InitializationException(message, th, reason, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        if (Intrinsics.m17075f(getMessage(), initializationException.getMessage()) && Intrinsics.m17075f(this.throwable, initializationException.throwable) && Intrinsics.m17075f(this.reason, initializationException.reason) && Intrinsics.m17075f(this.reasonDebug, initializationException.reasonDebug)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
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

    public int hashCode() {
        int hashCode;
        int hashCode2 = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int i = 0;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@NotNull String message, @Nullable Throwable th, @NotNull String reason, @Nullable String str) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
