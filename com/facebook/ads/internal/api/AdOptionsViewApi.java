package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;

@Keep
@UiThread
/* loaded from: classes3.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i);

    void setIconSizeDp(int i);

    void setSingleIcon(boolean z);
}
