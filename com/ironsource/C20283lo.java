package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.lo */
/* loaded from: classes6.dex */
public final class C20283lo {
    @NotNull

    /* renamed from: a */
    public static final C20284a f51035a = new C20284a(null);

    @Metadata
    /* renamed from: com.ironsource.lo$a */
    /* loaded from: classes6.dex */
    public static final class C20284a {
        private C20284a() {
        }

        public /* synthetic */ C20284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private static final GradientDrawable m57372a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        /* renamed from: a */
        private final View m57371a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(m57372a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }

        @NotNull
        /* renamed from: a */
        public final View m57370a(@NotNull Context context, @Nullable String str, @NotNull InterfaceC20969sg imageLoader) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (str == null) {
                return m57371a(context);
            }
            Object mo54958a = imageLoader.mo54958a(str);
            if (Result.m14544g(mo54958a)) {
                mo54958a = null;
            }
            Drawable drawable = (Drawable) mo54958a;
            if (drawable != null) {
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                return imageView;
            }
            return m57371a(context);
        }
    }
}
