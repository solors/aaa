package com.moloco.sdk.publisher.init;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes7.dex */
public final class MolocoInitParams {
    public static final int $stable = 8;
    @NotNull
    private final Context appContext;
    @NotNull
    private final String appKey;
    @NotNull
    private final MediationInfo mediationInfo;

    public MolocoInitParams(@NotNull Context appContext, @NotNull String appKey, @NotNull MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        this.appContext = appContext;
        this.appKey = appKey;
        this.mediationInfo = mediationInfo;
    }

    public static /* synthetic */ MolocoInitParams copy$default(MolocoInitParams molocoInitParams, Context context, String str, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            context = molocoInitParams.appContext;
        }
        if ((i & 2) != 0) {
            str = molocoInitParams.appKey;
        }
        if ((i & 4) != 0) {
            mediationInfo = molocoInitParams.mediationInfo;
        }
        return molocoInitParams.copy(context, str, mediationInfo);
    }

    @NotNull
    public final Context component1() {
        return this.appContext;
    }

    @NotNull
    public final String component2() {
        return this.appKey;
    }

    @NotNull
    public final MediationInfo component3() {
        return this.mediationInfo;
    }

    @NotNull
    public final MolocoInitParams copy(@NotNull Context appContext, @NotNull String appKey, @NotNull MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        return new MolocoInitParams(appContext, appKey, mediationInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoInitParams)) {
            return false;
        }
        MolocoInitParams molocoInitParams = (MolocoInitParams) obj;
        if (Intrinsics.m17075f(this.appContext, molocoInitParams.appContext) && Intrinsics.m17075f(this.appKey, molocoInitParams.appKey) && Intrinsics.m17075f(this.mediationInfo, molocoInitParams.mediationInfo)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Context getAppContext() {
        return this.appContext;
    }

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public int hashCode() {
        return (((this.appContext.hashCode() * 31) + this.appKey.hashCode()) * 31) + this.mediationInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoInitParams(appContext=" + this.appContext + ", appKey=" + this.appKey + ", mediationInfo=" + this.mediationInfo + ')';
    }
}
