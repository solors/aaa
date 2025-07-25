package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class Cue implements Bundleable {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;
    @Nullable
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    @Nullable
    public final Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    @Nullable
    public final CharSequence text;
    @Nullable
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;
    public static final Cue EMPTY = new Builder().setText("").build();

    /* renamed from: b */
    private static final String f34715b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f34716c = Util.intToStringMaxRadix(1);

    /* renamed from: d */
    private static final String f34717d = Util.intToStringMaxRadix(2);

    /* renamed from: f */
    private static final String f34718f = Util.intToStringMaxRadix(3);

    /* renamed from: g */
    private static final String f34719g = Util.intToStringMaxRadix(4);

    /* renamed from: h */
    private static final String f34720h = Util.intToStringMaxRadix(5);

    /* renamed from: i */
    private static final String f34721i = Util.intToStringMaxRadix(6);

    /* renamed from: j */
    private static final String f34722j = Util.intToStringMaxRadix(7);

    /* renamed from: k */
    private static final String f34723k = Util.intToStringMaxRadix(8);

    /* renamed from: l */
    private static final String f34724l = Util.intToStringMaxRadix(9);

    /* renamed from: m */
    private static final String f34725m = Util.intToStringMaxRadix(10);

    /* renamed from: n */
    private static final String f34726n = Util.intToStringMaxRadix(11);

    /* renamed from: o */
    private static final String f34727o = Util.intToStringMaxRadix(12);

    /* renamed from: p */
    private static final String f34728p = Util.intToStringMaxRadix(13);

    /* renamed from: q */
    private static final String f34729q = Util.intToStringMaxRadix(14);

    /* renamed from: r */
    private static final String f34730r = Util.intToStringMaxRadix(15);

    /* renamed from: s */
    private static final String f34731s = Util.intToStringMaxRadix(16);
    public static final Bundleable.Creator<Cue> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.a
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Cue.m73580a(bundle);
        }
    };

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface AnchorType {
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private CharSequence f34732a;
        @Nullable

        /* renamed from: b */
        private Bitmap f34733b;
        @Nullable

        /* renamed from: c */
        private Layout.Alignment f34734c;
        @Nullable

        /* renamed from: d */
        private Layout.Alignment f34735d;

        /* renamed from: e */
        private float f34736e;

        /* renamed from: f */
        private int f34737f;

        /* renamed from: g */
        private int f34738g;

        /* renamed from: h */
        private float f34739h;

        /* renamed from: i */
        private int f34740i;

        /* renamed from: j */
        private int f34741j;

        /* renamed from: k */
        private float f34742k;

        /* renamed from: l */
        private float f34743l;

        /* renamed from: m */
        private float f34744m;

        /* renamed from: n */
        private boolean f34745n;
        @ColorInt

        /* renamed from: o */
        private int f34746o;

        /* renamed from: p */
        private int f34747p;

        /* renamed from: q */
        private float f34748q;

        public Cue build() {
            return new Cue(this.f34732a, this.f34734c, this.f34735d, this.f34733b, this.f34736e, this.f34737f, this.f34738g, this.f34739h, this.f34740i, this.f34741j, this.f34742k, this.f34743l, this.f34744m, this.f34745n, this.f34746o, this.f34747p, this.f34748q);
        }

        @CanIgnoreReturnValue
        public Builder clearWindowColor() {
            this.f34745n = false;
            return this;
        }

        @Nullable
        public Bitmap getBitmap() {
            return this.f34733b;
        }

        public float getBitmapHeight() {
            return this.f34744m;
        }

        public float getLine() {
            return this.f34736e;
        }

        public int getLineAnchor() {
            return this.f34738g;
        }

        public int getLineType() {
            return this.f34737f;
        }

        public float getPosition() {
            return this.f34739h;
        }

        public int getPositionAnchor() {
            return this.f34740i;
        }

        public float getSize() {
            return this.f34743l;
        }

        @Nullable
        public CharSequence getText() {
            return this.f34732a;
        }

        @Nullable
        public Layout.Alignment getTextAlignment() {
            return this.f34734c;
        }

        public float getTextSize() {
            return this.f34742k;
        }

        public int getTextSizeType() {
            return this.f34741j;
        }

        public int getVerticalType() {
            return this.f34747p;
        }

        @ColorInt
        public int getWindowColor() {
            return this.f34746o;
        }

        public boolean isWindowColorSet() {
            return this.f34745n;
        }

        @CanIgnoreReturnValue
        public Builder setBitmap(Bitmap bitmap) {
            this.f34733b = bitmap;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBitmapHeight(float f) {
            this.f34744m = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLine(float f, int i) {
            this.f34736e = f;
            this.f34737f = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLineAnchor(int i) {
            this.f34738g = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMultiRowAlignment(@Nullable Layout.Alignment alignment) {
            this.f34735d = alignment;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPosition(float f) {
            this.f34739h = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPositionAnchor(int i) {
            this.f34740i = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setShearDegrees(float f) {
            this.f34748q = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSize(float f) {
            this.f34743l = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setText(CharSequence charSequence) {
            this.f34732a = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTextAlignment(@Nullable Layout.Alignment alignment) {
            this.f34734c = alignment;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTextSize(float f, int i) {
            this.f34742k = f;
            this.f34741j = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVerticalType(int i) {
            this.f34747p = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWindowColor(@ColorInt int i) {
            this.f34746o = i;
            this.f34745n = true;
            return this;
        }

        public Builder() {
            this.f34732a = null;
            this.f34733b = null;
            this.f34734c = null;
            this.f34735d = null;
            this.f34736e = -3.4028235E38f;
            this.f34737f = Integer.MIN_VALUE;
            this.f34738g = Integer.MIN_VALUE;
            this.f34739h = -3.4028235E38f;
            this.f34740i = Integer.MIN_VALUE;
            this.f34741j = Integer.MIN_VALUE;
            this.f34742k = -3.4028235E38f;
            this.f34743l = -3.4028235E38f;
            this.f34744m = -3.4028235E38f;
            this.f34745n = false;
            this.f34746o = ViewCompat.MEASURED_STATE_MASK;
            this.f34747p = Integer.MIN_VALUE;
        }

        private Builder(Cue cue) {
            this.f34732a = cue.text;
            this.f34733b = cue.bitmap;
            this.f34734c = cue.textAlignment;
            this.f34735d = cue.multiRowAlignment;
            this.f34736e = cue.line;
            this.f34737f = cue.lineType;
            this.f34738g = cue.lineAnchor;
            this.f34739h = cue.position;
            this.f34740i = cue.positionAnchor;
            this.f34741j = cue.textSizeType;
            this.f34742k = cue.textSize;
            this.f34743l = cue.size;
            this.f34744m = cue.bitmapHeight;
            this.f34745n = cue.windowColorSet;
            this.f34746o = cue.windowColor;
            this.f34747p = cue.verticalType;
            this.f34748q = cue.shearDegrees;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface VerticalType {
    }

    /* renamed from: a */
    public static /* synthetic */ Cue m73580a(Bundle bundle) {
        return m73579b(bundle);
    }

    /* renamed from: b */
    public static final Cue m73579b(Bundle bundle) {
        Builder builder = new Builder();
        CharSequence charSequence = bundle.getCharSequence(f34715b);
        if (charSequence != null) {
            builder.setText(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f34716c);
        if (alignment != null) {
            builder.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f34717d);
        if (alignment2 != null) {
            builder.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f34718f);
        if (bitmap != null) {
            builder.setBitmap(bitmap);
        }
        String str = f34719g;
        if (bundle.containsKey(str)) {
            String str2 = f34720h;
            if (bundle.containsKey(str2)) {
                builder.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f34721i;
        if (bundle.containsKey(str3)) {
            builder.setLineAnchor(bundle.getInt(str3));
        }
        String str4 = f34722j;
        if (bundle.containsKey(str4)) {
            builder.setPosition(bundle.getFloat(str4));
        }
        String str5 = f34723k;
        if (bundle.containsKey(str5)) {
            builder.setPositionAnchor(bundle.getInt(str5));
        }
        String str6 = f34725m;
        if (bundle.containsKey(str6)) {
            String str7 = f34724l;
            if (bundle.containsKey(str7)) {
                builder.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f34726n;
        if (bundle.containsKey(str8)) {
            builder.setSize(bundle.getFloat(str8));
        }
        String str9 = f34727o;
        if (bundle.containsKey(str9)) {
            builder.setBitmapHeight(bundle.getFloat(str9));
        }
        String str10 = f34728p;
        if (bundle.containsKey(str10)) {
            builder.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f34729q, false)) {
            builder.clearWindowColor();
        }
        String str11 = f34730r;
        if (bundle.containsKey(str11)) {
            builder.setVerticalType(bundle.getInt(str11));
        }
        String str12 = f34731s;
        if (bundle.containsKey(str12)) {
            builder.setShearDegrees(bundle.getFloat(str12));
        }
        return builder.build();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (TextUtils.equals(this.text, cue.text) && this.textAlignment == cue.textAlignment && this.multiRowAlignment == cue.multiRowAlignment && ((bitmap = this.bitmap) != null ? !((bitmap2 = cue.bitmap) == null || !bitmap.sameAs(bitmap2)) : cue.bitmap == null) && this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, Float.valueOf(this.line), Integer.valueOf(this.lineType), Integer.valueOf(this.lineAnchor), Float.valueOf(this.position), Integer.valueOf(this.positionAnchor), Float.valueOf(this.size), Float.valueOf(this.bitmapHeight), Boolean.valueOf(this.windowColorSet), Integer.valueOf(this.windowColor), Integer.valueOf(this.textSizeType), Float.valueOf(this.textSize), Integer.valueOf(this.verticalType), Float.valueOf(this.shearDegrees));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f34715b, this.text);
        bundle.putSerializable(f34716c, this.textAlignment);
        bundle.putSerializable(f34717d, this.multiRowAlignment);
        bundle.putParcelable(f34718f, this.bitmap);
        bundle.putFloat(f34719g, this.line);
        bundle.putInt(f34720h, this.lineType);
        bundle.putInt(f34721i, this.lineAnchor);
        bundle.putFloat(f34722j, this.position);
        bundle.putInt(f34723k, this.positionAnchor);
        bundle.putInt(f34724l, this.textSizeType);
        bundle.putFloat(f34725m, this.textSize);
        bundle.putFloat(f34726n, this.size);
        bundle.putFloat(f34727o, this.bitmapHeight);
        bundle.putBoolean(f34729q, this.windowColorSet);
        bundle.putInt(f34728p, this.windowColor);
        bundle.putInt(f34730r, this.verticalType);
        bundle.putFloat(f34731s, this.shearDegrees);
        return bundle;
    }

    @Deprecated
    public Cue(CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    @Deprecated
    public Cue(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    @Deprecated
    public Cue(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, null, f, i, i2, f2, i3, i4, f4, f3, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    }

    @Deprecated
    public Cue(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, null, f, i, i2, f2, i3, Integer.MIN_VALUE, -3.4028235E38f, f3, -3.4028235E38f, z, i4, Integer.MIN_VALUE, 0.0f);
    }

    private Cue(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            Assertions.checkNotNull(bitmap);
        } else {
            Assertions.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.text = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.text = charSequence.toString();
        } else {
            this.text = null;
        }
        this.textAlignment = alignment;
        this.multiRowAlignment = alignment2;
        this.bitmap = bitmap;
        this.line = f;
        this.lineType = i;
        this.lineAnchor = i2;
        this.position = f2;
        this.positionAnchor = i3;
        this.size = f4;
        this.bitmapHeight = f5;
        this.windowColorSet = z;
        this.windowColor = i5;
        this.textSizeType = i4;
        this.textSize = f3;
        this.verticalType = i6;
        this.shearDegrees = f6;
    }
}
