package com.maticoo.sdk.mraid.cache;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public interface Cache {
    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
