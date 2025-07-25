package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.view.TextImageView */
/* loaded from: classes8.dex */
public class TextImageView extends TextView {
    private int c2oc2i;
    private int c2oc2o;
    private int cco22;
    private int cii2c2;
    private int ciii2coi2;
    private int cioccoiococ;
    private int coi222o222;
    private int coo2iico;

    public TextImageView(Context context) {
        super(context);
    }

    public void coo2iico(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32065R.styleable.TextImageView);
        this.coo2iico = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableLeftWidth, 0);
        this.coi222o222 = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableLeftHeight, 0);
        this.c2oc2i = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableTopWidth, 0);
        this.cioccoiococ = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableTopHeight, 0);
        this.c2oc2o = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableRightWidth, 0);
        this.cco22 = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableRightHeight, 0);
        this.cii2c2 = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableBottomWidth, 0);
        this.ciii2coi2 = obtainStyledAttributes.getDimensionPixelOffset(C32065R.styleable.TextImageView_drawableBottomHeight, 0);
        obtainStyledAttributes.recycle();
        coo2iico();
    }

    public TextImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        coo2iico(context, attributeSet);
    }

    public TextImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        coo2iico(context, attributeSet);
    }

    private void coo2iico() {
        Drawable[] compoundDrawables = getCompoundDrawables();
        for (int i = 0; i < compoundDrawables.length; i++) {
            if (i == 0) {
                coo2iico(compoundDrawables[0], this.coo2iico, this.coi222o222);
            } else if (i == 1) {
                coo2iico(compoundDrawables[1], this.c2oc2i, this.cioccoiococ);
            } else if (i == 2) {
                coo2iico(compoundDrawables[2], this.c2oc2o, this.cco22);
            } else if (i == 3) {
                coo2iico(compoundDrawables[3], this.cii2c2, this.ciii2coi2);
            }
        }
        setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    private void coo2iico(Drawable drawable, int i, int i2) {
        if (drawable != null) {
            double intrinsicHeight = drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
            drawable.setBounds(0, 0, i, i2);
            Rect bounds = drawable.getBounds();
            int i3 = bounds.right;
            if (i3 == 0 && bounds.bottom == 0) {
                return;
            }
            if (i3 == 0) {
                bounds.right = (int) (bounds.bottom / intrinsicHeight);
                drawable.setBounds(bounds);
            }
            if (bounds.bottom == 0) {
                bounds.bottom = (int) (bounds.right * intrinsicHeight);
                drawable.setBounds(bounds);
            }
        }
    }
}
