package com.mobilefuse.sdk.p542ad.rendering.omniad.thumbnail;

import android.graphics.Point;
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
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.thumbnail.GetThumbnailInitSizeKt */
/* loaded from: classes7.dex */
public final class GetThumbnailInitSize {
    @NotNull
    public static final Point getThumbnailInitSize(@NotNull Point defaultSize, @NotNull Point admSize) {
        Either errorResult;
        Object obj;
        Intrinsics.checkNotNullParameter(defaultSize, "defaultSize");
        Intrinsics.checkNotNullParameter(admSize, "admSize");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (admSize.x > 1 && admSize.y > 1) {
            if (Intrinsics.m17075f(admSize, defaultSize)) {
                return defaultSize;
            }
            int max = Math.max(defaultSize.x, defaultSize.y);
            float f = admSize.x / admSize.y;
            Point point = new Point();
            if (f > 1) {
                point.x = max;
                point.y = (int) (max / f);
            } else {
                point.x = (int) (max * f);
                point.y = max;
            }
            errorResult = new SuccessResult(point);
            if (errorResult instanceof ErrorResult) {
                Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
                obj = defaultSize;
            } else if (errorResult instanceof SuccessResult) {
                obj = ((SuccessResult) errorResult).getValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return (Point) obj;
        }
        return defaultSize;
    }
}
