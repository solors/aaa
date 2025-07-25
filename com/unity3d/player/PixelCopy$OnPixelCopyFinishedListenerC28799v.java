package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.PixelCopy;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.v */
/* loaded from: classes7.dex */
public class PixelCopy$OnPixelCopyFinishedListenerC28799v extends View implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    Bitmap f74899a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PixelCopy$OnPixelCopyFinishedListenerC28799v(C28800w c28800w, Context context) {
        super(context);
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public void onPixelCopyFinished(int i) {
        if (i == 0) {
            setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ViewCompat.MEASURED_STATE_MASK), new BitmapDrawable(getResources(), this.f74899a)}));
        }
    }
}
