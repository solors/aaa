package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFe1vSDK extends AFd1gSDK {
    @NotNull
    public AFd1sSDK AFInAppEventType;
    @NotNull
    private final AFe1sSDK registerClient;
    private final boolean valueOf;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1vSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr) {
        this(aFd1sSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventParameterName() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final AFe1sSDK AFInAppEventType() {
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFKeystoreWrapper() {
        AFj1uSDK aFj1uSDK = new AFj1uSDK(this.AFInAppEventType, null, 2, null);
        String AFInAppEventParameterName = aFj1uSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1uSDK.unregisterClient);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFInAppEventParameterName);
        sb2.append(aFj1uSDK.values.valueOf.AFKeystoreWrapper.getPackageName());
        return sb2.toString();
    }

    public /* synthetic */ AFe1vSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: ".concat(String.valueOf(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1vSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = aFd1sSDK;
        this.registerClient = AFe1sSDK.OCTET_STREAM;
    }
}
