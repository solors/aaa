package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes5.dex */
class FadeModeEvaluators {

    /* renamed from: a */
    private static final FadeModeEvaluator f39057a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70238a(255, TransitionUtils.m70150n(0, 255, f2, f3, f));
        }
    };

    /* renamed from: b */
    private static final FadeModeEvaluator f39058b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70237b(TransitionUtils.m70150n(255, 0, f2, f3, f), 255);
        }
    };

    /* renamed from: c */
    private static final FadeModeEvaluator f39059c = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70237b(TransitionUtils.m70150n(255, 0, f2, f3, f), TransitionUtils.m70150n(0, 255, f2, f3, f));
        }
    };

    /* renamed from: d */
    private static final FadeModeEvaluator f39060d = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return FadeModeResult.m70237b(TransitionUtils.m70150n(255, 0, f2, f5, f), TransitionUtils.m70150n(0, 255, f5, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FadeModeEvaluator m70239a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return f39060d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return f39059c;
            } else if (z) {
                return f39058b;
            } else {
                return f39057a;
            }
        } else if (z) {
            return f39057a;
        } else {
            return f39058b;
        }
    }
}
