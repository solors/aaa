package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes5.dex */
class FitModeEvaluators {

    /* renamed from: a */
    private static final FitModeEvaluator f39080a = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f39087f - fitModeResult.f39085d) * f;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m70151m = TransitionUtils.m70151m(f4, f6, f2, f3, f, true);
            float f8 = m70151m / f4;
            float f9 = m70151m / f6;
            return new FitModeResult(f8, f9, m70151m, f5 * f8, m70151m, f7 * f9);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            if (fitModeResult.f39085d > fitModeResult.f39087f) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: b */
    private static final FitModeEvaluator f39081b = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.f39086e - fitModeResult.f39084c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m70151m = TransitionUtils.m70151m(f5, f7, f2, f3, f, true);
            float f8 = m70151m / f5;
            float f9 = m70151m / f7;
            return new FitModeResult(f8, f9, f4 * f8, m70151m, f6 * f9, m70151m);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            if (fitModeResult.f39084c > fitModeResult.f39086e) {
                return true;
            }
            return false;
        }
    };

    private FitModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FitModeEvaluator m70234a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f39081b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return f39080a;
        } else if (m70233b(z, rectF, rectF2)) {
            return f39080a;
        } else {
            return f39081b;
        }
    }

    /* renamed from: b */
    private static boolean m70233b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }
}
