package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FT */
/* loaded from: assets/audience_network.dex */
public final class C11780FT extends AbstractC13078af {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<AbstractC1117656> A0A = new ArrayList<>();
    public ArrayList<AbstractC1117656> A07 = new ArrayList<>();
    public ArrayList<C111314M> A09 = new ArrayList<>();
    public ArrayList<C111304L> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC1117656>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C111314M>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C111304L>> A03 = new ArrayList<>();
    public ArrayList<AbstractC1117656> A00 = new ArrayList<>();
    public ArrayList<AbstractC1117656> A04 = new ArrayList<>();
    public ArrayList<AbstractC1117656> A06 = new ArrayList<>();
    public ArrayList<AbstractC1117656> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final void A0I() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C111314M c111314m = this.A09.get(size2);
            View view = c111314m.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c111314m.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0P(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            AbstractC1117656 abstractC1117656 = this.A07.get(size4);
            abstractC1117656.A0H.setAlpha(1.0f);
            A0N(abstractC1117656);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C111304L> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A01(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C111314M> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C111314M c111314m2 = arrayList2.get(size7);
                    View view2 = c111314m2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(c111314m2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<AbstractC1117656> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    AbstractC1117656 abstractC11176562 = arrayList3.get(size9);
                    abstractC11176562.A0H.setAlpha(1.0f);
                    A0N(abstractC11176562);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<AbstractC1117656>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C111304L>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C111304L> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC13078af
    public final boolean A0T(AbstractC1117656 abstractC1117656, int i, int i2, int i3, int i4) {
        View view = abstractC1117656.A0H;
        int translationX = i + ((int) abstractC1117656.A0H.getTranslationX());
        int translationY = i2 + ((int) abstractC1117656.A0H.getTranslationY());
        A04(abstractC1117656);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0O(abstractC1117656);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new C111314M(abstractC1117656, translationX, translationY, i3, i4));
        return true;
    }

    private void A01(C111304L c111304l) {
        if (c111304l.A05 != null) {
            A07(c111304l, c111304l.A05);
        }
        if (c111304l.A04 != null) {
            A07(c111304l, c111304l.A04);
        }
    }

    private void A03(final AbstractC1117656 abstractC1117656) {
        final View view = abstractC1117656.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC1117656);
        ViewPropertyAnimator animation = animate.setDuration(A07());
        animation.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4G
            {
                C11780FT.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C11780FT.this.A0P(abstractC1117656);
                C11780FT.this.A06.remove(abstractC1117656);
                C11780FT.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC1117656 abstractC1117656) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC1117656.A0H.animate().setInterpolator(A0B);
        A0K(abstractC1117656);
    }

    private final void A05(List<AbstractC1117656> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C111304L> list, AbstractC1117656 abstractC1117656) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C111304L changeInfo = list.get(size);
            if (A07(changeInfo, abstractC1117656) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(C111304L c111304l, AbstractC1117656 abstractC1117656) {
        boolean z = false;
        if (c111304l.A04 == abstractC1117656) {
            c111304l.A04 = null;
        } else {
            AbstractC1117656 abstractC11176562 = c111304l.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (abstractC11176562 == abstractC1117656) {
                c111304l.A05 = null;
                z = true;
            } else {
                return false;
            }
        }
        abstractC1117656.A0H.setAlpha(1.0f);
        abstractC1117656.A0H.setTranslationX(0.0f);
        abstractC1117656.A0H.setTranslationY(0.0f);
        A0Q(abstractC1117656, z);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11780FT.A0J():void");
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final void A0K(AbstractC1117656 abstractC1117656) {
        View view = abstractC1117656.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == abstractC1117656) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC1117656);
                this.A09.remove(i);
            }
        }
        A06(this.A08, abstractC1117656);
        if (this.A0A.remove(abstractC1117656)) {
            view.setAlpha(1.0f);
            A0P(abstractC1117656);
        }
        if (this.A07.remove(abstractC1117656)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0N(abstractC1117656);
        }
        for (int i2 = this.A03.size() - 1; i2 >= 0; i2--) {
            ArrayList<C111304L> arrayList = this.A03.get(i2);
            A06(arrayList, abstractC1117656);
            if (arrayList.isEmpty()) {
                this.A03.remove(i2);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C111314M> arrayList2 = this.A05.get(size);
            int i3 = arrayList2.size() - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                } else if (arrayList2.get(i3).A04 == abstractC1117656) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0O(abstractC1117656);
                    arrayList2.remove(i3);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size);
                    }
                } else {
                    i3--;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<AbstractC1117656> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(abstractC1117656)) {
                view.setAlpha(1.0f);
                A0N(abstractC1117656);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(abstractC1117656);
        this.A00.remove(abstractC1117656);
        this.A02.remove(abstractC1117656);
        this.A04.remove(abstractC1117656);
        A0V();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0L() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0M(AbstractC1117656 abstractC1117656, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(abstractC1117656, payloads);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC13078af
    public final boolean A0R(AbstractC1117656 abstractC1117656) {
        A04(abstractC1117656);
        abstractC1117656.A0H.setAlpha(0.0f);
        this.A07.add(abstractC1117656);
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC13078af
    public final boolean A0S(AbstractC1117656 abstractC1117656) {
        A04(abstractC1117656);
        this.A0A.add(abstractC1117656);
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC13078af
    public final boolean A0U(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562, int i, int i2, int i3, int i4) {
        if (abstractC1117656 == abstractC11176562) {
            return A0T(abstractC1117656, i, i2, i3, i4);
        }
        float translationX = abstractC1117656.A0H.getTranslationX();
        float translationY = abstractC1117656.A0H.getTranslationY();
        float prevTranslationY = abstractC1117656.A0H.getAlpha();
        A04(abstractC1117656);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC1117656.A0H.setTranslationX(translationX);
        abstractC1117656.A0H.setTranslationY(translationY);
        abstractC1117656.A0H.setAlpha(prevTranslationY);
        if (abstractC11176562 != null) {
            A04(abstractC11176562);
            float prevTranslationX3 = -deltaY;
            abstractC11176562.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC11176562.A0H.setTranslationY(prevTranslationX4);
            abstractC11176562.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C111304L(abstractC1117656, abstractC11176562, i, i2, i3, i4));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final C111304L c111304l) {
        final View view;
        AbstractC1117656 holder = c111304l.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC1117656 holder2 = c111304l.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(c111304l.A05);
            oldViewAnim.translationX(c111304l.A02 - c111304l.A00);
            oldViewAnim.translationY(c111304l.A03 - c111304l.A01);
            oldViewAnim.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4J
                {
                    C11780FT.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C11780FT.this.A0Q(c111304l.A05, true);
                    C11780FT.this.A02.remove(c111304l.A05);
                    C11780FT.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(c111304l.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4K
                {
                    C11780FT.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C11780FT.this.A0Q(c111304l.A04, false);
                    C11780FT.this.A02.remove(c111304l.A04);
                    C11780FT.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC1117656 abstractC1117656) {
        final View view = abstractC1117656.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC1117656);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4H
            {
                C11780FT.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C11780FT.this.A0N(abstractC1117656);
                C11780FT.this.A00.remove(abstractC1117656);
                C11780FT.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC1117656 abstractC1117656, int i, int i2, int i3, int i4) {
        final View view = abstractC1117656.A0H;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC1117656);
        animate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4I
            {
                C11780FT.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C11780FT.this.A0O(abstractC1117656);
                C11780FT.this.A04.remove(abstractC1117656);
                C11780FT.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
