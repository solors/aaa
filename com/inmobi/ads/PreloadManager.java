package com.inmobi.ads;

import androidx.annotation.UiThread;
import kotlin.Metadata;

@Metadata
/* loaded from: classes6.dex */
public interface PreloadManager {
    @UiThread
    void load();

    @UiThread
    void preload();
}
