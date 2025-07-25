package com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.coo2iico */
/* loaded from: classes8.dex */
public class C32481coo2iico {
    private static final String coo2iico = "image/gif";

    private C32481coo2iico() {
    }

    public static boolean coi222o222(String str) {
        if (!coo2iico(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return coo2iico(options);
    }

    public static boolean coo2iico(BitmapFactory.Options options) {
        if (options == null) {
            return false;
        }
        String str = options.outMimeType;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return coo2iico.equals(str);
    }

    public static boolean coo2iico(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
