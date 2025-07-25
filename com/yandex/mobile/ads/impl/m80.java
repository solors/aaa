package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.c80;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m80 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f82076a;
    @NotNull

    /* renamed from: b */
    private final kl1 f82077b;
    @NotNull

    /* renamed from: c */
    private final v31 f82078c;
    @NotNull

    /* renamed from: d */
    private final e21 f82079d;
    @NotNull

    /* renamed from: e */
    private final l80 f82080e;

    public m80(@NotNull C30359g3 adConfiguration, @NotNull kl1 reporter, @NotNull v31 nativeAdViewAdapter, @NotNull e21 nativeAdEventController, @NotNull l80 feedbackMenuCreator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(feedbackMenuCreator, "feedbackMenuCreator");
        this.f82076a = adConfiguration;
        this.f82077b = reporter;
        this.f82078c = nativeAdViewAdapter;
        this.f82079d = nativeAdEventController;
        this.f82080e = feedbackMenuCreator;
    }

    /* renamed from: a */
    public final void m32078a(@NotNull Context context, @NotNull c80 action) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        View m34235a = this.f82078c.m28537g().m34235a("feedback");
        if (m34235a instanceof ImageView) {
            imageView = (ImageView) m34235a;
        } else {
            imageView = null;
        }
        if (imageView == null) {
            return;
        }
        List<c80.C30076a> m35343c = action.m35343c();
        if (!m35343c.isEmpty()) {
            try {
                C30710k9 c30710k9 = new C30710k9(context, this.f82076a);
                this.f82080e.getClass();
                PopupMenu m32306a = l80.m32306a(context, imageView, m35343c);
                m32306a.setOnMenuItemClickListener(new lf1(c30710k9, m35343c, this.f82077b, this.f82079d));
                m32306a.show();
            } catch (Exception e) {
                Object[] args = new Object[0];
                int i = um0.f86330b;
                Intrinsics.checkNotNullParameter(args, "args");
                this.f82076a.m33949q().mo30597b().reportError("Failed to render feedback", e);
            }
        }
    }
}
