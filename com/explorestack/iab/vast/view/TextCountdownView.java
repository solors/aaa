package com.explorestack.iab.vast.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10507d;

/* loaded from: classes3.dex */
public class TextCountdownView extends IabTextView {
    @NonNull

    /* renamed from: g */
    private String f24312g;

    public TextCountdownView(Context context) {
        super(context);
        this.f24312g = "%1.0fs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.iab.vast.view.IabTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setProgress(int i) {
        setText(this.f24312g.replace("%1.0f", String.valueOf(i)));
    }

    public void setRemaining(int i) {
        setText(this.f24312g.replace("%1.0f", String.valueOf(i)));
    }

    @Override // com.explorestack.iab.vast.view.IabTextView, com.explorestack.iab.utils.InterfaceC10506c
    public void setStyle(@NonNull C10507d c10507d) {
        super.setStyle(c10507d);
        String m79372f = c10507d.m79372f();
        if (m79372f != null) {
            this.f24312g = m79372f;
        }
    }

    public TextCountdownView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24312g = "%1.0fs";
    }

    public void setProgress(int i, int i2) {
        setProgress(Math.round((i / i2) * 100.0f));
    }
}
