package com.ironsource.mediationsdk.adapter;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    @NotNull
    protected final String getAdUnitIdMissingErrorString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return "Missing params - " + key;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    protected final String getConfigStringValueFromKey(@NotNull JSONObject config, @NotNull String key) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(key, "key");
        String optString = config.optString(key);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(key)");
        return optString;
    }

    public final void postBackgroundThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String str) {
    }
}
