package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Da */
/* loaded from: classes6.dex */
public final class C18898Da extends AbstractC19546z1 {

    /* renamed from: b */
    public final WeakReference f47184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18898Da(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f47184b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.InterfaceC19155X
    /* renamed from: a */
    public final Object mo59568a() {
        long currentTimeMillis = System.currentTimeMillis();
        View adView = (View) this.f47184b.get();
        if (adView != null) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Bitmap createBitmap = Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            Drawable background = adView.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            adView.draw(canvas);
            if (createBitmap != null) {
                String message = "success - time taken - " + (System.currentTimeMillis() - currentTimeMillis);
                Intrinsics.checkNotNullParameter("ScreenShotProcess", "tag");
                Intrinsics.checkNotNullParameter(message, "message");
                Log.i("ScreenShotProcess", message);
                return m59525a(createBitmap);
            }
        }
        Intrinsics.checkNotNullParameter("ScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter("view reference lost. aborting...", "message");
        Log.i("ScreenShotProcess", "view reference lost. aborting...");
        String message2 = "fail - time taken - " + (System.currentTimeMillis() - currentTimeMillis);
        Intrinsics.checkNotNullParameter("ScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(message2, "message");
        Log.i("ScreenShotProcess", message2);
        return null;
    }
}
