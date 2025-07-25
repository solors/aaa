package com.p551my.target.mediation;

import androidx.annotation.Nullable;
import com.p551my.target.common.menu.MenuFactory;

/* renamed from: com.my.target.mediation.MediationNativeAdConfig */
/* loaded from: classes7.dex */
public interface MediationNativeAdConfig extends MediationAdConfig {
    int getAdChoicesPlacement();

    int getCachePolicy();

    @Nullable
    MenuFactory getMenuFactory();

    @Deprecated
    boolean isAutoLoadImages();

    @Deprecated
    boolean isAutoLoadVideo();
}
