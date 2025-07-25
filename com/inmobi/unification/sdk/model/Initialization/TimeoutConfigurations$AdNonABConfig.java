package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C18885Cb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class TimeoutConfigurations$AdNonABConfig {
    @NotNull
    private JSONObject loadRetryInterval;
    @NotNull
    private JSONObject loadTimeout;
    @NotNull
    private JSONObject maxLoadRetries;
    @NotNull
    private JSONObject muttTimeout;

    public TimeoutConfigurations$AdNonABConfig() {
        this.loadTimeout = new JSONObject();
        this.muttTimeout = new JSONObject();
        this.loadRetryInterval = new JSONObject();
        this.maxLoadRetries = new JSONObject();
    }

    @NotNull
    public final JSONObject getLoadTimeout() {
        return this.loadTimeout;
    }

    @NotNull
    public final JSONObject getMaxRetries() {
        return this.maxLoadRetries;
    }

    @NotNull
    public final JSONObject getMuttTimeout() {
        return this.muttTimeout;
    }

    @NotNull
    public final JSONObject getRetryInterval() {
        return this.loadRetryInterval;
    }

    public final boolean isValid() {
        Function2 function2;
        Function2 function22;
        Function2 function23;
        Function2 function24;
        C18885Cb.Companion.getClass();
        function2 = C18885Cb.validator;
        if (((Boolean) function2.mo105910invoke(this.muttTimeout, 0)).booleanValue()) {
            function22 = C18885Cb.validator;
            if (((Boolean) function22.mo105910invoke(this.loadTimeout, 0)).booleanValue()) {
                function23 = C18885Cb.validator;
                if (((Boolean) function23.mo105910invoke(this.loadRetryInterval, 1)).booleanValue()) {
                    function24 = C18885Cb.validator;
                    if (!((Boolean) function24.mo105910invoke(this.maxLoadRetries, 1)).booleanValue()) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeoutConfigurations$AdNonABConfig(@NotNull JSONObject loadTimeout, @NotNull JSONObject muttTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries) {
        this();
        Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
        Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
        Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
        Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
        this.loadTimeout = loadTimeout;
        this.muttTimeout = muttTimeout;
        this.loadRetryInterval = retryInterval;
        this.maxLoadRetries = maxRetries;
    }
}
