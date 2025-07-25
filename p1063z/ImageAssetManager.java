package p1063z;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p690h0.C33453f;
import p690h0.C33454j;

/* renamed from: z.b */
/* loaded from: classes2.dex */
public class ImageAssetManager {

    /* renamed from: d */
    private static final Object f118630d = new Object();

    /* renamed from: a */
    private final Context f118631a;

    /* renamed from: b */
    private final String f118632b;

    /* renamed from: c */
    private final Map<String, LottieImageAsset> f118633c;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f118632b = str + '/';
        } else {
            this.f118632b = str;
        }
        if (!(callback instanceof View)) {
            C33453f.m23901c("LottieDrawable must be inside of a view for images to work.");
            this.f118633c = new HashMap();
            this.f118631a = null;
            return;
        }
        this.f118631a = ((View) callback).getContext();
        this.f118633c = map;
        m903d(imageAssetDelegate);
    }

    /* renamed from: c */
    private Bitmap m904c(String str, @Nullable Bitmap bitmap) {
        synchronized (f118630d) {
            this.f118633c.get(str).m103259f(bitmap);
        }
        return bitmap;
    }

    @Nullable
    /* renamed from: a */
    public Bitmap m906a(String str) {
        LottieImageAsset lottieImageAsset = this.f118633c.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        Bitmap m103264a = lottieImageAsset.m103264a();
        if (m103264a != null) {
            return m103264a;
        }
        String m103263b = lottieImageAsset.m103263b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (m103263b.startsWith("data:") && m103263b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(m103263b.substring(m103263b.indexOf(44) + 1), 0);
                return m904c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                C33453f.m23900d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f118632b)) {
                AssetManager assets = this.f118631a.getAssets();
                try {
                    return m904c(str, C33454j.m23851l(BitmapFactory.decodeStream(assets.open(this.f118632b + m103263b), null, options), lottieImageAsset.m103260e(), lottieImageAsset.m103262c()));
                } catch (IllegalArgumentException e2) {
                    C33453f.m23900d("Unable to decode image.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            C33453f.m23900d("Unable to open asset.", e3);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m905b(Context context) {
        if ((context == null && this.f118631a == null) || this.f118631a.equals(context)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: e */
    public Bitmap m902e(String str, @Nullable Bitmap bitmap) {
        if (bitmap == null) {
            LottieImageAsset lottieImageAsset = this.f118633c.get(str);
            Bitmap m103264a = lottieImageAsset.m103264a();
            lottieImageAsset.m103259f(null);
            return m103264a;
        }
        Bitmap m103264a2 = this.f118633c.get(str).m103264a();
        m904c(str, bitmap);
        return m103264a2;
    }

    /* renamed from: d */
    public void m903d(@Nullable ImageAssetDelegate imageAssetDelegate) {
    }
}
