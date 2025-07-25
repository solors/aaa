package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFileFont */
/* loaded from: classes.dex */
final class AndroidFileFont extends AndroidPreloadedFont {
    @Nullable
    private final String cacheKey;
    @NotNull
    private final File file;
    private final int style;
    @Nullable
    private final Typeface typefaceInternal;
    @NotNull
    private final FontWeight weight;

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, fontWeight, i);
    }

    @Override // androidx.compose.p015ui.text.font.AndroidPreloadedFont
    @Nullable
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
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

    @NotNull
    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m109462toStringimpl(mo109408getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m109465getNormal_LCdwA() : i, null);
    }

    private AndroidFileFont(File file, FontWeight fontWeight, int i) {
        this.file = file;
        this.weight = fontWeight;
        this.style = i;
        this.typefaceInternal = Typeface.createFromFile(file);
    }
}
