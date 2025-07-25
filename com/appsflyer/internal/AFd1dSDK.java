package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFd1dSDK extends AFd1gSDK {
    @NotNull
    private final AFe1sSDK valueOf;
    @NotNull
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    @NotNull
    public static String AFInAppEventType = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1dSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.valueOf = AFe1sSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final AFe1sSDK AFInAppEventType() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFKeystoreWrapper() {
        String format = String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    public final String AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: ".concat(String.valueOf(str));
    }
}
