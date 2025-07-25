package io.bidmachine.nativead.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public class ImageHelper {
    private static final int MAX_IMAGE_HEIGHT = 700;
    private static final int MAX_IMAGE_WIDTH = 1200;

    /* loaded from: classes9.dex */
    public interface OnImageHelperListener {
        void onError(@NonNull String str);

        void onImagePrepared(@NonNull ImageView imageView, @NonNull Drawable drawable);
    }

    /* renamed from: io.bidmachine.nativead.utils.ImageHelper$a */
    /* loaded from: classes9.dex */
    class C36764a implements OnImageHelperListener {
        C36764a() {
        }

        @Override // io.bidmachine.nativead.utils.ImageHelper.OnImageHelperListener
        public void onError(@NonNull String str) {
            Logger.m20093d(str);
        }

        @Override // io.bidmachine.nativead.utils.ImageHelper.OnImageHelperListener
        public void onImagePrepared(@NonNull ImageView imageView, @NonNull Drawable drawable) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.nativead.utils.ImageHelper$b */
    /* loaded from: classes9.dex */
    public static class RunnableC36765b implements Runnable {
        private final Context context;
        private Drawable image;
        private final Uri imageUri;
        private final OnImageHelperListener onImageHelperListener;
        private final WeakReference<ImageView> weakTargetImageView;

        /* renamed from: io.bidmachine.nativead.utils.ImageHelper$b$a */
        /* loaded from: classes9.dex */
        class RunnableC36766a implements Runnable {
            RunnableC36766a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageView imageView = (ImageView) RunnableC36765b.this.weakTargetImageView.get();
                if (imageView != null && RunnableC36765b.this.image != null) {
                    RunnableC36765b.this.onImageHelperListener.onImagePrepared(imageView, RunnableC36765b.this.image);
                } else {
                    RunnableC36765b.this.onImageHelperListener.onError("Target ImageView or Bitmap is invalid");
                }
            }
        }

        RunnableC36765b(@NonNull Context context, @NonNull Uri uri, @NonNull ImageView imageView, @NonNull OnImageHelperListener onImageHelperListener) {
            this.context = context;
            this.imageUri = uri;
            this.weakTargetImageView = new WeakReference<>(imageView);
            this.onImageHelperListener = onImageHelperListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream openInputStream = this.context.getContentResolver().openInputStream(this.imageUri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                Utils.close(openInputStream);
                if (options.outWidth != 0 && options.outHeight != 0) {
                    int calculateReqWidth = ImageHelper.calculateReqWidth(this.context);
                    options.inSampleSize = ImageHelper.calculateInSamplesSize(options, calculateReqWidth, ImageHelper.calculateReqHeight(calculateReqWidth, false));
                    options.inJustDecodeBounds = false;
                    InputStream openInputStream2 = this.context.getContentResolver().openInputStream(this.imageUri);
                    this.image = new BitmapDrawable(this.context.getResources(), BitmapFactory.decodeStream(openInputStream2, null, options));
                    Utils.close(openInputStream2);
                    Utils.onUiThread(new RunnableC36766a());
                    return;
                }
                this.onImageHelperListener.onError("Image size is (0;0)");
            } catch (Throwable th) {
                String message = th.getMessage();
                OnImageHelperListener onImageHelperListener = this.onImageHelperListener;
                if (message == null) {
                    message = "ImagePreparation error";
                }
                onImageHelperListener.onError(message);
            }
        }
    }

    public static int calculateInSamplesSize(@NonNull BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        while (true) {
            if (i3 / i5 <= i && i4 / i5 <= i2) {
                return i5;
            }
            i5 *= 2;
        }
    }

    public static int calculateReqHeight(int i, boolean z) {
        if (z) {
            i = (int) (i / 1.5f);
        }
        if (i > 700) {
            return 700;
        }
        return i;
    }

    public static int calculateReqWidth(@NonNull Context context) {
        Point screenSize = Utils.getScreenSize(context);
        return Math.min(1200, Math.min(screenSize.x, screenSize.y));
    }

    public static void fillImageView(@NonNull Context context, @NonNull ImageView imageView, @Nullable Uri uri, @Nullable Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            loadImageByPath(context, uri, imageView, new C36764a());
        }
    }

    private static void loadImageByPath(@NonNull Context context, @Nullable Uri uri, @Nullable ImageView imageView, @Nullable OnImageHelperListener onImageHelperListener) {
        if (onImageHelperListener == null) {
            return;
        }
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            if (imageView == null) {
                onImageHelperListener.onError("Target ImageView is null");
                return;
            } else {
                NativeNetworkExecutor.getInstance().execute(new RunnableC36765b(context, uri, imageView, onImageHelperListener));
                return;
            }
        }
        onImageHelperListener.onError("ImagePath is invalid");
    }
}
