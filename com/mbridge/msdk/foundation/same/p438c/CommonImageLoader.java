package com.mbridge.msdk.foundation.same.p438c;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderRefactor;
import com.mbridge.msdk.foundation.tools.SameTool;

/* renamed from: com.mbridge.msdk.foundation.same.c.b */
/* loaded from: classes6.dex */
public final class CommonImageLoader {

    /* renamed from: a */
    private static CommonImageLoader f56525a;

    private CommonImageLoader(Context context) {
    }

    /* renamed from: a */
    public static CommonImageLoader m52263a(Context context) {
        if (f56525a == null) {
            f56525a = new CommonImageLoader(context);
        }
        return f56525a;
    }

    /* renamed from: b */
    public final boolean m52260b(String str) {
        CommonImageLoaderRefactor commonImageLoaderRefactor;
        if (!SameTool.m51709k(str)) {
            commonImageLoaderRefactor = CommonImageLoaderRefactor.C21970a.f56534a;
            return commonImageLoaderRefactor.m52254b(str);
        }
        return false;
    }

    /* renamed from: a */
    public final Bitmap m52262a(String str) {
        CommonImageLoaderRefactor commonImageLoaderRefactor;
        if (SameTool.m51709k(str)) {
            return null;
        }
        commonImageLoaderRefactor = CommonImageLoaderRefactor.C21970a.f56534a;
        return commonImageLoaderRefactor.m52257a(str);
    }

    /* renamed from: a */
    public final void m52261a(String str, CommonImageLoaderListener commonImageLoaderListener) {
        CommonImageLoaderRefactor commonImageLoaderRefactor;
        commonImageLoaderRefactor = CommonImageLoaderRefactor.C21970a.f56534a;
        commonImageLoaderRefactor.m52256a(str, null, commonImageLoaderListener);
    }
}
