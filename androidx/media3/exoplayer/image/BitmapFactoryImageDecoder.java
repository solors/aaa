package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import com.google.common.collect.ImmutableSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final BitmapDecoder bitmapDecoder;

    @VisibleForTesting(otherwise = 2)
    /* loaded from: classes2.dex */
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i) throws ImageDecoderException;
    }

    /* loaded from: classes2.dex */
    public static final class Factory implements ImageDecoder.Factory {
        private static final ImmutableSet<String> SUPPORTED_IMAGE_TYPES = getSupportedMimeTypes();
        private final BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new BitmapDecoder() { // from class: androidx.media3.exoplayer.image.a
                @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
                public final Bitmap decode(byte[] bArr, int i) {
                    Bitmap access$100;
                    access$100 = BitmapFactoryImageDecoder.access$100(bArr, i);
                    return access$100;
                }
            };
        }

        private static ImmutableSet<String> getSupportedMimeTypes() {
            ImmutableSet.Builder builder = ImmutableSet.builder();
            builder.add((Object[]) new String[]{"image/png", "image/jpeg", MimeTypes.IMAGE_BMP, "image/webp"});
            if (Util.SDK_INT >= 26) {
                builder.add((ImmutableSet.Builder) "image/heif");
            }
            return builder.build();
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            if (!MimeTypes.isImage(format.containerMimeType)) {
                return RendererCapabilities.create(0);
            }
            if (format.tileCountHorizontal == 1 && format.tileCountVertical == 1) {
                if (SUPPORTED_IMAGE_TYPES.contains(format.containerMimeType)) {
                    return RendererCapabilities.create(4);
                }
                return RendererCapabilities.create(1);
            }
            return RendererCapabilities.create(3);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.bitmapDecoder);
        }

        public Factory(BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }
    }

    public static /* synthetic */ Bitmap access$100(byte[] bArr, int i) throws ImageDecoderException {
        return decode(bArr, i);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    protected DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        return (ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            {
                BitmapFactoryImageDecoder.this = this;
            }

            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    @Nullable
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
            Assertions.checkState(byteBuffer.hasArray());
            Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ImageDecoderException e) {
            return e;
        }
    }

    public static Bitmap decode(byte[] bArr, int i) throws ImageDecoderException {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
        if (decodeByteArray != null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
                ExifInterface exifInterface = new ExifInterface(byteArrayInputStream);
                byteArrayInputStream.close();
                int rotationDegrees = exifInterface.getRotationDegrees();
                if (rotationDegrees != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(rotationDegrees);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (IOException e) {
                throw new ImageDecoderException(e);
            }
        }
        throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")");
    }
}
