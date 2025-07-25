package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: classes5.dex */
class FitModeEvaluators {

    /* renamed from: a */
    private static final FitModeEvaluator f38921a = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f38928f - fitModeResult.f38926d) * f;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m70249l = TransitionUtils.m70249l(f4, f6, f2, f3, f, true);
            float f8 = m70249l / f4;
            float f9 = m70249l / f6;
            return new FitModeResult(f8, f9, m70249l, f5 * f8, m70249l, f7 * f9);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            if (fitModeResult.f38926d > fitModeResult.f38928f) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: b */
    private static final FitModeEvaluator f38922b = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.f38927e - fitModeResult.f38925c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m70249l = TransitionUtils.m70249l(f5, f7, f2, f3, f, true);
            float f8 = m70249l / f5;
            float f9 = m70249l / f7;
            return new FitModeResult(f8, f9, f4 * f8, m70249l, f6 * f9, m70249l);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            if (fitModeResult.f38925c > fitModeResult.f38927e) {
                return true;
            }
            return false;
        }
    };

    private FitModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FitModeEvaluator m70321a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f38922b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return f38921a;
        } else if (m70320b(z, rectF, rectF2)) {
            return f38921a;
        } else {
            return f38922b;
        }
    }

    /* renamed from: b */
    private static boolean m70320b(boolean z, RectF rectF, RectF rectF2) {
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
