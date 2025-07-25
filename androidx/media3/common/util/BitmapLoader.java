package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.ListenableFuture;

@UnstableApi
/* loaded from: classes2.dex */
public interface BitmapLoader {
    ListenableFuture<Bitmap> decodeBitmap(byte[] bArr);

    default ListenableFuture<Bitmap> loadBitmap(Uri uri) {
        return loadBitmap(uri, null);
    }

    ListenableFuture<Bitmap> loadBitmap(Uri uri, @Nullable BitmapFactory.Options options);

    @Nullable
    default ListenableFuture<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }
}
