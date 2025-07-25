package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnityAdsNetworkException.kt */
@Metadata
/* loaded from: classes7.dex */
public class UnityAdsNetworkException extends Exception {
    @Nullable
    private final String client;
    @Nullable
    private final Integer code;
    @Nullable
    private final Integer cronetCode;
    @NotNull
    private final String message;
    @Nullable
    private final String protocol;
    @NotNull
    private final OperationType type;
    @Nullable
    private final String url;

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str4 : null);
    }

    @Nullable
    public final String getClient() {
        return this.client;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final OperationType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(@NotNull String message, @NotNull OperationType type, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }
}
