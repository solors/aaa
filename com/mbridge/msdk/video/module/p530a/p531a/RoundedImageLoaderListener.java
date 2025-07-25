package com.mbridge.msdk.video.module.p530a.p531a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameImageTool;

/* renamed from: com.mbridge.msdk.video.module.a.a.j */
/* loaded from: classes6.dex */
public final class RoundedImageLoaderListener extends DefaultImageLoaderListener {

    /* renamed from: a */
    private int f60811a;

    public RoundedImageLoaderListener(ImageView imageView, int i) {
        super(imageView);
        this.f60811a = i;
    }

    @Override // com.mbridge.msdk.video.module.p530a.p531a.DefaultImageLoaderListener, com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener
    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap m51829a;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f60805b != null && !bitmap.isRecycled() && (m51829a = SameImageTool.m51829a(bitmap, 1, this.f60811a)) != null) {
                this.f60805b.setImageBitmap(m51829a);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
