package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoginStatusClient.kt */
@Metadata
/* loaded from: classes4.dex */
public final class LoginStatusClient extends PlatformServiceClient {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TOAST_DURATION_MS = 5000;
    @NotNull
    private final String graphApiVersion;
    @NotNull
    private final String loggerRef;
    private final long toastDurationMs;

    /* compiled from: LoginStatusClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoginStatusClient newInstance$facebook_common_release(@NotNull Context context, @NotNull String applicationId, @NotNull String loggerRef, @NotNull String graphApiVersion, long j, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
            Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
            return new LoginStatusClient(context, applicationId, loggerRef, graphApiVersion, j, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginStatusClient(@NotNull Context context, @NotNull String applicationId, @NotNull String loggerRef, @NotNull String graphApiVersion, long j, @Nullable String str) {
        super(context, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REQUEST, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REPLY, NativeProtocol.PROTOCOL_VERSION_20170411, applicationId, str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
        Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        this.loggerRef = loggerRef;
        this.graphApiVersion = graphApiVersion;
        this.toastDurationMs = j;
    }

    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(@NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data.putString(NativeProtocol.EXTRA_LOGGER_REF, this.loggerRef);
        data.putString(NativeProtocol.EXTRA_GRAPH_API_VERSION, this.graphApiVersion);
        data.putLong(NativeProtocol.EXTRA_TOAST_DURATION_MS, this.toastDurationMs);
    }
}
