package com.yandex.div.core;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.div.core.g */
/* loaded from: classes8.dex */
public interface Div2ImageStubProvider {

    /* renamed from: a */
    public static final Div2ImageStubProvider f75263a = new Div2ImageStubProvider() { // from class: com.yandex.div.core.f
        @Override // com.yandex.div.core.Div2ImageStubProvider
        /* renamed from: a */
        public final Drawable mo37269a(int i) {
            return new ColorDrawable(i);
        }
    };

    @Nullable
    /* renamed from: a */
    Drawable mo37269a(@ColorInt int i);
}
