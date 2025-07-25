package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.top.bg */
/* loaded from: classes3.dex */
public interface InterfaceC8465bg<T extends View> {
    void clickSkip();

    void clickSound();

    View getCloseButton();

    void setListener(InterfaceC8458IL interfaceC8458IL);

    void setShowDislike(boolean z);

    void setShowSkip(boolean z);

    void setShowSound(boolean z);

    void setSkipEnable(boolean z);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
