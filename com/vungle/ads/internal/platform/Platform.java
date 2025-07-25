package com.vungle.ads.internal.platform;

import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.AdvertisingInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.platform.d */
/* loaded from: classes7.dex */
public interface Platform {
    @NotNull
    public static final C29392a Companion = C29392a.$$INSTANCE;
    @NotNull
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* compiled from: Platform.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.platform.d$a */
    /* loaded from: classes7.dex */
    public static final class C29392a {
        static final /* synthetic */ C29392a $$INSTANCE = new C29392a();
        @NotNull
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private C29392a() {
        }
    }

    @Nullable
    AdvertisingInfo getAdvertisingInfo();

    @Nullable
    String getAppSetId();

    @Nullable
    Integer getAppSetIdScope();

    @NotNull
    String getCarrierName();

    @Nullable
    String getUserAgent();

    void getUserAgentLazy(@NotNull Consumer<String> consumer);

    float getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
