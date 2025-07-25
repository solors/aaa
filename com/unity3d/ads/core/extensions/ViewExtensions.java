package com.unity3d.ads.core.extensions;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.ViewExtensionsKt */
/* loaded from: classes7.dex */
public final class ViewExtensions {
    public static final void removeViewFromParent(@Nullable View view) {
        ViewParent viewParent;
        ViewGroup viewGroup = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
