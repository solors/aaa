package com.mobilefuse.sdk.p542ad.rendering.omniad.container;

import android.view.WindowManager;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import java.lang.reflect.Field;
import kotlin.Metadata;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: WindowContainer.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainerKt */
/* loaded from: classes7.dex */
public final class WindowContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void disableWindowDefaultAnimations(WindowManager.LayoutParams layoutParams) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Field field = WindowManager.LayoutParams.class.getField("privateFlags");
            Object obj = field.get(layoutParams);
            if (obj != null) {
                field.set(layoutParams, Integer.valueOf(((Integer) obj).intValue() | 64));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }
}
