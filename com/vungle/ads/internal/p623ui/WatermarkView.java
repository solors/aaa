package com.vungle.ads.internal.p623ui;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WatermarkView.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.ui.WatermarkView */
/* loaded from: classes7.dex */
public class WatermarkView extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(@NotNull Context context, @NotNull String watermark) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        Intrinsics.checkNotNullExpressionValue(overlayBytes, "overlayBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
