package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.du */
/* loaded from: classes8.dex */
public final class C30193du implements bt0 {
    @Nullable

    /* renamed from: a */
    private final CheckBox f78245a;
    @Nullable

    /* renamed from: b */
    private final ProgressBar f78246b;
    @Nullable

    /* renamed from: c */
    private final TextView f78247c;

    public C30193du() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30193du)) {
            return false;
        }
        C30193du c30193du = (C30193du) obj;
        if (Intrinsics.m17075f(this.f78245a, c30193du.f78245a) && Intrinsics.m17075f(this.f78246b, c30193du.f78246b) && Intrinsics.m17075f(this.f78247c, c30193du.f78247c)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public final TextView getCountDownProgress() {
        return this.f78247c;
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public final CheckBox getMuteControl() {
        return this.f78245a;
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public final ProgressBar getVideoProgress() {
        return this.f78246b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        CheckBox checkBox = this.f78245a;
        int i = 0;
        if (checkBox == null) {
            hashCode = 0;
        } else {
            hashCode = checkBox.hashCode();
        }
        int i2 = hashCode * 31;
        ProgressBar progressBar = this.f78246b;
        if (progressBar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = progressBar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        TextView textView = this.f78247c;
        if (textView != null) {
            i = textView.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        CheckBox checkBox = this.f78245a;
        ProgressBar progressBar = this.f78246b;
        TextView textView = this.f78247c;
        return "CustomControlsContainer(muteControl=" + checkBox + ", videoProgress=" + progressBar + ", countDownProgress=" + textView + ")";
    }

    public /* synthetic */ C30193du(int i) {
        this(null, null, null);
    }

    public C30193du(@Nullable CheckBox checkBox, @Nullable ProgressBar progressBar, @Nullable TextView textView) {
        this.f78245a = checkBox;
        this.f78246b = progressBar;
        this.f78247c = textView;
    }
}
