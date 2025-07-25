package com.unity3d.services.ads.token;

import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncTokenStorage.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AsyncTokenStorage {
    void getToken(@Nullable IBiddingManager iBiddingManager);

    void onTokenAvailable();

    void setConfiguration(@Nullable Configuration configuration);
}
