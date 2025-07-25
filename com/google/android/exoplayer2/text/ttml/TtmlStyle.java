package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    @Nullable

    /* renamed from: a */
    private String f34952a;

    /* renamed from: b */
    private int f34953b;

    /* renamed from: c */
    private boolean f34954c;

    /* renamed from: d */
    private int f34955d;

    /* renamed from: e */
    private boolean f34956e;

    /* renamed from: k */
    private float f34962k;
    @Nullable

    /* renamed from: l */
    private String f34963l;
    @Nullable

    /* renamed from: o */
    private Layout.Alignment f34966o;
    @Nullable

    /* renamed from: p */
    private Layout.Alignment f34967p;
    @Nullable

    /* renamed from: r */
    private TextEmphasis f34969r;

    /* renamed from: f */
    private int f34957f = -1;

    /* renamed from: g */
    private int f34958g = -1;

    /* renamed from: h */
    private int f34959h = -1;

    /* renamed from: i */
    private int f34960i = -1;

    /* renamed from: j */
    private int f34961j = -1;

    /* renamed from: m */
    private int f34964m = -1;

    /* renamed from: n */
    private int f34965n = -1;

    /* renamed from: q */
    private int f34968q = -1;

    /* renamed from: s */
    private float f34970s = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface StyleFlags {
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    private TtmlStyle m73407a(@Nullable TtmlStyle ttmlStyle, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f34954c && ttmlStyle.f34954c) {
                setFontColor(ttmlStyle.f34953b);
            }
            if (this.f34959h == -1) {
                this.f34959h = ttmlStyle.f34959h;
            }
            if (this.f34960i == -1) {
                this.f34960i = ttmlStyle.f34960i;
            }
            if (this.f34952a == null && (str = ttmlStyle.f34952a) != null) {
                this.f34952a = str;
            }
            if (this.f34957f == -1) {
                this.f34957f = ttmlStyle.f34957f;
            }
            if (this.f34958g == -1) {
                this.f34958g = ttmlStyle.f34958g;
            }
            if (this.f34965n == -1) {
                this.f34965n = ttmlStyle.f34965n;
            }
            if (this.f34966o == null && (alignment2 = ttmlStyle.f34966o) != null) {
                this.f34966o = alignment2;
            }
            if (this.f34967p == null && (alignment = ttmlStyle.f34967p) != null) {
                this.f34967p = alignment;
            }
            if (this.f34968q == -1) {
                this.f34968q = ttmlStyle.f34968q;
            }
            if (this.f34961j == -1) {
                this.f34961j = ttmlStyle.f34961j;
                this.f34962k = ttmlStyle.f34962k;
            }
            if (this.f34969r == null) {
                this.f34969r = ttmlStyle.f34969r;
            }
            if (this.f34970s == Float.MAX_VALUE) {
                this.f34970s = ttmlStyle.f34970s;
            }
            if (z && !this.f34956e && ttmlStyle.f34956e) {
                setBackgroundColor(ttmlStyle.f34955d);
            }
            if (z && this.f34964m == -1 && (i = ttmlStyle.f34964m) != -1) {
                this.f34964m = i;
            }
        }
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle chain(@Nullable TtmlStyle ttmlStyle) {
        return m73407a(ttmlStyle, true);
    }

    public int getBackgroundColor() {
        if (this.f34956e) {
            return this.f34955d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int getFontColor() {
        if (this.f34954c) {
            return this.f34953b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    public String getFontFamily() {
        return this.f34952a;
    }

    public float getFontSize() {
        return this.f34962k;
    }

    public int getFontSizeUnit() {
        return this.f34961j;
    }

    @Nullable
    public String getId() {
        return this.f34963l;
    }

    @Nullable
    public Layout.Alignment getMultiRowAlign() {
        return this.f34967p;
    }

    public int getRubyPosition() {
        return this.f34965n;
    }

    public int getRubyType() {
        return this.f34964m;
    }

    public float getShearPercentage() {
        return this.f34970s;
    }

    public int getStyle() {
        int i;
        int i2 = this.f34959h;
        if (i2 == -1 && this.f34960i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f34960i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    @Nullable
    public Layout.Alignment getTextAlign() {
        return this.f34966o;
    }

    public boolean getTextCombine() {
        if (this.f34968q == 1) {
            return true;
        }
        return false;
    }

    @Nullable
    public TextEmphasis getTextEmphasis() {
        return this.f34969r;
    }

    public boolean hasBackgroundColor() {
        return this.f34956e;
    }

    public boolean hasFontColor() {
        return this.f34954c;
    }

    @CanIgnoreReturnValue
    public TtmlStyle inherit(@Nullable TtmlStyle ttmlStyle) {
        return m73407a(ttmlStyle, false);
    }

    public boolean isLinethrough() {
        if (this.f34957f == 1) {
            return true;
        }
        return false;
    }

    public boolean isUnderline() {
        if (this.f34958g == 1) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setBackgroundColor(int i) {
        this.f34955d = i;
        this.f34956e = true;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setBold(boolean z) {
        this.f34959h = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontColor(int i) {
        this.f34953b = i;
        this.f34954c = true;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontFamily(@Nullable String str) {
        this.f34952a = str;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontSize(float f) {
        this.f34962k = f;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontSizeUnit(int i) {
        this.f34961j = i;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setId(@Nullable String str) {
        this.f34963l = str;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setItalic(boolean z) {
        this.f34960i = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setLinethrough(boolean z) {
        this.f34957f = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setMultiRowAlign(@Nullable Layout.Alignment alignment) {
        this.f34967p = alignment;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setRubyPosition(int i) {
        this.f34965n = i;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setRubyType(int i) {
        this.f34964m = i;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setShearPercentage(float f) {
        this.f34970s = f;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setTextAlign(@Nullable Layout.Alignment alignment) {
        this.f34966o = alignment;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setTextCombine(boolean z) {
        this.f34968q = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setTextEmphasis(@Nullable TextEmphasis textEmphasis) {
        this.f34969r = textEmphasis;
        return this;
    }

    @CanIgnoreReturnValue
    public TtmlStyle setUnderline(boolean z) {
        this.f34958g = z ? 1 : 0;
        return this;
    }
}
