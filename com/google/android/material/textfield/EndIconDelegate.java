package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class EndIconDelegate {

    /* renamed from: a */
    final TextInputLayout f38562a;

    /* renamed from: b */
    final EndCompoundLayout f38563b;

    /* renamed from: c */
    final Context f38564c;

    /* renamed from: d */
    final CheckableImageButton f38565d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        this.f38562a = endCompoundLayout.f38534b;
        this.f38563b = endCompoundLayout;
        this.f38564c = endCompoundLayout.getContext();
        this.f38565d = endCompoundLayout.m70649r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StringRes
    /* renamed from: b */
    public int mo70555b() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @DrawableRes
    /* renamed from: c */
    public int mo70554c() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.OnFocusChangeListener mo70628d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View.OnClickListener mo70553e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View.OnFocusChangeListener mo70627f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo70626g(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo70625h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo70624i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo70552j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo70551k() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m70622m() {
        this.f38563b.m70697M(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo70621o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo70550n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo70549p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void afterEditTextChanged(Editable editable) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo70623l(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEditTextAttached(@Nullable EditText editText) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70556a(CharSequence charSequence, int i, int i2, int i3) {
    }
}
