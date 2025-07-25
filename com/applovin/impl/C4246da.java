package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.applovin.impl.da */
/* loaded from: classes2.dex */
public class C4246da {

    /* renamed from: a */
    private final Map f5602a;

    /* renamed from: b */
    private final C5416j f5603b;

    public C4246da(Map map, C5416j c5416j) {
        this.f5602a = map == null ? Collections.emptyMap() : map;
        this.f5603b = c5416j;
    }

    /* renamed from: a */
    public Drawable m99847a() {
        Object obj = this.f5602a.get("google_watermark");
        if (!m99846a(obj)) {
            this.f5603b.m95186I();
            if (C5434n.m94914a()) {
                C5434n m95186I = this.f5603b.m95186I();
                m95186I.m94907b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C5416j.m95072m().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f5603b.m95186I();
            if (C5434n.m94914a()) {
                this.f5603b.m95186I().m94910a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    /* renamed from: b */
    public String m99845b() {
        return "google watermark";
    }

    /* renamed from: c */
    public boolean m99844c() {
        return m99846a(this.f5602a.get("google_watermark"));
    }

    /* renamed from: a */
    private boolean m99846a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
