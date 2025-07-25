package com.yandex.mobile.ads.appopenad;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface AppOpenAd {
    @NotNull
    AdInfo getInfo();

    void setAdEventListener(@Nullable AppOpenAdEventListener appOpenAdEventListener);

    void show(@NotNull Activity activity);
}
