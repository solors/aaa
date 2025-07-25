package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetTokenClient.kt */
@Metadata
/* loaded from: classes4.dex */
public final class GetTokenClient extends PlatformServiceClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenClient(@NotNull Context context, @NotNull LoginClient.Request request) {
        super(context, 65536, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId(), request.getNonce());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(@NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
