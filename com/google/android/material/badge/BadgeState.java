package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.C16310R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class BadgeState {

    /* renamed from: a */
    private final State f36692a;

    /* renamed from: b */
    private final State f36693b;

    /* renamed from: c */
    final float f36694c;

    /* renamed from: d */
    final float f36695d;

    /* renamed from: e */
    final float f36696e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeState(Context context, @XmlRes int i, @AttrRes int i2, @StyleRes int i3, @Nullable State state) {
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        State state2 = new State();
        this.f36693b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.f36697b = i;
        }
        TypedArray m72134b = m72134b(context, state.f36697b, i2, i3);
        Resources resources = context.getResources();
        this.f36694c = m72134b.getDimensionPixelSize(C16310R.styleable.Badge_badgeRadius, resources.getDimensionPixelSize(C16310R.dimen.mtrl_badge_radius));
        this.f36696e = m72134b.getDimensionPixelSize(C16310R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(C16310R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f36695d = m72134b.getDimensionPixelSize(C16310R.styleable.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(C16310R.dimen.mtrl_badge_with_text_radius));
        state2.f36700f = state.f36700f == -2 ? 255 : state.f36700f;
        if (state.f36704j != null) {
            charSequence = state.f36704j;
        } else {
            charSequence = context.getString(C16310R.C16316string.mtrl_badge_numberless_content_description);
        }
        state2.f36704j = charSequence;
        if (state.f36705k != 0) {
            i4 = state.f36705k;
        } else {
            i4 = C16310R.plurals.mtrl_badge_content_description;
        }
        state2.f36705k = i4;
        if (state.f36706l != 0) {
            i5 = state.f36706l;
        } else {
            i5 = C16310R.C16316string.mtrl_exceed_max_badge_number_content_description;
        }
        state2.f36706l = i5;
        state2.f36708n = Boolean.valueOf(state.f36708n == null || state.f36708n.booleanValue());
        if (state.f36702h != -2) {
            i6 = state.f36702h;
        } else {
            i6 = m72134b.getInt(C16310R.styleable.Badge_maxCharacterCount, 4);
        }
        state2.f36702h = i6;
        if (state.f36701g != -2) {
            state2.f36701g = state.f36701g;
        } else {
            int i7 = C16310R.styleable.Badge_number;
            if (m72134b.hasValue(i7)) {
                state2.f36701g = m72134b.getInt(i7, 0);
            } else {
                state2.f36701g = -1;
            }
        }
        if (state.f36698c != null) {
            intValue = state.f36698c.intValue();
        } else {
            intValue = m72114v(context, m72134b, C16310R.styleable.Badge_backgroundColor);
        }
        state2.f36698c = Integer.valueOf(intValue);
        if (state.f36699d != null) {
            state2.f36699d = state.f36699d;
        } else {
            int i8 = C16310R.styleable.Badge_badgeTextColor;
            if (m72134b.hasValue(i8)) {
                state2.f36699d = Integer.valueOf(m72114v(context, m72134b, i8));
            } else {
                state2.f36699d = Integer.valueOf(new TextAppearance(context, C16310R.C16317style.TextAppearance_MaterialComponents_Badge).getTextColor().getDefaultColor());
            }
        }
        if (state.f36707m != null) {
            intValue2 = state.f36707m.intValue();
        } else {
            intValue2 = m72134b.getInt(C16310R.styleable.Badge_badgeGravity, 8388661);
        }
        state2.f36707m = Integer.valueOf(intValue2);
        if (state.f36709o != null) {
            intValue3 = state.f36709o.intValue();
        } else {
            intValue3 = m72134b.getDimensionPixelOffset(C16310R.styleable.Badge_horizontalOffset, 0);
        }
        state2.f36709o = Integer.valueOf(intValue3);
        if (state.f36710p != null) {
            intValue4 = state.f36710p.intValue();
        } else {
            intValue4 = m72134b.getDimensionPixelOffset(C16310R.styleable.Badge_verticalOffset, 0);
        }
        state2.f36710p = Integer.valueOf(intValue4);
        if (state.f36711q != null) {
            intValue5 = state.f36711q.intValue();
        } else {
            intValue5 = m72134b.getDimensionPixelOffset(C16310R.styleable.Badge_horizontalOffsetWithText, state2.f36709o.intValue());
        }
        state2.f36711q = Integer.valueOf(intValue5);
        if (state.f36712r != null) {
            intValue6 = state.f36712r.intValue();
        } else {
            intValue6 = m72134b.getDimensionPixelOffset(C16310R.styleable.Badge_verticalOffsetWithText, state2.f36710p.intValue());
        }
        state2.f36712r = Integer.valueOf(intValue6);
        state2.f36713s = Integer.valueOf(state.f36713s == null ? 0 : state.f36713s.intValue());
        state2.f36714t = Integer.valueOf(state.f36714t != null ? state.f36714t.intValue() : 0);
        m72134b.recycle();
        if (state.f36703i == null) {
            state2.f36703i = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f36703i = state.f36703i;
        }
        this.f36692a = state;
    }

    /* renamed from: b */
    private TypedArray m72134b(Context context, @XmlRes int i, @AttrRes int i2, @StyleRes int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i, "badge");
            i4 = parseDrawableXml.getStyleAttribute();
            attributeSet = parseDrawableXml;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C16310R.styleable.Badge, i2, i5, new int[0]);
    }

    /* renamed from: v */
    private static int m72114v(Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        return MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m72148A(int i) {
        this.f36692a.f36707m = Integer.valueOf(i);
        this.f36693b.f36707m = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m72147B(@ColorInt int i) {
        this.f36692a.f36699d = Integer.valueOf(i);
        this.f36693b.f36699d = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m72146C(@StringRes int i) {
        this.f36692a.f36706l = i;
        this.f36693b.f36706l = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m72145D(CharSequence charSequence) {
        this.f36692a.f36704j = charSequence;
        this.f36693b.f36704j = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m72144E(@PluralsRes int i) {
        this.f36692a.f36705k = i;
        this.f36693b.f36705k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m72143F(@Dimension(unit = 1) int i) {
        this.f36692a.f36711q = Integer.valueOf(i);
        this.f36693b.f36711q = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m72142G(@Dimension(unit = 1) int i) {
        this.f36692a.f36709o = Integer.valueOf(i);
        this.f36693b.f36709o = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m72141H(int i) {
        this.f36692a.f36702h = i;
        this.f36693b.f36702h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m72140I(int i) {
        this.f36692a.f36701g = i;
        this.f36693b.f36701g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m72139J(Locale locale) {
        this.f36692a.f36703i = locale;
        this.f36693b.f36703i = locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m72138K(@Dimension(unit = 1) int i) {
        this.f36692a.f36712r = Integer.valueOf(i);
        this.f36693b.f36712r = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m72137L(@Dimension(unit = 1) int i) {
        this.f36692a.f36710p = Integer.valueOf(i);
        this.f36693b.f36710p = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m72136M(boolean z) {
        this.f36692a.f36708n = Boolean.valueOf(z);
        this.f36693b.f36708n = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m72135a() {
        m72140I(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    /* renamed from: c */
    public int m72133c() {
        return this.f36693b.f36713s.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    /* renamed from: d */
    public int m72132d() {
        return this.f36693b.f36714t.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m72131e() {
        return this.f36693b.f36700f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: f */
    public int m72130f() {
        return this.f36693b.f36698c.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m72129g() {
        return this.f36693b.f36707m.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: h */
    public int m72128h() {
        return this.f36693b.f36699d.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StringRes
    /* renamed from: i */
    public int m72127i() {
        return this.f36693b.f36706l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public CharSequence m72126j() {
        return this.f36693b.f36704j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @PluralsRes
    /* renamed from: k */
    public int m72125k() {
        return this.f36693b.f36705k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    /* renamed from: l */
    public int m72124l() {
        return this.f36693b.f36711q.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    /* renamed from: m */
    public int m72123m() {
        return this.f36693b.f36709o.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m72122n() {
        return this.f36693b.f36702h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m72121o() {
        return this.f36693b.f36701g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public Locale m72120p() {
        return this.f36693b.f36703i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public State m72119q() {
        return this.f36692a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    /* renamed from: r */
    public int m72118r() {
        return this.f36693b.f36712r.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    /* renamed from: s */
    public int m72117s() {
        return this.f36693b.f36710p.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m72116t() {
        if (this.f36693b.f36701g != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m72115u() {
        return this.f36693b.f36708n.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m72113w(@Dimension(unit = 1) int i) {
        this.f36692a.f36713s = Integer.valueOf(i);
        this.f36693b.f36713s = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m72112x(@Dimension(unit = 1) int i) {
        this.f36692a.f36714t = Integer.valueOf(i);
        this.f36693b.f36714t = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m72111y(int i) {
        this.f36692a.f36700f = i;
        this.f36693b.f36700f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m72110z(@ColorInt int i) {
        this.f36692a.f36698c = Integer.valueOf(i);
        this.f36693b.f36698c = Integer.valueOf(i);
    }

    /* loaded from: classes5.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i) {
                return new State[i];
            }
        };
        @XmlRes

        /* renamed from: b */
        private int f36697b;
        @ColorInt

        /* renamed from: c */
        private Integer f36698c;
        @ColorInt

        /* renamed from: d */
        private Integer f36699d;

        /* renamed from: f */
        private int f36700f;

        /* renamed from: g */
        private int f36701g;

        /* renamed from: h */
        private int f36702h;

        /* renamed from: i */
        private Locale f36703i;
        @Nullable

        /* renamed from: j */
        private CharSequence f36704j;
        @PluralsRes

        /* renamed from: k */
        private int f36705k;
        @StringRes

        /* renamed from: l */
        private int f36706l;

        /* renamed from: m */
        private Integer f36707m;

        /* renamed from: n */
        private Boolean f36708n;
        @Dimension(unit = 1)

        /* renamed from: o */
        private Integer f36709o;
        @Dimension(unit = 1)

        /* renamed from: p */
        private Integer f36710p;
        @Dimension(unit = 1)

        /* renamed from: q */
        private Integer f36711q;
        @Dimension(unit = 1)

        /* renamed from: r */
        private Integer f36712r;
        @Dimension(unit = 1)

        /* renamed from: s */
        private Integer f36713s;
        @Dimension(unit = 1)

        /* renamed from: t */
        private Integer f36714t;

        public State() {
            this.f36700f = 255;
            this.f36701g = -2;
            this.f36702h = -2;
            this.f36708n = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            String charSequence;
            parcel.writeInt(this.f36697b);
            parcel.writeSerializable(this.f36698c);
            parcel.writeSerializable(this.f36699d);
            parcel.writeInt(this.f36700f);
            parcel.writeInt(this.f36701g);
            parcel.writeInt(this.f36702h);
            CharSequence charSequence2 = this.f36704j;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.f36705k);
            parcel.writeSerializable(this.f36707m);
            parcel.writeSerializable(this.f36709o);
            parcel.writeSerializable(this.f36710p);
            parcel.writeSerializable(this.f36711q);
            parcel.writeSerializable(this.f36712r);
            parcel.writeSerializable(this.f36713s);
            parcel.writeSerializable(this.f36714t);
            parcel.writeSerializable(this.f36708n);
            parcel.writeSerializable(this.f36703i);
        }

        State(@NonNull Parcel parcel) {
            this.f36700f = 255;
            this.f36701g = -2;
            this.f36702h = -2;
            this.f36708n = Boolean.TRUE;
            this.f36697b = parcel.readInt();
            this.f36698c = (Integer) parcel.readSerializable();
            this.f36699d = (Integer) parcel.readSerializable();
            this.f36700f = parcel.readInt();
            this.f36701g = parcel.readInt();
            this.f36702h = parcel.readInt();
            this.f36704j = parcel.readString();
            this.f36705k = parcel.readInt();
            this.f36707m = (Integer) parcel.readSerializable();
            this.f36709o = (Integer) parcel.readSerializable();
            this.f36710p = (Integer) parcel.readSerializable();
            this.f36711q = (Integer) parcel.readSerializable();
            this.f36712r = (Integer) parcel.readSerializable();
            this.f36713s = (Integer) parcel.readSerializable();
            this.f36714t = (Integer) parcel.readSerializable();
            this.f36708n = (Boolean) parcel.readSerializable();
            this.f36703i = (Locale) parcel.readSerializable();
        }
    }
}
