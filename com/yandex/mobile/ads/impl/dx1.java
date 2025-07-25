package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dx1 implements lk0 {
    @Nullable

    /* renamed from: a */
    private final C31034of<?> f78265a;
    @Nullable

    /* renamed from: b */
    private final C30777l9 f78266b;
    @NotNull

    /* renamed from: c */
    private final C31349sf f78267c;
    @NotNull

    /* renamed from: d */
    private final ex1 f78268d;

    public dx1(@Nullable C31034of<?> c31034of, @Nullable C30777l9 c30777l9, @NotNull C31349sf clickConfigurator, @NotNull ex1 sponsoredTextFormatter) {
        Intrinsics.checkNotNullParameter(clickConfigurator, "clickConfigurator");
        Intrinsics.checkNotNullParameter(sponsoredTextFormatter, "sponsoredTextFormatter");
        this.f78265a = c31034of;
        this.f78266b = c30777l9;
        this.f78267c = clickConfigurator;
        this.f78268d = sponsoredTextFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Object obj;
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35620n = uiElements.m35620n();
        if (m35620n != null) {
            C31034of<?> c31034of = this.f78265a;
            if (c31034of != null) {
                obj = c31034of.m31041d();
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                m35620n.setText((CharSequence) obj);
                m35620n.setVisibility(0);
            }
            C30777l9 c30777l9 = this.f78266b;
            if (c30777l9 != null && c30777l9.m32303b()) {
                C30777l9 c30777l92 = this.f78266b;
                m35620n.setText(this.f78268d.m34413a(m35620n.getText().toString(), c30777l92));
                m35620n.setVisibility(0);
                m35620n.setSelected(true);
                m35620n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                m35620n.setMarqueeRepeatLimit(-1);
            }
            this.f78267c.m29633a(m35620n, this.f78265a);
        }
    }
}
