package com.inmobi.media;

import android.os.Build;
import kotlin.text.CharJVM;
import kotlin.text.Regex;

/* renamed from: com.inmobi.media.Jc */
/* loaded from: classes6.dex */
public abstract class AbstractC18984Jc {
    /* renamed from: a */
    public static long m60987a(String str) {
        int checkRadix;
        String[] strArr = (String[]) new Regex("\\:").m16763h(str, 0).toArray(new String[0]);
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            try {
                String str2 = strArr[i];
                checkRadix = CharJVM.checkRadix(16);
                bArr[i] = (byte) Integer.parseInt(str2, checkRadix);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return ((bArr[0] & 255) << 40) | ((bArr[3] & 255) << 16) | (bArr[5] & 255) | ((bArr[4] & 255) << 8) | ((bArr[2] & 255) << 24) | ((bArr[1] & 255) << 32);
    }

    /* renamed from: a */
    public static final boolean m60988a() {
        if (C18954Ha.m61055q()) {
            String[] strArr = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"};
            boolean m60162a = AbstractC19330j9.m60162a(C18954Ha.m61068d(), "android.permission.ACCESS_FINE_LOCATION");
            boolean z = true;
            for (int i = 0; i < 3; i++) {
                if (!AbstractC19330j9.m60162a(C18954Ha.m61068d(), strArr[i])) {
                    z = false;
                }
            }
            if (z) {
                return Build.VERSION.SDK_INT < 29 || m60162a;
            }
            return false;
        }
        return false;
    }
}
