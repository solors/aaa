package com.smaato.sdk.core.mvvm.view;

import android.graphics.Rect;
import android.view.View;
import com.smaato.sdk.core.api.ImpressionCountingType;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class VisibilityAnalyzer {
    private static final double MIN_VISIBILITY_IMPRESSED = 0.1d;
    private final ImpressionCountingType impressionCountingType;
    private final WeakReference<View> viewReference;

    public VisibilityAnalyzer(View view, ImpressionCountingType impressionCountingType) {
        this.viewReference = new WeakReference<>(view);
        this.impressionCountingType = impressionCountingType;
    }

    private boolean checkVisibilityForImpressionTypeViewable() {
        View view = this.viewReference.get();
        if (view == null) {
            return false;
        }
        int height = view.getHeight() * view.getWidth();
        if (height < 242500) {
            if (getVisibleArea() < height * 0.5d) {
                return false;
            }
            return true;
        } else if (getVisibleArea() < height * 0.3d) {
            return false;
        } else {
            return true;
        }
    }

    private double getViewVisibilityRatio() {
        View view = this.viewReference.get();
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            return 0.0d;
        }
        return getVisibleArea() / (view.getWidth() * view.getHeight());
    }

    private int getVisibleArea() {
        View view = this.viewReference.get();
        Rect rect = new Rect();
        if (view != null && view.getGlobalVisibleRect(rect)) {
            return rect.width() * rect.height();
        }
        return 0;
    }

    public boolean is100PercentVisible() {
        if (getViewVisibilityRatio() >= 1.0d) {
            return true;
        }
        return false;
    }

    public boolean is50PercentVisible() {
        if (getViewVisibilityRatio() >= 0.5d) {
            return true;
        }
        return false;
    }

    public boolean isImpressed() {
        if (this.impressionCountingType.equals(ImpressionCountingType.VIEWABLE)) {
            if (getViewVisibilityRatio() > 0.1d && checkVisibilityForImpressionTypeViewable()) {
                return true;
            }
            return false;
        } else if (getViewVisibilityRatio() > 0.1d) {
            return true;
        } else {
            return false;
        }
    }
}
