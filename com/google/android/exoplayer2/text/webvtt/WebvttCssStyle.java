package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    @ColorInt

    /* renamed from: f */
    private int f34995f;

    /* renamed from: h */
    private int f34997h;

    /* renamed from: o */
    private float f35004o;

    /* renamed from: a */
    private String f34990a = "";

    /* renamed from: b */
    private String f34991b = "";

    /* renamed from: c */
    private Set<String> f34992c = Collections.emptySet();

    /* renamed from: d */
    private String f34993d = "";
    @Nullable

    /* renamed from: e */
    private String f34994e = null;

    /* renamed from: g */
    private boolean f34996g = false;

    /* renamed from: i */
    private boolean f34998i = false;

    /* renamed from: j */
    private int f34999j = -1;

    /* renamed from: k */
    private int f35000k = -1;

    /* renamed from: l */
    private int f35001l = -1;

    /* renamed from: m */
    private int f35002m = -1;

    /* renamed from: n */
    private int f35003n = -1;

    /* renamed from: p */
    private int f35005p = -1;

    /* renamed from: q */
    private boolean f35006q = false;

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
    public @interface StyleFlags {
    }

    /* renamed from: a */
    private static int m73386a(int i, String str, @Nullable String str2, int i2) {
        if (!str.isEmpty() && i != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i + i2;
        }
        return i;
    }

    public int getBackgroundColor() {
        if (this.f34998i) {
            return this.f34997h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.f35006q;
    }

    public int getFontColor() {
        if (this.f34996g) {
            return this.f34995f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String getFontFamily() {
        return this.f34994e;
    }

    public float getFontSize() {
        return this.f35004o;
    }

    public int getFontSizeUnit() {
        return this.f35003n;
    }

    public int getRubyPosition() {
        return this.f35005p;
    }

    public int getSpecificityScore(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f34990a.isEmpty() && this.f34991b.isEmpty() && this.f34992c.isEmpty() && this.f34993d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m73386a = m73386a(m73386a(m73386a(0, this.f34990a, str, 1073741824), this.f34991b, str2, 2), this.f34993d, str3, 4);
        if (m73386a == -1 || !set.containsAll(this.f34992c)) {
            return 0;
        }
        return m73386a + (this.f34992c.size() * 4);
    }

    public int getStyle() {
        int i;
        int i2 = this.f35001l;
        if (i2 == -1 && this.f35002m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f35002m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    public boolean hasBackgroundColor() {
        return this.f34998i;
    }

    public boolean hasFontColor() {
        return this.f34996g;
    }

    public boolean isLinethrough() {
        if (this.f34999j == 1) {
            return true;
        }
        return false;
    }

    public boolean isUnderline() {
        if (this.f35000k == 1) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setBackgroundColor(int i) {
        this.f34997h = i;
        this.f34998i = true;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setBold(boolean z) {
        this.f35001l = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setCombineUpright(boolean z) {
        this.f35006q = z;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontColor(int i) {
        this.f34995f = i;
        this.f34996g = true;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontFamily(@Nullable String str) {
        String lowerCase;
        if (str == null) {
            lowerCase = null;
        } else {
            lowerCase = Ascii.toLowerCase(str);
        }
        this.f34994e = lowerCase;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontSize(float f) {
        this.f35004o = f;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontSizeUnit(int i) {
        this.f35003n = i;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setItalic(boolean z) {
        this.f35002m = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setLinethrough(boolean z) {
        this.f34999j = z ? 1 : 0;
        return this;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setRubyPosition(int i) {
        this.f35005p = i;
        return this;
    }

    public void setTargetClasses(String[] strArr) {
        this.f34992c = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetId(String str) {
        this.f34990a = str;
    }

    public void setTargetTagName(String str) {
        this.f34991b = str;
    }

    public void setTargetVoice(String str) {
        this.f34993d = str;
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setUnderline(boolean z) {
        this.f35000k = z ? 1 : 0;
        return this;
    }
}
