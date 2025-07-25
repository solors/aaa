package com.mobilefuse.sdk.p542ad.rendering.splashad;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p542ad.rendering.omniad.GetWindowRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashAdController.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdControllerKt */
/* loaded from: classes7.dex */
public final class SplashAdControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Either<Throwable, Point> getClosedPosition(SplashAdController splashAdController) {
        Point point;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Rect windowRect = GetWindowRect.getWindowRect(splashAdController.getRenderingActivity());
            Point currentPosition = splashAdController.getOmniAdContainer$mobilefuse_sdk_mraid_release().getCurrentPosition();
            Point currentSize = splashAdController.getOmniAdContainer$mobilefuse_sdk_mraid_release().getCurrentSize();
            if (currentPosition.x + (currentSize.x / 2) < windowRect.left + (windowRect.width() / 2)) {
                point = new Point(-currentSize.x, currentPosition.y);
            } else {
                point = new Point(windowRect.right, currentPosition.y);
            }
            return new SuccessResult(point);
        } catch (Throwable th) {
            if (C23443x126cfb88.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return new ErrorResult(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point getSplashAdTransitionPosition(SplashAdController splashAdController) {
        Window window = splashAdController.getRenderingActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "renderingActivity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "renderingActivity.window.decorView");
        View findViewById = decorView.getRootView().findViewById(16908290);
        if (findViewById != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            Rect rect = new Rect();
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            viewGroup.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
            return new Point((rect.left + (rect.width() / 2)) - (splashAdController.getSizePx().x / 2), (rect.top + rect.height()) - splashAdController.getSizePx().y);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
