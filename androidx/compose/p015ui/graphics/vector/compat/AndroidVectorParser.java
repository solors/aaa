package androidx.compose.p015ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlVectorParser.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.compat.AndroidVectorParser */
/* loaded from: classes.dex */
public final class AndroidVectorParser {
    private int config;
    @NotNull
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(@NotNull XmlPullParser xmlParser, int i) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        this.xmlParser = xmlParser;
        this.config = i;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    private final void updateConfig(int i) {
        this.config = i | this.config;
    }

    @NotNull
    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    @NotNull
    public final AndroidVectorParser copy(@NotNull XmlPullParser xmlParser, int i) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        return new AndroidVectorParser(xmlParser, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        if (Intrinsics.m17075f(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config) {
            return true;
        }
        return false;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(@NotNull TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@NotNull TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(@NotNull TypedArray typedArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean getNamedBoolean(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, attrName, i, z);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    @Nullable
    public final ColorStateList getNamedColorStateList(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, attrName, i);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    @NotNull
    public final ComplexColorCompat getNamedComplexColor(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int i, @ColorInt int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ComplexColorCompat result = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, attrName, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final float getNamedFloat(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, attrName, i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, attrName, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    @Nullable
    public final String getString(@NotNull TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(i);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    @NotNull
    public final TypedArray obtainAttributes(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet set, @NotNull int[] attrs) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(res, theme, set, attrs);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(\n      …          attrs\n        )");
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    @NotNull
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
