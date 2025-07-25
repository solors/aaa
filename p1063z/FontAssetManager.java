package p1063z;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.FontAssetDelegate;
import java.util.HashMap;
import java.util.Map;
import p001a0.MutablePair;
import p690h0.C33453f;

/* renamed from: z.a */
/* loaded from: classes2.dex */
public class FontAssetManager {

    /* renamed from: d */
    private final AssetManager f118628d;

    /* renamed from: a */
    private final MutablePair<String> f118625a = new MutablePair<>();

    /* renamed from: b */
    private final Map<MutablePair<String>, Typeface> f118626b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f118627c = new HashMap();

    /* renamed from: e */
    private String f118629e = ".ttf";

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        if (!(callback instanceof View)) {
            C33453f.m23901c("LottieDrawable must be inside of a view for images to work.");
            this.f118628d = null;
            return;
        }
        this.f118628d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m910a(String str) {
        Typeface typeface = this.f118627c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f118628d, "fonts/" + str + this.f118629e);
        this.f118627c.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: d */
    private Typeface m907d(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface m909b(String str, String str2) {
        this.f118625a.m105879b(str, str2);
        Typeface typeface = this.f118626b.get(this.f118625a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m907d = m907d(m910a(str), str2);
        this.f118626b.put(this.f118625a, m907d);
        return m907d;
    }

    /* renamed from: c */
    public void m908c(@Nullable FontAssetDelegate fontAssetDelegate) {
    }
}
