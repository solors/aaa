package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a */
    private final Typeface f38092a;

    /* renamed from: b */
    private final ApplyFont f38093b;

    /* renamed from: c */
    private boolean f38094c;

    /* loaded from: classes5.dex */
    public interface ApplyFont {
        void apply(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f38092a = typeface;
        this.f38093b = applyFont;
    }

    /* renamed from: a */
    private void m71126a(Typeface typeface) {
        if (!this.f38094c) {
            this.f38093b.apply(typeface);
        }
    }

    public void cancel() {
        this.f38094c = true;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int i) {
        m71126a(this.f38092a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(Typeface typeface, boolean z) {
        m71126a(typeface);
    }
}
