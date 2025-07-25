package com.p551my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;

/* renamed from: com.my.target.h8 */
/* loaded from: classes7.dex */
public interface InterfaceC25800h8 {

    /* renamed from: com.my.target.h8$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25801a {
        /* renamed from: a */
        void mo43244a(int i, Context context);

        /* renamed from: a */
        void mo43243a(View view, int i, int i2);

        /* renamed from: a */
        void mo43241a(int[] iArr, Context context);
    }

    void dispose();

    Parcelable getState();

    int[] getVisibleCardNumbers();

    void restoreState(Parcelable parcelable);

    void setPromoCardSliderListener(InterfaceC25801a interfaceC25801a);
}
