package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class TextDrawableHelper {

    /* renamed from: c */
    private float f37843c;
    @Nullable

    /* renamed from: f */
    private TextAppearance f37846f;

    /* renamed from: a */
    private final TextPaint f37841a = new TextPaint(1);

    /* renamed from: b */
    private final TextAppearanceFontCallback f37842b = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            TextDrawableHelper.this.f37844d = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f37845e.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
            if (!z) {
                TextDrawableHelper.this.f37844d = true;
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f37845e.get();
                if (textDrawableDelegate != null) {
                    textDrawableDelegate.onTextSizeChange();
                }
            }
        }
    };

    /* renamed from: d */
    private boolean f37844d = true;
    @Nullable

    /* renamed from: e */
    private WeakReference<TextDrawableDelegate> f37845e = new WeakReference<>(null);

    /* loaded from: classes5.dex */
    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    /* renamed from: c */
    private float m71296c(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f37841a.measureText(charSequence, 0, charSequence.length());
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f37846f;
    }

    @NonNull
    public TextPaint getTextPaint() {
        return this.f37841a;
    }

    public float getTextWidth(String str) {
        if (!this.f37844d) {
            return this.f37843c;
        }
        float m71296c = m71296c(str);
        this.f37843c = m71296c;
        this.f37844d = false;
        return m71296c;
    }

    public boolean isTextWidthDirty() {
        return this.f37844d;
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.f37845e = new WeakReference<>(textDrawableDelegate);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance, Context context) {
        if (this.f37846f != textAppearance) {
            this.f37846f = textAppearance;
            if (textAppearance != null) {
                textAppearance.updateMeasureState(context, this.f37841a, this.f37842b);
                TextDrawableDelegate textDrawableDelegate = this.f37845e.get();
                if (textDrawableDelegate != null) {
                    this.f37841a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.f37841a, this.f37842b);
                this.f37844d = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = this.f37845e.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void setTextWidthDirty(boolean z) {
        this.f37844d = z;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f37846f.updateDrawState(context, this.f37841a, this.f37842b);
    }
}
