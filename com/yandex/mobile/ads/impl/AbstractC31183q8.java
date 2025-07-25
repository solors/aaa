package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.q8 */
/* loaded from: classes8.dex */
public abstract class AbstractC31183q8 {
    /* renamed from: a */
    public static xh2 m30449a(C31266r8 c31266r8, C31338s8 c31338s8) {
        if (cb1.m35319a()) {
            return new xh2(c31266r8, c31338s8);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: a */
    public abstract void mo27493a();

    /* renamed from: a */
    public abstract void mo27492a(View view);

    /* renamed from: a */
    public abstract void mo27491a(View view, fa0 fa0Var, @Nullable String str);

    /* renamed from: b */
    public abstract void mo27489b();
}
