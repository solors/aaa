package p816o9;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata
/* renamed from: o9.d */
/* loaded from: classes8.dex */
public class ResourcesWrapper extends Resources {
    @NotNull

    /* renamed from: a */
    private final Resources f102748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesWrapper(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f102748a = resources;
    }

    @Override // android.content.res.Resources
    @RequiresApi(30)
    public void addLoaders(@NotNull ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.f102748a.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        XmlResourceParser animation = this.f102748a.getAnimation(i);
        Intrinsics.checkNotNullExpressionValue(animation, "resources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws Resources.NotFoundException {
        return this.f102748a.getColor(i);
    }

    @Override // android.content.res.Resources
    @RequiresApi(23)
    @NotNull
    public ColorStateList getColorStateList(int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f102748a.getColorStateList(i, theme);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "resources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Configuration getConfiguration() {
        return this.f102748a.getConfiguration();
    }

    @Override // android.content.res.Resources
    @Nullable
    public DisplayMetrics getDisplayMetrics() {
        return this.f102748a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.f102748a.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return this.f102748a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    @RequiresApi(29)
    public float getFloat(int i) throws Resources.NotFoundException {
        float f;
        f = this.f102748a.getFloat(i);
        return f;
    }

    @Override // android.content.res.Resources
    @RequiresApi(26)
    @NotNull
    public Typeface getFont(int i) throws Resources.NotFoundException {
        Typeface font;
        font = this.f102748a.getFont(i);
        Intrinsics.checkNotNullExpressionValue(font, "resources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) throws Resources.NotFoundException {
        return this.f102748a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return this.f102748a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int i) throws Resources.NotFoundException {
        int[] intArray = this.f102748a.getIntArray(i);
        Intrinsics.checkNotNullExpressionValue(intArray, "resources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        XmlResourceParser layout = this.f102748a.getLayout(i);
        Intrinsics.checkNotNullExpressionValue(layout, "resources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.f102748a.getMovie(i);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i, int i2, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String quantityString = this.f102748a.getQuantityString(i, i2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        CharSequence quantityText = this.f102748a.getQuantityText(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityText, "resources.getQuantityText(id, quantity)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.f102748a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.f102748a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.f102748a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.f102748a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = this.f102748a.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int i) throws Resources.NotFoundException {
        String[] stringArray = this.f102748a.getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    @Nullable
    public CharSequence getText(int i, @Nullable CharSequence charSequence) {
        return this.f102748a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        CharSequence[] textArray = this.f102748a.getTextArray(i);
        Intrinsics.checkNotNullExpressionValue(textArray, "resources.getTextArray(id)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public void getValue(@Nullable String str, @Nullable TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f102748a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, @Nullable TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f102748a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        XmlResourceParser xml = this.f102748a.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    @Nullable
    public TypedArray obtainAttributes(@Nullable AttributeSet attributeSet, @Nullable int[] iArr) {
        return this.f102748a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        TypedArray obtainTypedArray = this.f102748a.obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(obtainTypedArray, "resources.obtainTypedArray(id)");
        return obtainTypedArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i, @Nullable TypedValue typedValue) throws Resources.NotFoundException {
        InputStream openRawResource = this.f102748a.openRawResource(i, typedValue);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "resources.openRawResource(id, value)");
        return openRawResource;
    }

    @Override // android.content.res.Resources
    @Nullable
    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.f102748a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@Nullable String str, @Nullable AttributeSet attributeSet, @Nullable Bundle bundle) throws XmlPullParserException {
        this.f102748a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@Nullable XmlResourceParser xmlResourceParser, @Nullable Bundle bundle) throws XmlPullParserException, IOException {
        this.f102748a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    @RequiresApi(30)
    public void removeLoaders(@NotNull ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.f102748a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(@Nullable Configuration configuration, @Nullable DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f102748a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi(23)
    public int getColor(int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.f102748a.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f102748a.getColorStateList(i);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "resources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.f102748a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i, int i2, @Nullable Resources.Theme theme) {
        return this.f102748a.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        String quantityString = this.f102748a.getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, quantity)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i) throws Resources.NotFoundException {
        String string = this.f102748a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int i) throws Resources.NotFoundException {
        CharSequence text = this.f102748a.getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "resources.getText(id)");
        return text;
    }

    @Override // android.content.res.Resources
    public void getValue(int i, @Nullable TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f102748a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        InputStream openRawResource = this.f102748a.openRawResource(i);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "resources.openRawResource(id)");
        return openRawResource;
    }
}
