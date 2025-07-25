package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFont.kt */
@RequiresApi(26)
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFileDescriptorFont */
/* loaded from: classes.dex */
final class AndroidFileDescriptorFont extends AndroidPreloadedFont {
    @Nullable
    private final String cacheKey;
    @NotNull
    private final ParcelFileDescriptor fileDescriptor;
    private final int style;
    @NotNull
    private final Typeface typefaceInternal;
    @NotNull
    private final FontWeight weight;

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, fontWeight, i);
    }

    @Override // androidx.compose.p015ui.text.font.AndroidPreloadedFont
    @Nullable
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @Override // androidx.compose.p015ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo109408getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.p015ui.text.font.AndroidPreloadedFont
    @NotNull
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
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m109462toStringimpl(mo109408getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m109465getNormal_LCdwA() : i, null);
    }

    private AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i) {
        this.fileDescriptor = parcelFileDescriptor;
        this.weight = fontWeight;
        this.style = i;
        if (Build.VERSION.SDK_INT >= 26) {
            this.typefaceInternal = AndroidFileDescriptorHelper.INSTANCE.create(parcelFileDescriptor);
            return;
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }
}
