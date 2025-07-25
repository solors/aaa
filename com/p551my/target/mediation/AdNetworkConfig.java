package com.p551my.target.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.mediation.AdNetworkConfig */
/* loaded from: classes7.dex */
public interface AdNetworkConfig {
    @NonNull
    String getAdNetwork();

    @Nullable
    Object getData();

    @Nullable
    AdNetworkLoader getLoader();
}
