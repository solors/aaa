package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Sa */
/* loaded from: classes6.dex */
public final class C19101Sa implements InterfaceC19155X {

    /* renamed from: a */
    public final byte[] f47794a;

    /* renamed from: b */
    public final String f47795b;

    public C19101Sa(String location, byte[] imageBytes) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f47794a = imageBytes;
        this.f47795b = location;
    }

    @Override // com.inmobi.media.InterfaceC19155X
    /* renamed from: a */
    public final Object mo59568a() {
        byte[] bArr = this.f47794a;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.m17074g(decodeByteArray);
        StringBuilder sb2 = new StringBuilder();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        sb2.append(uuid);
        sb2.append(".jpg");
        String sb3 = sb2.toString();
        File file = new File(this.f47795b);
        if (!file.exists()) {
            file.mkdirs();
        }
        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f47795b + '/' + sb3)));
        Intrinsics.checkNotNullParameter("StoreProcess", "tag");
        Intrinsics.checkNotNullParameter("screenshot file saved", "message");
        Log.i("StoreProcess", "screenshot file saved");
        return this.f47795b + '/' + sb3;
    }
}
