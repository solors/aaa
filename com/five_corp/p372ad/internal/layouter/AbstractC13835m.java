package com.five_corp.p372ad.internal.layouter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.util.Log;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.ironsource.C21114v8;

/* renamed from: com.five_corp.ad.internal.layouter.m */
/* loaded from: classes4.dex */
public abstract class AbstractC13835m {
    /* renamed from: a */
    public static BitmapDrawable m78272a(String str, Resources resources, C13836a c13836a) {
        String str2;
        Bitmap decodeByteArray;
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            str2 = "WatermarkDrawableBuilder.build Base64.decode failed, input: [" + str + "], exception: " + Log.getStackTraceString(e);
        }
        if (decodeByteArray == null) {
            str2 = "WatermarkDrawableBuilder.build BitmapFactory.decodeByteArray failed, input: [" + str + C21114v8.C21123i.f54139e;
            c13836a.m78270a(str2);
            return null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, decodeByteArray);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
        return bitmapDrawable;
    }
}
