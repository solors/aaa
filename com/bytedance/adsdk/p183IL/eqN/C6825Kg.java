package com.bytedance.adsdk.p183IL.eqN;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.p183IL.C6669Kg;
import com.bytedance.adsdk.p183IL.C6681PX;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.eqN.Kg */
/* loaded from: classes3.dex */
public class C6825Kg {

    /* renamed from: IL */
    private final InterfaceC6830ldr f14650IL;

    /* renamed from: bg */
    private final C6829iR f14651bg;

    public C6825Kg(C6829iR c6829iR, InterfaceC6830ldr interfaceC6830ldr) {
        this.f14651bg = c6829iR;
        this.f14650IL = interfaceC6830ldr;
    }

    @WorkerThread
    /* renamed from: IL */
    private C6832iR m90762IL(Context context, String str, String str2) {
        C6829iR c6829iR;
        Pair<EnumC6826bX, InputStream> m90749bg;
        C6681PX<C6832iR> m91193IL;
        if (str2 == null || (c6829iR = this.f14651bg) == null || (m90749bg = c6829iR.m90749bg(str)) == null) {
            return null;
        }
        EnumC6826bX enumC6826bX = (EnumC6826bX) m90749bg.first;
        InputStream inputStream = (InputStream) m90749bg.second;
        if (enumC6826bX == EnumC6826bX.ZIP) {
            m91193IL = C6669Kg.m91182bg(context, new ZipInputStream(inputStream), str2);
        } else {
            m91193IL = C6669Kg.m91193IL(inputStream, str2);
        }
        if (m91193IL.m91156bg() != null) {
            return m91193IL.m91156bg();
        }
        return null;
    }

    @WorkerThread
    /* renamed from: bX */
    private C6681PX<C6832iR> m90761bX(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                InterfaceC6828eqN mo90745bg = this.f14650IL.mo90745bg(str);
                if (mo90745bg.mo90752bg()) {
                    C6681PX<C6832iR> m90759bg = m90759bg(context, str, mo90745bg.mo90754IL(), mo90745bg.mo90753bX(), str2);
                    m90759bg.m91156bg();
                    try {
                        mo90745bg.close();
                    } catch (IOException unused) {
                    }
                    return m90759bg;
                }
                C6681PX<C6832iR> c6681px = new C6681PX<>(new IllegalArgumentException(mo90745bg.eqN()));
                try {
                    mo90745bg.close();
                } catch (IOException unused2) {
                }
                return c6681px;
            } catch (Exception e) {
                C6681PX<C6832iR> c6681px2 = new C6681PX<>(e);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return c6681px2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: bg */
    public C6681PX<C6832iR> m90758bg(Context context, String str, String str2) {
        C6832iR m90762IL = m90762IL(context, str, str2);
        if (m90762IL != null) {
            return new C6681PX<>(m90762IL);
        }
        return m90761bX(context, str, str2);
    }

    /* renamed from: bg */
    private C6681PX<C6832iR> m90759bg(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        C6681PX<C6832iR> m90760bg;
        EnumC6826bX enumC6826bX;
        C6829iR c6829iR;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            enumC6826bX = EnumC6826bX.JSON;
            m90760bg = m90757bg(str, inputStream, str3);
        } else {
            EnumC6826bX enumC6826bX2 = EnumC6826bX.ZIP;
            m90760bg = m90760bg(context, str, inputStream, str3);
            enumC6826bX = enumC6826bX2;
        }
        if (str3 != null && m90760bg.m91156bg() != null && (c6829iR = this.f14651bg) != null) {
            c6829iR.m90748bg(str, enumC6826bX);
        }
        return m90760bg;
    }

    /* renamed from: bg */
    private C6681PX<C6832iR> m90760bg(Context context, String str, InputStream inputStream, String str2) throws IOException {
        C6829iR c6829iR;
        if (str2 != null && (c6829iR = this.f14651bg) != null) {
            return C6669Kg.m91182bg(context, new ZipInputStream(new FileInputStream(c6829iR.m90746bg(str, inputStream, EnumC6826bX.ZIP))), str);
        }
        return C6669Kg.m91182bg(context, new ZipInputStream(inputStream), (String) null);
    }

    /* renamed from: bg */
    private C6681PX<C6832iR> m90757bg(String str, InputStream inputStream, String str2) throws IOException {
        C6829iR c6829iR;
        if (str2 != null && (c6829iR = this.f14651bg) != null) {
            return C6669Kg.m91193IL(new FileInputStream(c6829iR.m90746bg(str, inputStream, EnumC6826bX.JSON).getAbsolutePath()), str);
        }
        return C6669Kg.m91193IL(inputStream, (String) null);
    }
}
