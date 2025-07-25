package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFc1oSDK {
    @NotNull
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    @Nullable
    public final AFc1pSDK AFInAppEventParameterName;
    @NotNull
    public final Map<String, Object> valueOf;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static AFc1oSDK AFInAppEventParameterName(@NotNull AFa1pSDK aFa1pSDK) {
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            Map<String, Object> AFInAppEventType = aFa1pSDK.AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return new AFc1oSDK(AFInAppEventType, null, 2, null);
        }

        @NotNull
        public static AFc1oSDK AFKeystoreWrapper(@NotNull AFc1pSDK aFc1pSDK) {
            Intrinsics.checkNotNullParameter(aFc1pSDK, "");
            return new AFc1oSDK(new LinkedHashMap(), aFc1pSDK, null);
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1pSDK aFc1pSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1pSDK);
    }

    @NotNull
    public static final AFc1oSDK AFInAppEventType(@NotNull AFc1pSDK aFc1pSDK) {
        return AFa1ySDK.AFKeystoreWrapper(aFc1pSDK);
    }

    @NotNull
    public static final AFc1oSDK AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK) {
        return AFa1ySDK.AFInAppEventParameterName(aFa1pSDK);
    }

    public final void values(@NotNull String str, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.put(str, obj);
        AFc1pSDK aFc1pSDK = this.AFInAppEventParameterName;
        if (aFc1pSDK != null) {
            aFc1pSDK.AFInAppEventParameterName(this.valueOf);
        }
    }

    private AFc1oSDK(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        this.valueOf = map;
        this.AFInAppEventParameterName = aFc1pSDK;
    }

    public final boolean values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.valueOf.containsKey(str);
    }

    /* synthetic */ AFc1oSDK(Map map, AFc1pSDK aFc1pSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1pSDK);
    }
}
