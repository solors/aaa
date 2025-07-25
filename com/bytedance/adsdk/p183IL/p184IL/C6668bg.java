package com.bytedance.adsdk.p183IL.p184IL;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.p183IL.C6703bX;
import com.bytedance.adsdk.p183IL.p185bX.C6732bX;
import com.bytedance.adsdk.p183IL.p185bX.C6767iR;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.IL.IL.bg */
/* loaded from: classes3.dex */
public class C6668bg {
    private final AssetManager eqN;

    /* renamed from: zx */
    private C6703bX f14146zx;

    /* renamed from: bg */
    private final C6767iR<String> f14145bg = new C6767iR<>();

    /* renamed from: IL */
    private final Map<C6767iR<String>, Typeface> f14143IL = new HashMap();

    /* renamed from: bX */
    private final Map<String, Typeface> f14144bX = new HashMap();
    private String ldr = ".ttf";

    public C6668bg(Drawable.Callback callback, C6703bX c6703bX) {
        this.f14146zx = c6703bX;
        if (!(callback instanceof View)) {
            this.eqN = null;
        } else {
            this.eqN = ((View) callback).getContext().getAssets();
        }
    }

    /* renamed from: IL */
    private Typeface m91203IL(C6732bX c6732bX) {
        Typeface typeface;
        String m90986bg = c6732bX.m90986bg();
        Typeface typeface2 = this.f14144bX.get(m90986bg);
        if (typeface2 != null) {
            return typeface2;
        }
        String m90987bX = c6732bX.m90987bX();
        String m90988IL = c6732bX.m90988IL();
        C6703bX c6703bX = this.f14146zx;
        if (c6703bX != null) {
            typeface = c6703bX.m91076bg(m90986bg, m90987bX, m90988IL);
            if (typeface == null) {
                typeface = this.f14146zx.m91077bg(m90986bg);
            }
        } else {
            typeface = null;
        }
        C6703bX c6703bX2 = this.f14146zx;
        if (c6703bX2 != null && typeface == null) {
            String m91078IL = c6703bX2.m91078IL(m90986bg, m90987bX, m90988IL);
            if (m91078IL == null) {
                m91078IL = this.f14146zx.m91079IL(m90986bg);
            }
            if (m91078IL != null) {
                try {
                    typeface = Typeface.createFromAsset(this.eqN, m91078IL);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (c6732bX.eqN() != null) {
            return c6732bX.eqN();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.eqN, "fonts/" + m90986bg + this.ldr);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.f14144bX.put(m90986bg, typeface);
        return typeface;
    }

    /* renamed from: bg */
    public void m91200bg(C6703bX c6703bX) {
        this.f14146zx = c6703bX;
    }

    /* renamed from: bg */
    public void m91199bg(String str) {
        this.ldr = str;
    }

    /* renamed from: bg */
    public Typeface m91201bg(C6732bX c6732bX) {
        this.f14145bg.m90880bg(c6732bX.m90986bg(), c6732bX.m90987bX());
        Typeface typeface = this.f14143IL.get(this.f14145bg);
        if (typeface != null) {
            return typeface;
        }
        Typeface m91202bg = m91202bg(m91203IL(c6732bX), c6732bX.m90987bX());
        this.f14143IL.put(this.f14145bg, m91202bg);
        return m91202bg;
    }

    /* renamed from: bg */
    private Typeface m91202bg(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
