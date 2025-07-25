package p879s9;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import androidx.core.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p789m9.BitmapSource;
import p789m9.CachedBitmap;

@Metadata
/* renamed from: s9.i */
/* loaded from: classes8.dex */
public final class ImageUtils {
    @NotNull
    /* renamed from: a */
    public static final CachedBitmap m12030a(@NotNull PictureDrawable pictureDrawable, @NotNull Uri imageUrl, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(pictureDrawable, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new CachedBitmap(Drawable.toBitmap$default(pictureDrawable, 0, 0, null, 7, null), bArr, imageUrl, BitmapSource.MEMORY);
    }

    /* renamed from: b */
    public static /* synthetic */ CachedBitmap m12029b(PictureDrawable pictureDrawable, Uri uri, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return m12030a(pictureDrawable, uri, bArr);
    }
}
