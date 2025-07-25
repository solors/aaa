package com.maticoo.sdk.view.close;

import com.maticoo.sdk.p405ad.utils.CloseReason;

/* loaded from: classes6.dex */
public interface AdCloseListener {
    void onCloseCancel();

    void onClosed(CloseReason closeReason);
}
