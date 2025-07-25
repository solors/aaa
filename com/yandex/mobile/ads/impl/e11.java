package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ironsource.C21114v8;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class e11 implements c11 {
    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: a */
    public final View mo34728a(@NotNull View container, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        View findViewWithTag = container.findViewWithTag(assetName);
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
        View findViewWithTag = container.findViewWithTag("mute_button");
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
        View findViewWithTag = container.findViewWithTag("media");
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
        View findViewWithTag = container.findViewWithTag("price");
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
        View findViewWithTag = container.findViewWithTag("call_to_action");
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
        View findViewWithTag = container.findViewWithTag("warning");
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
        View findViewWithTag = container.findViewWithTag("favicon");
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
        View findViewWithTag = container.findViewWithTag("age");
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
        View findViewWithTag = container.findViewWithTag("rating");
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
        View findViewWithTag = container.findViewWithTag("title");
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
        View findViewWithTag = container.findViewWithTag("video_progress");
        if (findViewWithTag instanceof ProgressBar) {
            return (ProgressBar) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: l */
    public final ImageView mo34717l(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("feedback");
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
        View findViewWithTag = container.findViewWithTag("sponsored");
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
        View findViewWithTag = container.findViewWithTag(C21114v8.C21123i.f54109D);
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
        View findViewWithTag = container.findViewWithTag("icon");
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
        View findViewWithTag = container.findViewWithTag("review_count");
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
        View findViewWithTag = container.findViewWithTag("body");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }
}
