package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ironsource.C21114v8;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class z31 {
    @Nullable

    /* renamed from: a */
    private final CheckBox f88685a;
    @Nullable

    /* renamed from: b */
    private final ProgressBar f88686b;
    @NotNull

    /* renamed from: c */
    private final View f88687c;
    @NotNull

    /* renamed from: d */
    private final Map<String, View> f88688d;
    @NotNull

    /* renamed from: e */
    private final u41 f88689e;
    @Nullable

    /* renamed from: f */
    private final ImageView f88690f;

    /* renamed from: com.yandex.mobile.ads.impl.z31$a */
    /* loaded from: classes8.dex */
    public static final class C31951a {
        @NotNull

        /* renamed from: a */
        private final View f88691a;
        @NotNull

        /* renamed from: b */
        private final u41 f88692b;
        @Nullable

        /* renamed from: c */
        private CheckBox f88693c;
        @Nullable

        /* renamed from: d */
        private ProgressBar f88694d;
        @NotNull

        /* renamed from: e */
        private final Map<String, View> f88695e;
        @Nullable

        /* renamed from: f */
        private ImageView f88696f;

        public C31951a(@NotNull View nativeAdView, @NotNull u41 nativeBindType, @NotNull Map<String, ? extends View> initialAssetViews) {
            Map<String, View> m17285D;
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(nativeBindType, "nativeBindType");
            Intrinsics.checkNotNullParameter(initialAssetViews, "initialAssetViews");
            this.f88691a = nativeAdView;
            this.f88692b = nativeBindType;
            m17285D = C37559r0.m17285D(initialAssetViews);
            this.f88695e = m17285D;
        }

        @NotNull
        /* renamed from: a */
        public final Map<String, View> m26454a() {
            return this.f88695e;
        }

        @Nullable
        /* renamed from: b */
        public final ImageView m26446b() {
            return this.f88696f;
        }

        @Nullable
        /* renamed from: c */
        public final CheckBox m26443c() {
            return this.f88693c;
        }

        @NotNull
        /* renamed from: d */
        public final View m26440d() {
            return this.f88691a;
        }

        @NotNull
        /* renamed from: e */
        public final u41 m26437e() {
            return this.f88692b;
        }

        @Nullable
        /* renamed from: f */
        public final ProgressBar m26435f() {
            return this.f88694d;
        }

        @NotNull
        /* renamed from: g */
        public final C31951a m26433g(@Nullable TextView textView) {
            this.f88695e.put("sponsored", textView);
            return this;
        }

        @NotNull
        /* renamed from: h */
        public final C31951a m26432h(@Nullable TextView textView) {
            this.f88695e.put("title", textView);
            return this;
        }

        @NotNull
        /* renamed from: i */
        public final C31951a m26431i(@Nullable TextView textView) {
            this.f88695e.put("warning", textView);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31951a m26448a(@Nullable TextView textView) {
            this.f88695e.put("age", textView);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C31951a m26444b(@Nullable TextView textView) {
            this.f88695e.put("body", textView);
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C31951a m26441c(@Nullable TextView textView) {
            this.f88695e.put("call_to_action", textView);
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C31951a m26438d(@Nullable TextView textView) {
            this.f88695e.put(C21114v8.C21123i.f54109D, textView);
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C31951a m26436e(@Nullable TextView textView) {
            this.f88695e.put("price", textView);
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final C31951a m26434f(@Nullable TextView textView) {
            this.f88695e.put("review_count", textView);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final void m26452a(@Nullable View view, @NotNull String assetName) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            this.f88695e.put(assetName, view);
        }

        @NotNull
        /* renamed from: b */
        public final C31951a m26445b(@Nullable ImageView imageView) {
            this.f88695e.put("feedback", imageView);
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C31951a m26442c(@Nullable ImageView imageView) {
            this.f88695e.put("icon", imageView);
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C31951a m26439d(@Nullable ImageView imageView) {
            this.f88696f = imageView;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31951a m26450a(@Nullable ImageView imageView) {
            this.f88695e.put("favicon", imageView);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31951a m26447a(@Nullable CustomizableMediaView customizableMediaView) {
            this.f88695e.put("media", customizableMediaView);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31951a m26451a(@Nullable CheckBox checkBox) {
            this.f88693c = checkBox;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31951a m26453a(@Nullable View view) {
            this.f88695e.put("rating", view);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31951a m26449a(@Nullable ProgressBar progressBar) {
            this.f88694d = progressBar;
            return this;
        }
    }

    private z31(C31951a c31951a) {
        this.f88685a = c31951a.m26443c();
        this.f88686b = c31951a.m26435f();
        this.f88687c = c31951a.m26440d();
        this.f88688d = c31951a.m26454a();
        this.f88689e = c31951a.m26437e();
        this.f88690f = c31951a.m26446b();
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, View> m26460a() {
        return this.f88688d;
    }

    @Nullable
    /* renamed from: b */
    public final ImageView m26459b() {
        return this.f88690f;
    }

    @Nullable
    /* renamed from: c */
    public final CheckBox m26458c() {
        return this.f88685a;
    }

    @NotNull
    /* renamed from: d */
    public final View m26457d() {
        return this.f88687c;
    }

    @NotNull
    /* renamed from: e */
    public final u41 m26456e() {
        return this.f88689e;
    }

    @Nullable
    /* renamed from: f */
    public final ProgressBar m26455f() {
        return this.f88686b;
    }

    public /* synthetic */ z31(C31951a c31951a, int i) {
        this(c31951a);
    }
}
