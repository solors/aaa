package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class zg1 {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC38501j<byte[]> f88856a;

    /* renamed from: com.yandex.mobile.ads.impl.zg1$a */
    /* loaded from: classes8.dex */
    static final class C31986a extends Lambda implements Functions<byte[]> {

        /* renamed from: b */
        public static final C31986a f88857b = new C31986a();

        C31986a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final byte[] invoke() {
            return Base64.decode("/9j/2wBDAAUDBAQEAwUEBAQFBQUGBwwIBwcHBw8LCwkMEQ8SEhEPERETFhwXExQaFRERGCEYGh0dHx8fExciJCIeJBweHx7/2wBDAQUFBQcGBw4ICA4eFBEUHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh7/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fo=", 0);
        }
    }

    static {
        InterfaceC38501j<byte[]> m14554a;
        m14554a = LazyJVM.m14554a(C31986a.f88857b);
        f88856a = m14554a;
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m26233a(@NotNull String previewBase64) {
        Object m14549b;
        boolean z;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(previewBase64, "previewBase64");
        Bitmap bitmap2 = null;
        try {
            Result.C38506a c38506a = Result.f101870c;
            byte[] m26232b = m26232b(previewBase64);
            if (m26232b.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bitmap = BitmapFactory.decodeByteArray(m26232b, 0, m26232b.length);
            } else {
                bitmap = null;
            }
            m14549b = Result.m14549b(bitmap);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (!Result.m14544g(m14549b)) {
            bitmap2 = m14549b;
        }
        return bitmap2;
    }

    /* renamed from: b */
    private static byte[] m26232b(String str) {
        String m16547v0;
        boolean m16624M;
        boolean z;
        m16547v0 = C37690r.m16547v0(str, "data:image/png;base64,");
        byte[] decode = Base64.decode(m16547v0, 0);
        m16624M = StringsJVM.m16624M(str, "data:image/png;base64,", false, 2, null);
        if (!m16624M) {
            Intrinsics.m17074g(decode);
            if (decode.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                byte[] value = f88856a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "access$getPreviewHeader(...)");
                decode = _ArraysJvm.m17379z(value, decode);
            } else {
                decode = new byte[0];
            }
        }
        Intrinsics.m17074g(decode);
        return decode;
    }
}
