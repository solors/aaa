package com.inmobi.media;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z1 */
/* loaded from: classes6.dex */
public abstract class AbstractC19546z1 implements InterfaceC19155X {

    /* renamed from: a */
    public final AdConfig.AdQualityConfig f48953a;

    public AbstractC19546z1(AdConfig.AdQualityConfig adQualityConfig) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f48953a = adQualityConfig;
    }

    /* renamed from: a */
    public final Bitmap m59525a(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        double resizedPercentage = (this.f48953a.getResizedPercentage() / 100.0d) * bitmap.getWidth();
        double resizedPercentage2 = (this.f48953a.getResizedPercentage() / 100.0d) * bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f48953a.getMaxImageSize()) {
            return createScaledBitmap;
        }
        StringBuilder sb2 = new StringBuilder("resize - original - ");
        sb2.append(resizedPercentage);
        String str = "  - ";
        sb2.append("  - ");
        sb2.append(resizedPercentage2);
        sb2.append(" - size - ");
        sb2.append(length);
        String message = sb2.toString();
        Intrinsics.checkNotNullParameter("BaseScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("BaseScreenShotProcess", message);
        while (length > this.f48953a.getMaxImageSize()) {
            String str2 = str;
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            double sqrt = Math.sqrt(this.f48953a.getMaxImageSize() / length);
            resizedPercentage *= sqrt;
            resizedPercentage2 *= sqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return createScaledBitmap;
            }
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream2.reset();
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
            length = byteArrayOutputStream2.toByteArray().length;
            str = str2;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        String message2 = "resize - " + resizedPercentage + str + resizedPercentage2 + " - " + byteArrayOutputStream.size();
        Intrinsics.checkNotNullParameter("BaseScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(message2, "message");
        Log.i("BaseScreenShotProcess", message2);
        return createScaledBitmap;
    }
}
