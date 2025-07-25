package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class StateListAnimator {

    /* renamed from: a */
    private final ArrayList<Tuple> f37819a = new ArrayList<>();
    @Nullable

    /* renamed from: b */
    private Tuple f37820b = null;
    @Nullable

    /* renamed from: c */
    ValueAnimator f37821c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f37822d = new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.StateListAnimator.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f37821c == animator) {
                stateListAnimator.f37821c = null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Tuple {

        /* renamed from: a */
        final int[] f37824a;

        /* renamed from: b */
        final ValueAnimator f37825b;

        Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.f37824a = iArr;
            this.f37825b = valueAnimator;
        }
    }

    /* renamed from: a */
    private void m71300a() {
        ValueAnimator valueAnimator = this.f37821c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37821c = null;
        }
    }

    /* renamed from: b */
    private void m71299b(@NonNull Tuple tuple) {
        ValueAnimator valueAnimator = tuple.f37825b;
        this.f37821c = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.f37822d);
        this.f37819a.add(tuple);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f37821c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f37821c = null;
        }
    }

    public void setState(int[] iArr) {
        Tuple tuple;
        int size = this.f37819a.size();
        int i = 0;
        while (true) {
            if (i < size) {
                tuple = this.f37819a.get(i);
                if (StateSet.stateSetMatches(tuple.f37824a, iArr)) {
                    break;
                }
                i++;
            } else {
                tuple = null;
                break;
            }
        }
        Tuple tuple2 = this.f37820b;
        if (tuple == tuple2) {
            return;
        }
        if (tuple2 != null) {
            m71300a();
        }
        this.f37820b = tuple;
        if (tuple != null) {
            m71299b(tuple);
        }
    }
}
