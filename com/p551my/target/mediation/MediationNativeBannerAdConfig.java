package com.p551my.target.mediation;

import androidx.annotation.Nullable;
import com.p551my.target.common.menu.MenuFactory;

/* renamed from: com.my.target.mediation.MediationNativeBannerAdConfig */
/* loaded from: classes7.dex */
public interface MediationNativeBannerAdConfig extends MediationAdConfig {
    int getAdChoicesPlacement();

    int getCachePolicy();

    @Nullable
    MenuFactory getMenuFactory();
}
