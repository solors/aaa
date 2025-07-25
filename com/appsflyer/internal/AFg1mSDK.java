package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface AFg1mSDK {
    void AFInAppEventParameterName(@NotNull AFa1pSDK aFa1pSDK);

    void AFInAppEventParameterName(@NotNull Map<String, Object> map);

    long AFInAppEventType();

    void AFInAppEventType(@NotNull AFa1pSDK aFa1pSDK);

    void AFKeystoreWrapper(@NotNull AFa1pSDK aFa1pSDK);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map);

    void valueOf(@NotNull Map<String, Object> map, int i, int i2);

    @Nullable
    Long values();

    void values(@NotNull AFa1pSDK aFa1pSDK);

    void values(@NotNull Map<String, Object> map);

    void values(@NotNull Map<String, Object> map, boolean z, @NotNull Functions<String> functions);
}
