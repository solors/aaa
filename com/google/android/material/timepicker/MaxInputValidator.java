package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes5.dex */
class MaxInputValidator implements InputFilter {

    /* renamed from: a */
    private int f38790a;

    public MaxInputValidator(int i) {
        this.f38790a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f38790a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.f38790a;
    }

    public void setMax(int i) {
        this.f38790a = i;
    }
}
