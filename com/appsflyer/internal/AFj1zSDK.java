package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface AFj1zSDK {
    @NotNull
    public static final AFa1tSDK AFa1tSDK = AFa1tSDK.AFKeystoreWrapper;

    /* loaded from: classes2.dex */
    public static final class AFa1tSDK {
        static final /* synthetic */ AFa1tSDK AFKeystoreWrapper = new AFa1tSDK();

        private AFa1tSDK() {
        }
    }

    void AFInAppEventParameterName();

    void AFKeystoreWrapper();

    @NotNull
    Map<String, Object> values();
}
