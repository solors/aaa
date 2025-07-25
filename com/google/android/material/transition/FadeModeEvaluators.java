package com.google.android.material.transition;

/* loaded from: classes5.dex */
class FadeModeEvaluators {

    /* renamed from: a */
    private static final FadeModeEvaluator f38898a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70325a(255, TransitionUtils.m70248m(0, 255, f2, f3, f));
        }
    };

    /* renamed from: b */
    private static final FadeModeEvaluator f38899b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70324b(TransitionUtils.m70248m(255, 0, f2, f3, f), 255);
        }
    };

    /* renamed from: c */
    private static final FadeModeEvaluator f38900c = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70324b(TransitionUtils.m70248m(255, 0, f2, f3, f), TransitionUtils.m70248m(0, 255, f2, f3, f));
        }
    };

    /* renamed from: d */
    private static final FadeModeEvaluator f38901d = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return FadeModeResult.m70324b(TransitionUtils.m70248m(255, 0, f2, f5, f), TransitionUtils.m70248m(0, 255, f5, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FadeModeEvaluator m70326a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return f38901d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return f38900c;
            } else if (z) {
                return f38899b;
            } else {
                return f38898a;
            }
        } else if (z) {
            return f38898a;
        } else {
            return f38899b;
        }
    }
}
