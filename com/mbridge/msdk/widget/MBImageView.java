package com.mbridge.msdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.same.p438c.CommonImageLoader;
import com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener;
import com.mbridge.msdk.foundation.tools.SameLogTool;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class MBImageView extends ImageView {

    /* renamed from: a */
    private Bitmap f61441a;

    /* renamed from: b */
    private String f61442b;

    public MBImageView(Context context) {
        super(context);
        this.f61441a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f61441a;
        if (bitmap != null && bitmap.isRecycled()) {
            SameLogTool.m51824b("mb-widget-imageview", "onDraw bitmap recycled");
            if (getContext() != null) {
                CommonImageLoader.m52263a(getContext()).m52261a(this.f61442b, new CommonImageLoaderListener() { // from class: com.mbridge.msdk.widget.MBImageView.1
                    @Override // com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener
                    public final void onFailedLoad(String str, String str2) {
                        SameLogTool.m51824b("mb-widget-imageview", str2 + " load failed:" + str);
                    }

                    @Override // com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener
                    public final void onSuccessLoad(Bitmap bitmap2, String str) {
                        MBImageView.this.setImageBitmap(bitmap2);
                    }
                });
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f61441a = bitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            this.f61441a = null;
            super.setImageBitmap(null);
            SameLogTool.m51824b("mb-widget-imageview", "setImageBitmap recycled");
            return;
        }
        super.setImageBitmap(bitmap);
    }

    public void setImageUrl(String str) {
        this.f61442b = str;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61441a = null;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61441a = null;
    }
}
