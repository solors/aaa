package com.vungle.ads.internal.presenter;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.presenter.q */
/* loaded from: classes7.dex */
public interface PresenterDelegate {
    @Nullable
    String getAlertBodyText();

    @Nullable
    String getAlertCloseButtonText();

    @Nullable
    String getAlertContinueButtonText();

    @Nullable
    String getAlertTitleText();

    @Nullable
    String getUserId();
}
