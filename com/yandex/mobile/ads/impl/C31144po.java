package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.impl.C30958no;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.po */
/* loaded from: classes8.dex */
public final class C31144po extends bb2<TextView, C30958no> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31144po(@NotNull TextView view) {
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
    public final void mo27593b(TextView textView, C30958no c30958no) {
        TextView view = textView;
        C30958no value = c30958no;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        if (C30958no.EnumC30959a.f82840b == value.m31461b()) {
            view.setText(value.m31462a());
        }
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public final boolean mo27595a(TextView textView, C30958no c30958no) {
        TextView view = textView;
        C30958no value = c30958no;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        if (C30958no.EnumC30959a.f82840b == value.m31461b()) {
            return Intrinsics.m17075f(view.getText().toString(), value.m31462a());
        }
        return true;
    }
}
