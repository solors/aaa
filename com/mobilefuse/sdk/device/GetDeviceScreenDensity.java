package com.mobilefuse.sdk.device;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.mobilefuse.sdk.device.GetDeviceScreenDensityKt */
/* loaded from: classes7.dex */
public final class GetDeviceScreenDensity {
    public static final float getDeviceScreenDensity(@NotNull Context context) {
        Either errorResult;
        Object value;
        float f;
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "context");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                f = displayMetrics.density;
            } else {
                f = 1.0f;
            }
            errorResult = new SuccessResult(Float.valueOf(f));
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            value = Float.valueOf(1.0f);
        } else if (errorResult instanceof SuccessResult) {
            value = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ((Number) value).floatValue();
    }
}
