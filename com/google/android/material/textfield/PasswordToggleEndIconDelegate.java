package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.C16310R;

/* loaded from: classes5.dex */
public class PasswordToggleEndIconDelegate extends EndIconDelegate {

    /* renamed from: e */
    private int f38604e;
    @Nullable

    /* renamed from: f */
    private EditText f38605f;

    /* renamed from: g */
    private final View.OnClickListener f38606g;

    public PasswordToggleEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout, @DrawableRes int i) {
        super(endCompoundLayout);
        this.f38604e = C16310R.C16312drawable.design_password_eye;
        this.f38606g = new View.OnClickListener() { // from class: com.google.android.material.textfield.n
            {
                PasswordToggleEndIconDelegate.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordToggleEndIconDelegate.this.m70545t(view);
            }
        };
        if (i != 0) {
            this.f38604e = i;
        }
    }

    /* renamed from: r */
    private boolean m70547r() {
        EditText editText = this.f38605f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private static boolean m70546s(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public /* synthetic */ void m70545t(View view) {
        EditText editText = this.f38605f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (m70547r()) {
            this.f38605f.setTransformationMethod(null);
        } else {
            this.f38605f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f38605f.setSelection(selectionEnd);
        }
        m70622m();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: a */
    public void mo70556a(CharSequence charSequence, int i, int i2, int i3) {
        m70622m();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @StringRes
    /* renamed from: b */
    public int mo70555b() {
        return C16310R.C16316string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @DrawableRes
    /* renamed from: c */
    public int mo70554c() {
        return this.f38604e;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: e */
    public View.OnClickListener mo70553e() {
        return this.f38606g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: j */
    public boolean mo70552j() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: k */
    public boolean mo70551k() {
        return !m70547r();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: n */
    public void mo70550n() {
        if (m70546s(this.f38605f)) {
            this.f38605f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.f38605f = editText;
        m70622m();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: p */
    public void mo70549p() {
        EditText editText = this.f38605f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
