package com.mobilefuse.sdk.p542ad.rendering.omniad.container;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainerFactoryKt */
/* loaded from: classes7.dex */
public final class OmniAdContainerFactory {
    private static final InAppContainer createInAppContainer(Activity activity, View view, boolean z) {
        return new InAppContainer(activity, view, z);
    }

    @NotNull
    public static final OmniAdContainer createOmniAdContainer(@NotNull Activity activity, @NotNull View contentView) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        } else {
            z = false;
        }
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        boolean isHardwareAccelerated = decorView.isHardwareAccelerated();
        if (!z) {
            return createInAppContainer(activity, contentView, isHardwareAccelerated);
        }
        if (isHardwareAccelerated) {
            return createInAppContainer(activity, contentView, true);
        }
        return createWindowContainer(activity, contentView);
    }

    private static final WindowContainer createWindowContainer(Activity activity, View view) {
        return new WindowContainer(activity, view, null, 4, null);
    }
}
