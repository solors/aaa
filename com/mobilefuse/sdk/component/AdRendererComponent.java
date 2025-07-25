package com.mobilefuse.sdk.component;

import android.content.Context;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;

/* loaded from: classes7.dex */
public interface AdRendererComponent {
    BaseAdRenderer createInstance(Context context, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable;
}
