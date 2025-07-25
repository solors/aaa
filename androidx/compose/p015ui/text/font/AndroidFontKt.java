package androidx.compose.p015ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.text.ExperimentalTextApi;
import androidx.compose.runtime.Stable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontKt */
/* loaded from: classes.dex */
public final class AndroidFontKt {
    @Stable
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-RetOiIg  reason: not valid java name */
    public static final Font m109411FontRetOiIg(@NotNull File file, @NotNull FontWeight weight, int i) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidFileFont(file, weight, i, null);
    }

    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m109413FontRetOiIg$default(File file, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return m109411FontRetOiIg(file, fontWeight, i);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-wCLgNak  reason: not valid java name */
    public static final Font m109414FontwCLgNak(@NotNull AssetManager assetManager, @NotNull String path, @NotNull FontWeight weight, int i) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidAssetFont(assetManager, path, weight, i, null);
    }

    /* renamed from: Font-wCLgNak$default  reason: not valid java name */
    public static /* synthetic */ Font m109416FontwCLgNak$default(AssetManager assetManager, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return m109414FontwCLgNak(assetManager, str, fontWeight, i);
    }

    @ExperimentalTextApi
    @NotNull
    @Stable
    @RequiresApi(26)
    /* renamed from: Font-RetOiIg  reason: not valid java name */
    public static final Font m109410FontRetOiIg(@NotNull ParcelFileDescriptor fileDescriptor, @NotNull FontWeight weight, int i) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidFileDescriptorFont(fileDescriptor, weight, i, null);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-wCLgNak  reason: not valid java name */
    public static final Font m109415FontwCLgNak(@NotNull String path, @NotNull AssetManager assetManager, @NotNull FontWeight weight, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidAssetFont(assetManager, path, weight, i, null);
    }

    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m109412FontRetOiIg$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return m109410FontRetOiIg(parcelFileDescriptor, fontWeight, i);
    }

    /* renamed from: Font-wCLgNak$default  reason: not valid java name */
    public static /* synthetic */ Font m109417FontwCLgNak$default(String str, AssetManager assetManager, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return m109415FontwCLgNak(str, assetManager, fontWeight, i);
    }
}
