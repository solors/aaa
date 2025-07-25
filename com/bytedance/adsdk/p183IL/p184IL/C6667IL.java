package com.bytedance.adsdk.p183IL.p184IL;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.p183IL.C6821eo;
import com.bytedance.adsdk.p183IL.InterfaceC6823eqN;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.IL.IL.IL */
/* loaded from: classes3.dex */
public class C6667IL {

    /* renamed from: bg */
    private static final Object f14139bg = new Object();

    /* renamed from: IL */
    private final Context f14140IL;

    /* renamed from: bX */
    private final String f14141bX;
    private InterfaceC6823eqN eqN;

    /* renamed from: zx */
    private final Map<String, C6821eo> f14142zx;

    public C6667IL(Drawable.Callback callback, String str, InterfaceC6823eqN interfaceC6823eqN, Map<String, C6821eo> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f14141bX = str + '/';
        } else {
            this.f14141bX = str;
        }
        this.f14142zx = map;
        m91206bg(interfaceC6823eqN);
        if (!(callback instanceof View)) {
            this.f14140IL = null;
        } else {
            this.f14140IL = ((View) callback).getContext().getApplicationContext();
        }
    }

    /* renamed from: IL */
    private Bitmap m91208IL(String str, Bitmap bitmap) {
        synchronized (f14139bg) {
            this.f14142zx.get(str).m90766bg(bitmap);
        }
        return bitmap;
    }

    /* renamed from: bg */
    public void m91206bg(InterfaceC6823eqN interfaceC6823eqN) {
        this.eqN = interfaceC6823eqN;
    }

    /* renamed from: bg */
    public Bitmap m91204bg(String str, Bitmap bitmap) {
        if (bitmap == null) {
            C6821eo c6821eo = this.f14142zx.get(str);
            Bitmap m90765eo = c6821eo.m90765eo();
            c6821eo.m90766bg(null);
            return m90765eo;
        }
        Bitmap m90765eo2 = this.f14142zx.get(str).m90765eo();
        m91208IL(str, bitmap);
        return m90765eo2;
    }

    /* renamed from: bg */
    public Bitmap m91205bg(String str) {
        C6821eo c6821eo = this.f14142zx.get(str);
        if (c6821eo == null) {
            return null;
        }
        Bitmap m90765eo = c6821eo.m90765eo();
        if (m90765eo != null) {
            return m90765eo;
        }
        InterfaceC6823eqN interfaceC6823eqN = this.eqN;
        if (interfaceC6823eqN != null) {
            return interfaceC6823eqN.mo88601bg(c6821eo);
        }
        Context context = this.f14140IL;
        if (context == null) {
            return null;
        }
        String m90770Kg = c6821eo.m90770Kg();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (m90770Kg.startsWith("data:") && m90770Kg.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(m90770Kg.substring(m90770Kg.indexOf(44) + 1), 0);
                return m91208IL(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f14141bX)) {
                AssetManager assets = context.getAssets();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f14141bX + m90770Kg), null, options);
                    if (decodeStream == null) {
                        return null;
                    }
                    return m91208IL(str, C6863ldr.m90617bg(decodeStream, c6821eo.m90767bg(), c6821eo.m90771IL()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    /* renamed from: bg */
    public boolean m91207bg(Context context) {
        return (context == null && this.f14140IL == null) || this.f14140IL.equals(context);
    }
}
