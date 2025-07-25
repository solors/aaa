package com.mobilefuse.sdk.p542ad.rendering.omniad.view;

import android.app.Activity;
import android.util.Log;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.config.ExternalUsageHelpers;
import com.mobilefuse.sdk.config.UsageInfoType;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: ViewRenderingPixels.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.view.ViewRenderingPixelsKt */
/* loaded from: classes7.dex */
public final class ViewRenderingPixelsKt {
    @Nullable
    public static final ViewRenderingPixels createViewRenderingPixels(@NotNull Activity activity) {
        Either errorResult;
        ViewRenderingPixels viewRenderingPixels;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object obj = null;
        try {
            if (ExternalUsageHelpers.Companion.hasUsageInfo(UsageInfoType.MODULE, ExternalUsageHelpers.SDK_MODULE_UNITY)) {
                Log.d("OmniAd", "Force rendering with 1x1 pixels.");
                viewRenderingPixels = new ViewRenderingPixels(activity);
                viewRenderingPixels.addPixels();
            } else {
                viewRenderingPixels = null;
            }
            errorResult = new SuccessResult(viewRenderingPixels);
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
        } else if (errorResult instanceof SuccessResult) {
            obj = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (ViewRenderingPixels) obj;
    }
}
