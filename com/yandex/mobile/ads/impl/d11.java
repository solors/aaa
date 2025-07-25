package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class d11 implements c11 {
    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: a */
    public final View mo34728a(@NotNull View container, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: b */
    public final CheckBox mo34727b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: c */
    public final CustomizableMediaView mo34726c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (CustomizableMediaView) container.findViewById(C29880R.C29884id.media);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: d */
    public final TextView mo34725d(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.price);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: e */
    public final TextView mo34724e(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.call_to_action);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: f */
    public final TextView mo34723f(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.warning);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: g */
    public final ImageView mo34722g(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(C29880R.C29884id.favicon);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: h */
    public final TextView mo34721h(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.age);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: i */
    public final View mo34720i(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewById(C29880R.C29884id.rating);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: j */
    public final TextView mo34719j(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.title);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: k */
    public final ProgressBar mo34718k(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: l */
    public final ImageView mo34717l(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(C29880R.C29884id.feedback);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: m */
    public final TextView mo34716m(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.sponsored);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: n */
    public final TextView mo34715n(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.domain);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: o */
    public final ImageView mo34714o(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(C29880R.C29884id.icon);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: p */
    public final TextView mo34713p(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.review_count);
    }

    @Override // com.yandex.mobile.ads.impl.c11
    @Nullable
    /* renamed from: a */
    public final TextView mo34729a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(C29880R.C29884id.body);
    }
}
