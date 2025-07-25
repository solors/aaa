package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class TimeoutConfigurations$MediationConfig {
    @NotNull

    /* renamed from: ab */
    private TimeoutConfigurations$ABConfig f48972ab = new TimeoutConfigurations$ABConfig();
    @NotNull
    private TimeoutConfigurations$NonABConfig nonAb = new TimeoutConfigurations$NonABConfig();
    @NotNull
    private TimeoutConfigurations$PreloadConfig preload = new TimeoutConfigurations$PreloadConfig();

    @NotNull
    public final TimeoutConfigurations$ABConfig getABConfig() {
        return this.f48972ab;
    }

    @NotNull
    public final TimeoutConfigurations$NonABConfig getNonABConfig() {
        return this.nonAb;
    }

    @NotNull
    public final TimeoutConfigurations$PreloadConfig getPreloadConfig() {
        return this.preload;
    }

    public final boolean isValid() {
        if (this.f48972ab.isValid() && this.nonAb.isValid() && this.preload.isValid()) {
            return true;
        }
        return false;
    }
}
