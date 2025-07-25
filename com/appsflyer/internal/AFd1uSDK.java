package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface AFd1uSDK {
    @NotNull
    public static final AFa1zSDK AFa1zSDK = AFa1zSDK.valueOf;

    /* loaded from: classes2.dex */
    public interface AFa1vSDK {
        void AFKeystoreWrapper();

        void values(@NotNull AFh1pSDK aFh1pSDK);
    }

    /* loaded from: classes2.dex */
    public static final class AFa1zSDK {
        static final /* synthetic */ AFa1zSDK valueOf = new AFa1zSDK();
        private static long AFInAppEventParameterName = 500;

        private AFa1zSDK() {
        }

        public static long valueOf() {
            return AFInAppEventParameterName;
        }
    }

    void AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull Context context, @NotNull AFa1vSDK aFa1vSDK);

    boolean values();
}
