package androidx.compose.p015ui.text.font;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidAssetFont */
/* loaded from: classes.dex */
final class AndroidAssetFont extends AndroidPreloadedFont {
    @NotNull
    private final AssetManager assetManager;
    @NotNull
    private final String cacheKey;
    @NotNull
    private final String path;
    private final int style;
    @Nullable
    private final Typeface typefaceInternal;
    @NotNull
    private final FontWeight weight;

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, fontWeight, i);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(AndroidAssetFont.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (Intrinsics.m17075f(this.path, ((AndroidAssetFont) obj).path)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.text.font.AndroidAssetFont");
    }

    @NotNull
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.p015ui.text.font.AndroidPreloadedFont
    @NotNull
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    public int mo109408getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.p015ui.text.font.AndroidPreloadedFont
    @Nullable
    public Typeface getTypefaceInternal() {
        return this.typefaceInternal;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    @NotNull
    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m109462toStringimpl(mo109408getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i2 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 8) != 0 ? FontStyle.Companion.m109465getNormal_LCdwA() : i, null);
    }

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i) {
        this.assetManager = assetManager;
        this.path = str;
        this.weight = fontWeight;
        this.style = i;
        this.typefaceInternal = Typeface.createFromAsset(assetManager, str);
        this.cacheKey = "asset:" + str;
    }
}
