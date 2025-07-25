package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C19372m9;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: com.inmobi.media.m9 */
/* loaded from: classes6.dex */
public final class C19372m9 extends AbstractC19546z1 {

    /* renamed from: b */
    public final Window f48509b;

    /* renamed from: c */
    public final AtomicBoolean f48510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19372m9(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f48509b = window;
        this.f48510c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC19155X
    /* renamed from: b */
    public final Bitmap mo59568a() {
        long currentTimeMillis = System.currentTimeMillis();
        int width = this.f48509b.getDecorView().getWidth();
        int height = this.f48509b.getDecorView().getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref ref = new Ref();
        int layerType = this.f48509b.getDecorView().getLayerType();
        this.f48509b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f48509b, rect, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o3.f5
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                C19372m9.m60017a(ref, this, i);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f48510c.get()) {
            Thread.sleep(500L);
        }
        String message = "success - " + ref.f99319b + " - time - " + (System.currentTimeMillis() - currentTimeMillis);
        Intrinsics.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this.f48509b.getDecorView().setLayerType(layerType, null);
        if (!ref.f99319b) {
            return null;
        }
        Intrinsics.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter("success", "message");
        Log.i("PixelCopyScreenShotProcess", "success");
        return m59525a(createBitmap);
    }

    /* renamed from: a */
    public static final void m60017a(Ref isSuccess, C19372m9 this$0, int i) {
        Intrinsics.checkNotNullParameter(isSuccess, "$isSuccess");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            isSuccess.f99319b = true;
        }
        String message = "capture result - success - " + isSuccess.f99319b;
        Intrinsics.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this$0.f48510c.set(true);
    }
}
