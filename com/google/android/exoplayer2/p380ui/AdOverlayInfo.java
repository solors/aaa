package com.google.android.exoplayer2.p380ui;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo */
/* loaded from: classes4.dex */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 2;
    public static final int PURPOSE_CONTROLS = 1;
    public static final int PURPOSE_NOT_VISIBLE = 4;
    public static final int PURPOSE_OTHER = 3;
    public final int purpose;
    @Nullable
    public final String reasonDetail;
    public final View view;

    /* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private final View f35231a;

        /* renamed from: b */
        private final int f35232b;
        @Nullable

        /* renamed from: c */
        private String f35233c;

        public Builder(View view, int i) {
            this.f35231a = view;
            this.f35232b = i;
        }

        public AdOverlayInfo build() {
            return new AdOverlayInfo(this.f35231a, this.f35232b, this.f35233c);
        }

        @CanIgnoreReturnValue
        public Builder setDetailedReason(@Nullable String str) {
            this.f35233c = str;
            return this;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo$Purpose */
    /* loaded from: classes4.dex */
    public @interface Purpose {
    }

    @Deprecated
    public AdOverlayInfo(View view, int i) {
        this(view, i, null);
    }

    @Deprecated
    public AdOverlayInfo(View view, int i, @Nullable String str) {
        this.view = view;
        this.purpose = i;
        this.reasonDetail = str;
    }
}
