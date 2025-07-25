package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface AFb1ySDK {
    @NotNull
    public static final AFa1zSDK AFa1zSDK = AFa1zSDK.values;

    /* loaded from: classes2.dex */
    public static final class AFa1zSDK {
        static final /* synthetic */ AFa1zSDK values = new AFa1zSDK();

        private AFa1zSDK() {
        }
    }

    @NotNull
    Map<String, String> valueOf(@NotNull Context context);
}
