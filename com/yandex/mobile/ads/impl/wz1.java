package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wz1 extends bb2<TextView, String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz1(@NotNull TextView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public final void mo27596a(TextView textView) {
        TextView view = textView;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText("");
        super.mo27596a(view);
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: b */
    public final void mo27593b(TextView textView, String str) {
        TextView view = textView;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        view.setText(value);
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public final boolean mo27595a(TextView textView, String str) {
        boolean m16615y;
        TextView view = textView;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        CharSequence text = view.getText();
        if (text != null) {
            m16615y = StringsJVM.m16615y(String.valueOf(text), value, true);
            return m16615y;
        }
        return false;
    }
}
