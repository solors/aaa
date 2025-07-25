package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C16310R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class EndCompoundLayout extends LinearLayout {

    /* renamed from: b */
    final TextInputLayout f38534b;
    @NonNull

    /* renamed from: c */
    private final FrameLayout f38535c;
    @NonNull

    /* renamed from: d */
    private final CheckableImageButton f38536d;

    /* renamed from: f */
    private ColorStateList f38537f;

    /* renamed from: g */
    private PorterDuff.Mode f38538g;

    /* renamed from: h */
    private View.OnLongClickListener f38539h;
    @NonNull

    /* renamed from: i */
    private final CheckableImageButton f38540i;

    /* renamed from: j */
    private final EndIconDelegates f38541j;

    /* renamed from: k */
    private int f38542k;

    /* renamed from: l */
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> f38543l;

    /* renamed from: m */
    private ColorStateList f38544m;

    /* renamed from: n */
    private PorterDuff.Mode f38545n;

    /* renamed from: o */
    private View.OnLongClickListener f38546o;
    @Nullable

    /* renamed from: p */
    private CharSequence f38547p;
    @NonNull

    /* renamed from: q */
    private final TextView f38548q;

    /* renamed from: r */
    private boolean f38549r;

    /* renamed from: s */
    private EditText f38550s;
    @Nullable

    /* renamed from: t */
    private final AccessibilityManager f38551t;
    @Nullable

    /* renamed from: u */
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener f38552u;

    /* renamed from: v */
    private final TextWatcher f38553v;

    /* renamed from: w */
    private final TextInputLayout.OnEditTextAttachedListener f38554w;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class EndIconDelegates {

        /* renamed from: a */
        private final SparseArray<EndIconDelegate> f38558a = new SparseArray<>();

        /* renamed from: b */
        private final EndCompoundLayout f38559b;

        /* renamed from: c */
        private final int f38560c;

        /* renamed from: d */
        private final int f38561d;

        EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.f38559b = endCompoundLayout;
            this.f38560c = tintTypedArray.getResourceId(C16310R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f38561d = tintTypedArray.getResourceId(C16310R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        /* renamed from: b */
        private EndIconDelegate m70630b(int i) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new DropdownMenuEndIconDelegate(this.f38559b);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i);
                        }
                        return new ClearTextEndIconDelegate(this.f38559b);
                    }
                    return new PasswordToggleEndIconDelegate(this.f38559b, this.f38561d);
                }
                return new NoEndIconDelegate(this.f38559b);
            }
            return new CustomEndIconDelegate(this.f38559b);
        }

        /* renamed from: c */
        EndIconDelegate m70629c(int i) {
            EndIconDelegate endIconDelegate = this.f38558a.get(i);
            if (endIconDelegate == null) {
                EndIconDelegate m70630b = m70630b(i);
                this.f38558a.append(i, m70630b);
                return m70630b;
            }
            return endIconDelegate;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f38542k = 0;
        this.f38543l = new LinkedHashSet<>();
        this.f38553v = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.m70655o().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EndCompoundLayout.this.m70655o().mo70556a(charSequence, i, i2, i3);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.f38550s == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.f38550s != null) {
                    EndCompoundLayout.this.f38550s.removeTextChangedListener(EndCompoundLayout.this.f38553v);
                    if (EndCompoundLayout.this.f38550s.getOnFocusChangeListener() == EndCompoundLayout.this.m70655o().mo70628d()) {
                        EndCompoundLayout.this.f38550s.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.f38550s = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.f38550s != null) {
                    EndCompoundLayout.this.f38550s.addTextChangedListener(EndCompoundLayout.this.f38553v);
                }
                EndCompoundLayout.this.m70655o().onEditTextAttached(EndCompoundLayout.this.f38550s);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.m70668h0(endCompoundLayout.m70655o());
            }
        };
        this.f38554w = onEditTextAttachedListener;
        this.f38551t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f38534b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f38535c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m70663k = m70663k(this, from, C16310R.C16313id.text_input_error_icon);
        this.f38536d = m70663k;
        CheckableImageButton m70663k2 = m70663k(frameLayout, from, C16310R.C16313id.text_input_end_icon);
        this.f38540i = m70663k2;
        this.f38541j = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f38548q = appCompatTextView;
        m70708B(tintTypedArray);
        m70709A(tintTypedArray);
        m70707C(tintTypedArray);
        frameLayout.addView(m70663k2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(m70663k);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.m70669h();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.m70695O();
            }
        });
    }

    /* renamed from: A */
    private void m70709A(TintTypedArray tintTypedArray) {
        int i = C16310R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!tintTypedArray.hasValue(i)) {
            int i2 = C16310R.styleable.TextInputLayout_endIconTint;
            if (tintTypedArray.hasValue(i2)) {
                this.f38544m = MaterialResources.getColorStateList(getContext(), tintTypedArray, i2);
            }
            int i3 = C16310R.styleable.TextInputLayout_endIconTintMode;
            if (tintTypedArray.hasValue(i3)) {
                this.f38545n = ViewUtils.parseTintMode(tintTypedArray.getInt(i3, -1), null);
            }
        }
        int i4 = C16310R.styleable.TextInputLayout_endIconMode;
        if (tintTypedArray.hasValue(i4)) {
            m70688V(tintTypedArray.getInt(i4, 0));
            int i5 = C16310R.styleable.TextInputLayout_endIconContentDescription;
            if (tintTypedArray.hasValue(i5)) {
                m70691S(tintTypedArray.getText(i5));
            }
            m70693Q(tintTypedArray.getBoolean(C16310R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(i)) {
            int i6 = C16310R.styleable.TextInputLayout_passwordToggleTint;
            if (tintTypedArray.hasValue(i6)) {
                this.f38544m = MaterialResources.getColorStateList(getContext(), tintTypedArray, i6);
            }
            int i7 = C16310R.styleable.TextInputLayout_passwordToggleTintMode;
            if (tintTypedArray.hasValue(i7)) {
                this.f38545n = ViewUtils.parseTintMode(tintTypedArray.getInt(i7, -1), null);
            }
            m70688V(tintTypedArray.getBoolean(i, false) ? 1 : 0);
            m70691S(tintTypedArray.getText(C16310R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
    }

    /* renamed from: B */
    private void m70708B(TintTypedArray tintTypedArray) {
        int i = C16310R.styleable.TextInputLayout_errorIconTint;
        if (tintTypedArray.hasValue(i)) {
            this.f38537f = MaterialResources.getColorStateList(getContext(), tintTypedArray, i);
        }
        int i2 = C16310R.styleable.TextInputLayout_errorIconTintMode;
        if (tintTypedArray.hasValue(i2)) {
            this.f38538g = ViewUtils.parseTintMode(tintTypedArray.getInt(i2, -1), null);
        }
        int i3 = C16310R.styleable.TextInputLayout_errorIconDrawable;
        if (tintTypedArray.hasValue(i3)) {
            m70678c0(tintTypedArray.getDrawable(i3));
        }
        this.f38536d.setContentDescription(getResources().getText(C16310R.C16316string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.f38536d, 2);
        this.f38536d.setClickable(false);
        this.f38536d.setPressable(false);
        this.f38536d.setFocusable(false);
    }

    /* renamed from: C */
    private void m70707C(TintTypedArray tintTypedArray) {
        this.f38548q.setVisibility(8);
        this.f38548q.setId(C16310R.C16313id.textinput_suffix_text);
        this.f38548q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.f38548q, 1);
        m70650q0(tintTypedArray.getResourceId(C16310R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i = C16310R.styleable.TextInputLayout_suffixTextColor;
        if (tintTypedArray.hasValue(i)) {
            m70648r0(tintTypedArray.getColorStateList(i));
        }
        m70652p0(tintTypedArray.getText(C16310R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public void m70695O() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f38552u;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.f38551t) != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m70669h() {
        if (this.f38552u != null && this.f38551t != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.f38551t, this.f38552u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m70668h0(EndIconDelegate endIconDelegate) {
        if (this.f38550s == null) {
            return;
        }
        if (endIconDelegate.mo70628d() != null) {
            this.f38550s.setOnFocusChangeListener(endIconDelegate.mo70628d());
        }
        if (endIconDelegate.mo70627f() != null) {
            this.f38540i.setOnFocusChangeListener(endIconDelegate.mo70627f());
        }
    }

    /* renamed from: k */
    private CheckableImageButton m70663k(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C16310R.C16315layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        IconHelper.m70617d(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: l */
    private void m70661l(int i) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.f38543l.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.f38534b, i);
        }
    }

    /* renamed from: s0 */
    private void m70646s0(@NonNull EndIconDelegate endIconDelegate) {
        endIconDelegate.mo70550n();
        this.f38552u = endIconDelegate.getTouchExplorationStateChangeListener();
        m70669h();
    }

    /* renamed from: t */
    private int m70645t(EndIconDelegate endIconDelegate) {
        int i = this.f38541j.f38560c;
        if (i == 0) {
            return endIconDelegate.mo70554c();
        }
        return i;
    }

    /* renamed from: t0 */
    private void m70644t0(@NonNull EndIconDelegate endIconDelegate) {
        m70695O();
        this.f38552u = null;
        endIconDelegate.mo70549p();
    }

    /* renamed from: u0 */
    private void m70642u0(boolean z) {
        if (z && m70653p() != null) {
            Drawable mutate = DrawableCompat.wrap(m70653p()).mutate();
            DrawableCompat.setTint(mutate, this.f38534b.getErrorCurrentTextColors());
            this.f38540i.setImageDrawable(mutate);
            return;
        }
        IconHelper.m70620a(this.f38534b, this.f38540i, this.f38544m, this.f38545n);
    }

    /* renamed from: w0 */
    private void m70638w0() {
        int i;
        boolean z;
        boolean z2;
        FrameLayout frameLayout = this.f38535c;
        int i2 = 8;
        if (this.f38540i.getVisibility() == 0 && !m70703G()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.f38547p != null && !this.f38549r) {
            z = false;
        } else {
            z = true;
        }
        if (!m70704F() && !m70703G() && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    /* renamed from: x0 */
    private void m70636x0() {
        boolean z;
        int i = 0;
        if (m70647s() != null && this.f38534b.isErrorEnabled() && this.f38534b.m70498U()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.f38536d;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m70638w0();
        m70634y0();
        if (!m70633z()) {
            this.f38534b.m70483e0();
        }
    }

    /* renamed from: z0 */
    private void m70632z0() {
        int i;
        int visibility = this.f38548q.getVisibility();
        boolean z = false;
        if (this.f38547p != null && !this.f38549r) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            EndIconDelegate m70655o = m70655o();
            if (i == 0) {
                z = true;
            }
            m70655o.mo70623l(z);
        }
        m70638w0();
        this.f38548q.setVisibility(i);
        this.f38534b.m70483e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m70706D() {
        return this.f38540i.isCheckable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean m70705E() {
        if (m70633z() && this.f38540i.isChecked()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m70704F() {
        if (this.f38535c.getVisibility() == 0 && this.f38540i.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m70703G() {
        if (this.f38536d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean m70702H() {
        if (this.f38542k == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m70701I(boolean z) {
        this.f38549r = z;
        m70632z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m70700J() {
        m70636x0();
        m70698L();
        m70699K();
        if (m70655o().mo70621o()) {
            m70642u0(this.f38534b.m70498U());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m70699K() {
        IconHelper.m70618c(this.f38534b, this.f38540i, this.f38544m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m70698L() {
        IconHelper.m70618c(this.f38534b, this.f38536d, this.f38537f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m70697M(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        EndIconDelegate m70655o = m70655o();
        boolean z3 = true;
        if (m70655o.mo70552j() && (isChecked = this.f38540i.isChecked()) != m70655o.mo70551k()) {
            this.f38540i.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if (m70655o.mo70625h() && (isActivated = this.f38540i.isActivated()) != m70655o.mo70624i()) {
            m70694P(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            m70699K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m70696N(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f38543l.remove(onEndIconChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m70694P(boolean z) {
        this.f38540i.setActivated(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m70693Q(boolean z) {
        this.f38540i.setCheckable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m70692R(@StringRes int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        m70691S(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m70691S(@Nullable CharSequence charSequence) {
        if (m70657n() != charSequence) {
            this.f38540i.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m70690T(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        m70689U(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m70689U(@Nullable Drawable drawable) {
        this.f38540i.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.m70620a(this.f38534b, this.f38540i, this.f38544m, this.f38545n);
            m70699K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m70688V(int i) {
        boolean z;
        if (this.f38542k == i) {
            return;
        }
        m70644t0(m70655o());
        int i2 = this.f38542k;
        this.f38542k = i;
        m70661l(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        m70682a0(z);
        EndIconDelegate m70655o = m70655o();
        m70690T(m70645t(m70655o));
        m70692R(m70655o.mo70555b());
        m70693Q(m70655o.mo70552j());
        if (m70655o.mo70626g(this.f38534b.getBoxBackgroundMode())) {
            m70646s0(m70655o);
            m70687W(m70655o.mo70553e());
            EditText editText = this.f38550s;
            if (editText != null) {
                m70655o.onEditTextAttached(editText);
                m70668h0(m70655o);
            }
            IconHelper.m70620a(this.f38534b, this.f38540i, this.f38544m, this.f38545n);
            m70697M(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f38534b.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m70687W(@Nullable View.OnClickListener onClickListener) {
        IconHelper.m70615f(this.f38540i, onClickListener, this.f38546o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m70686X(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f38546o = onLongClickListener;
        IconHelper.m70614g(this.f38540i, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m70685Y(@Nullable ColorStateList colorStateList) {
        if (this.f38544m != colorStateList) {
            this.f38544m = colorStateList;
            IconHelper.m70620a(this.f38534b, this.f38540i, colorStateList, this.f38545n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m70684Z(@Nullable PorterDuff.Mode mode) {
        if (this.f38545n != mode) {
            this.f38545n = mode;
            IconHelper.m70620a(this.f38534b, this.f38540i, this.f38544m, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m70682a0(boolean z) {
        int i;
        if (m70704F() != z) {
            CheckableImageButton checkableImageButton = this.f38540i;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m70638w0();
            m70634y0();
            this.f38534b.m70483e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m70680b0(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        m70678c0(drawable);
        m70698L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m70678c0(@Nullable Drawable drawable) {
        this.f38536d.setImageDrawable(drawable);
        m70636x0();
        IconHelper.m70620a(this.f38534b, this.f38536d, this.f38537f, this.f38538g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m70676d0(@Nullable View.OnClickListener onClickListener) {
        IconHelper.m70615f(this.f38536d, onClickListener, this.f38539h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m70674e0(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f38539h = onLongClickListener;
        IconHelper.m70614g(this.f38536d, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m70672f0(@Nullable ColorStateList colorStateList) {
        if (this.f38537f != colorStateList) {
            this.f38537f = colorStateList;
            IconHelper.m70620a(this.f38534b, this.f38536d, colorStateList, this.f38538g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m70671g(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f38543l.add(onEndIconChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m70670g0(@Nullable PorterDuff.Mode mode) {
        if (this.f38538g != mode) {
            this.f38538g = mode;
            IconHelper.m70620a(this.f38534b, this.f38536d, this.f38537f, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m70667i() {
        this.f38540i.performClick();
        this.f38540i.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void m70666i0(@StringRes int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        m70664j0(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m70665j() {
        this.f38543l.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void m70664j0(@Nullable CharSequence charSequence) {
        this.f38540i.setContentDescription(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void m70662k0(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        m70660l0(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void m70660l0(@Nullable Drawable drawable) {
        this.f38540i.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public CheckableImageButton m70659m() {
        if (m70703G()) {
            return this.f38536d;
        }
        if (m70633z() && m70704F()) {
            return this.f38540i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void m70658m0(boolean z) {
        if (z && this.f38542k != 1) {
            m70688V(1);
        } else if (!z) {
            m70688V(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: n */
    public CharSequence m70657n() {
        return this.f38540i.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void m70656n0(@Nullable ColorStateList colorStateList) {
        this.f38544m = colorStateList;
        IconHelper.m70620a(this.f38534b, this.f38540i, colorStateList, this.f38545n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public EndIconDelegate m70655o() {
        return this.f38541j.m70629c(this.f38542k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void m70654o0(@Nullable PorterDuff.Mode mode) {
        this.f38545n = mode;
        IconHelper.m70620a(this.f38534b, this.f38540i, this.f38544m, mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: p */
    public Drawable m70653p() {
        return this.f38540i.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void m70652p0(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f38547p = charSequence2;
        this.f38548q.setText(charSequence);
        m70632z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m70651q() {
        return this.f38542k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m70650q0(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f38548q, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public CheckableImageButton m70649r() {
        return this.f38540i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void m70648r0(@NonNull ColorStateList colorStateList) {
        this.f38548q.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public Drawable m70647s() {
        return this.f38536d.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: u */
    public CharSequence m70643u() {
        return this.f38540i.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: v */
    public Drawable m70641v() {
        return this.f38540i.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void m70640v0(boolean z) {
        if (this.f38542k == 1) {
            this.f38540i.performClick();
            if (z) {
                this.f38540i.jumpDrawablesToCurrentState();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: w */
    public CharSequence m70639w() {
        return this.f38547p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: x */
    public ColorStateList m70637x() {
        return this.f38548q.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public TextView m70635y() {
        return this.f38548q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void m70634y0() {
        int i;
        if (this.f38534b.f38650f == null) {
            return;
        }
        if (!m70704F() && !m70703G()) {
            i = ViewCompat.getPaddingEnd(this.f38534b.f38650f);
        } else {
            i = 0;
        }
        ViewCompat.setPaddingRelative(this.f38548q, getContext().getResources().getDimensionPixelSize(C16310R.dimen.material_input_text_to_prefix_suffix_padding), this.f38534b.f38650f.getPaddingTop(), i, this.f38534b.f38650f.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m70633z() {
        if (this.f38542k != 0) {
            return true;
        }
        return false;
    }
}
