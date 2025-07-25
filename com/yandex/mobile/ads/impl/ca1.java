package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ca1 implements c11 {

    /* renamed from: a */
    private final int f77567a;

    public ca1(int i) {
        this.f77567a = i;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: a */
    public final View mo34728a(@NotNull View container, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag(assetName + "_" + i);
        if (findViewWithTag instanceof View) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: b */
    public final CheckBox mo34727b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("mute_button_" + i);
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: c */
    public final CustomizableMediaView mo34726c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("media_" + i);
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: d */
    public final TextView mo34725d(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("price_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: e */
    public final TextView mo34724e(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("call_to_action_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: f */
    public final TextView mo34723f(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("warning_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: g */
    public final ImageView mo34722g(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("favicon_" + i);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: h */
    public final TextView mo34721h(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("age_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: i */
    public final View mo34720i(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("rating_" + i);
        if (!(findViewWithTag instanceof View)) {
            return null;
        }
        return findViewWithTag;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: j */
    public final TextView mo34719j(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("title_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: k */
    public final ProgressBar mo34718k(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        return (ProgressBar) container.findViewWithTag("video_progress_" + i);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: l */
    public final ImageView mo34717l(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("feedback_" + i);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: m */
    public final TextView mo34716m(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("sponsored_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: n */
    public final TextView mo34715n(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("domain_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: o */
    public final ImageView mo34714o(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("icon_" + i);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: p */
    public final TextView mo34713p(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("review_count_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: a */
    public final TextView mo34729a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        int i = this.f77567a;
        View findViewWithTag = container.findViewWithTag("body_" + i);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }
}
