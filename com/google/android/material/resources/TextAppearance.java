package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C16310R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class TextAppearance {
    @Nullable

    /* renamed from: a */
    private ColorStateList f38095a;

    /* renamed from: b */
    private float f38096b;
    @FontRes

    /* renamed from: c */
    private final int f38097c;

    /* renamed from: d */
    private boolean f38098d = false;

    /* renamed from: e */
    private Typeface f38099e;
    @Nullable
    public final String fontFamily;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    @Nullable
    public final ColorStateList textColorHint;
    @Nullable
    public final ColorStateList textColorLink;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(@NonNull Context context, @StyleRes int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C16310R.styleable.TextAppearance);
        setTextSize(obtainStyledAttributes.getDimension(C16310R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = obtainStyledAttributes.getInt(C16310R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = obtainStyledAttributes.getInt(C16310R.styleable.TextAppearance_android_typeface, 1);
        int m71124b = MaterialResources.m71124b(obtainStyledAttributes, C16310R.styleable.TextAppearance_fontFamily, C16310R.styleable.TextAppearance_android_fontFamily);
        this.f38097c = obtainStyledAttributes.getResourceId(m71124b, 0);
        this.fontFamily = obtainStyledAttributes.getString(m71124b);
        this.textAllCaps = obtainStyledAttributes.getBoolean(C16310R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = obtainStyledAttributes.getFloat(C16310R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = obtainStyledAttributes.getFloat(C16310R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = obtainStyledAttributes.getFloat(C16310R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C16310R.styleable.MaterialTextAppearance);
        int i2 = C16310R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.hasLetterSpacing = obtainStyledAttributes2.hasValue(i2);
        this.letterSpacing = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m71120d() {
        String str;
        if (this.f38099e == null && (str = this.fontFamily) != null) {
            this.f38099e = Typeface.create(str, this.textStyle);
        }
        if (this.f38099e == null) {
            int i = this.typeface;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f38099e = Typeface.DEFAULT;
                    } else {
                        this.f38099e = Typeface.MONOSPACE;
                    }
                } else {
                    this.f38099e = Typeface.SERIF;
                }
            } else {
                this.f38099e = Typeface.SANS_SERIF;
            }
            this.f38099e = Typeface.create(this.f38099e, this.textStyle);
        }
    }

    /* renamed from: e */
    private boolean m71119e(Context context) {
        Typeface typeface;
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i = this.f38097c;
        if (i != 0) {
            typeface = ResourcesCompat.getCachedFont(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface getFallbackFont() {
        m71120d();
        return this.f38099e;
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
        if (this.f38098d) {
            return this.f38099e;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f38097c);
                this.f38099e = font;
                if (font != null) {
                    this.f38099e = Typeface.create(font, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.fontFamily, e);
            }
        }
        m71120d();
        this.f38098d = true;
        return this.f38099e;
    }

    public void getFontAsync(@NonNull Context context, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m71119e(context)) {
            getFont(context);
        } else {
            m71120d();
        }
        int i = this.f38097c;
        if (i == 0) {
            this.f38098d = true;
        }
        if (this.f38098d) {
            textAppearanceFontCallback.onFontRetrieved(this.f38099e, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i, new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrievalFailed(int i2) {
                    TextAppearance.this.f38098d = true;
                    textAppearanceFontCallback.onFontRetrievalFailed(i2);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrieved(@NonNull Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.f38099e = Typeface.create(typeface, textAppearance.textStyle);
                    TextAppearance.this.f38098d = true;
                    textAppearanceFontCallback.onFontRetrieved(TextAppearance.this.f38099e, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.f38098d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, e);
            this.f38098d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.f38095a;
    }

    public float getTextSize() {
        return this.f38096b;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.f38095a = colorStateList;
    }

    public void setTextSize(float f) {
        this.f38096b = f;
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        int i;
        int i2;
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f38095a;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        textPaint.setColor(i);
        float f = this.shadowRadius;
        float f2 = this.shadowDx;
        float f3 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m71119e(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        boolean z;
        float f;
        Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (maybeCopyWithFontWeightAdjustment != null) {
            typeface = maybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = this.textStyle & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f38096b);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(@NonNull final Context context, @NonNull final TextPaint textPaint, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i) {
                textAppearanceFontCallback.onFontRetrievalFailed(i);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
                TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface);
                textAppearanceFontCallback.onFontRetrieved(typeface, z);
            }
        });
    }
}
