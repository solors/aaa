package com.p551my.target;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.core.view.GravityCompat;

/* renamed from: com.my.target.p8 */
/* loaded from: classes7.dex */
public class C26011p8 extends ProgressBar implements InterfaceC25985o8 {
    public C26011p8(Context context) {
        super(context, null, 16842872);
    }

    @Override // com.p551my.target.InterfaceC25985o8
    public void setColor(int i) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(16908288, colorDrawable);
        layerDrawable.setDrawableByLayerId(16908301, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    @Override // com.p551my.target.InterfaceC25985o8
    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    @Override // com.p551my.target.InterfaceC25985o8
    public void setTimeChanged(float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            setProgress((int) (f * 1000.0f), true);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", getProgress(), (int) (f * 1000.0f));
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    @Override // com.p551my.target.InterfaceC25985o8
    public void setVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    @Override // com.p551my.target.InterfaceC25985o8
    /* renamed from: a */
    public View mo43198a() {
        return this;
    }
}
