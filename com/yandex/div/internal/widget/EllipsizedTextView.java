package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45193i;

/* compiled from: EllipsizedTextView.kt */
@Metadata
/* loaded from: classes8.dex */
public class EllipsizedTextView extends SuperLineHeightTextView {
    @NotNull
    public static final C29797a Companion = new C29797a(null);
    @NotNull
    public static final String DEFAULT_ELLIPSIS = "…";
    public static final int NOT_SET = -1;
    @NotNull

    /* renamed from: c */
    private CharSequence f76070c;

    /* renamed from: d */
    private boolean f76071d;

    /* renamed from: f */
    private boolean f76072f;
    @Nullable

    /* renamed from: g */
    private CharSequence f76073g;
    @Nullable

    /* renamed from: h */
    private CharSequence f76074h;

    /* renamed from: i */
    private boolean f76075i;

    /* renamed from: j */
    private int f76076j;

    /* renamed from: k */
    private int f76077k;
    @Nullable

    /* renamed from: l */
    private CharSequence f76078l;

    /* renamed from: m */
    private float f76079m;

    /* renamed from: n */
    private boolean f76080n;
    @NotNull

    /* renamed from: o */
    private final AutoEllipsizeHelper f76081o;

    /* compiled from: EllipsizedTextView.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.EllipsizedTextView$a */
    /* loaded from: classes8.dex */
    public static final class C29797a {
        private C29797a() {
        }

        public /* synthetic */ C29797a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final int m36424a(CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        int availableWidth;
        Layout m36420e;
        boolean z2;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || getMaxLines() == 0 || (availableWidth = availableWidth()) <= 0) {
            return 0;
        }
        if (TextViews.m36349d(this)) {
            m36420e = m36418g(charSequence, availableWidth);
        } else {
            m36420e = m36420e(charSequence, availableWidth);
        }
        int lineCount = m36420e.getLineCount();
        float lineWidth = m36420e.getLineWidth(lineCount - 1);
        if (lineCount >= getMaxLines() && (lineCount != getMaxLines() || lineWidth > availableWidth)) {
            if (this.f76079m == -1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f76079m = m36419f(this, charSequence2, 0, 2, null).getLineWidth(0);
            }
            this.f76072f = true;
            float f = availableWidth - this.f76079m;
            int offsetForHorizontal = m36420e.getOffsetForHorizontal(getMaxLines() - 1, f);
            while (m36420e.getPrimaryHorizontal(offsetForHorizontal) > f && offsetForHorizontal > 0) {
                offsetForHorizontal--;
            }
            if (offsetForHorizontal > 0 && Character.isHighSurrogate(charSequence.charAt(offsetForHorizontal - 1))) {
                return offsetForHorizontal - 1;
            }
            return offsetForHorizontal;
        }
        this.f76072f = true;
        return charSequence.length();
    }

    /* renamed from: b */
    private final CharSequence m36423b(CharSequence charSequence) {
        boolean z;
        CharSequence charSequence2;
        int m36424a;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (m36424a = m36424a(charSequence, (charSequence2 = this.f76070c))) <= 0) {
            return null;
        }
        if (m36424a == charSequence.length()) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, m36424a);
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private final void m36422c() {
        boolean z;
        CharSequence charSequence = this.f76073g;
        if (!m36417h() && !Intrinsics.m17075f(this.f76070c, DEFAULT_ELLIPSIS)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f76073g != null || !z) {
            if (z) {
                CharSequence charSequence2 = this.f76078l;
                if (charSequence2 != null) {
                    this.f76072f = !Intrinsics.m17075f(charSequence2, charSequence);
                } else {
                    charSequence2 = null;
                }
                setEllipsizedText(charSequence2);
            } else {
                setEllipsizedText(m36423b(this.f76078l));
            }
        }
        this.f76080n = false;
    }

    /* renamed from: d */
    private final void m36421d() {
        this.f76079m = -1.0f;
        this.f76072f = false;
    }

    /* renamed from: e */
    private final Layout m36420e(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, getPaint(), i, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    /* renamed from: f */
    static /* synthetic */ Layout m36419f(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = Integer.MAX_VALUE;
            }
            return ellipsizedTextView.m36420e(charSequence, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layoutText");
    }

    @RequiresApi(23)
    /* renamed from: g */
    private final Layout m36418g(CharSequence charSequence, int i) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(text, 0, text.length, paint, textWidth)");
        StaticLayout build = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder\n            .set…ncy)\n            .build()");
        return build;
    }

    /* renamed from: h */
    private final boolean m36417h() {
        if (getMaxLines() >= 0 && getMaxLines() != Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final void m36416i(CharSequence charSequence) {
        if (m36417h()) {
            super.setEllipsize(null);
        } else if (Intrinsics.m17075f(charSequence, DEFAULT_ELLIPSIS)) {
            super.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            super.setEllipsize(null);
            m36415j();
            m36421d();
        }
        requestLayout();
    }

    /* renamed from: j */
    private final void m36415j() {
        this.f76080n = true;
    }

    /* renamed from: k */
    private final void m36414k(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            m36415j();
        }
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.f76073g = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.f76075i = true;
        super.setText(charSequence);
        this.f76075i = false;
    }

    protected final int availableWidth() {
        return (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
    }

    public final boolean getAutoEllipsize() {
        return this.f76071d;
    }

    @Nullable
    public final CharSequence getDisplayText() {
        return this.f76074h;
    }

    @NotNull
    public final CharSequence getEllipsis() {
        return this.f76070c;
    }

    @Nullable
    public final CharSequence getEllipsizedText() {
        return this.f76073g;
    }

    protected final int getLastMeasuredHeight() {
        return this.f76077k;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @NotNull
    public CharSequence getText() {
        CharSequence charSequence = this.f76078l;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    protected final boolean isInternalTextChange() {
        return this.f76075i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f76081o.m36378d();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f76081o.m36377e();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m36414k(getMeasuredWidth(), getMeasuredHeight(), this.f76076j, this.f76077k);
        if (this.f76080n) {
            m36422c();
            CharSequence charSequence = this.f76073g;
            if (charSequence != null) {
                if (!this.f76072f) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    super.onMeasure(i, i2);
                }
            }
        }
        this.f76076j = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m36414k(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f76075i) {
            return;
        }
        this.f76078l = charSequence;
        requestLayout();
        m36415j();
    }

    public final void setAutoEllipsize(boolean z) {
        this.f76071d = z;
        this.f76081o.m36375g(z);
    }

    public final void setEllipsis(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m36416i(value);
        this.f76070c = value;
    }

    protected final void setInternalTextChange(boolean z) {
        this.f76075i = z;
    }

    protected final void setLastMeasuredHeight(int i) {
        this.f76077k = i;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i == getMaxLines()) {
            return;
        }
        super.setMaxLines(i);
        m36416i(this.f76070c);
        m36415j();
        m36421d();
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        this.f76074h = charSequence;
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EllipsizedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = DEFAULT_ELLIPSIS;
        this.f76070c = DEFAULT_ELLIPSIS;
        this.f76076j = -1;
        this.f76077k = -1;
        this.f76079m = -1.0f;
        this.f76081o = new AutoEllipsizeHelper(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45193i.EllipsizedTextView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
            try {
                CharSequence text = obtainStyledAttributes.getText(C45193i.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        m36416i(this.f76070c);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
    }
}
