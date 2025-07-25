package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.gf */
/* loaded from: classes9.dex */
public abstract class AbstractC34563gf {
    /* renamed from: a */
    public static final String m21655a(C34476d9 c34476d9) {
        String str;
        StringBuilder sb2 = new StringBuilder("Event sent: ");
        int i = c34476d9.f94182c;
        String str2 = c34476d9.f94183d;
        byte[] bArr = c34476d9.f94184e;
        if (i == 1) {
            str = "Attribution";
        } else if (i == 2) {
            str = "Session start";
        } else if (i == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb3 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str3)) {
                    sb3.append(" with value ");
                    sb3.append(str3);
                }
            }
            str = sb3.toString();
        } else if (i == 5) {
            str = "Referrer";
        } else if (i == 7) {
            str = "Session heartbeat";
        } else if (i == 13) {
            str = "The very first event";
        } else if (i == 35) {
            str = "E-Commerce";
        } else if (i == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i == 42) {
            str = "External attribution";
        } else if (i == 16) {
            str = "Open";
        } else if (i == 17) {
            str = "Update";
        } else if (i == 20) {
            str = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    str = "ANR";
                    break;
                case 26:
                    str = "Crash: " + str2;
                    break;
                case 27:
                    str = "Error: " + str2;
                    break;
                default:
                    str = "type=" + i;
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public static final String m21654a(String str, EnumC34324Xa enumC34324Xa, String str2, String str3) {
        if (AbstractC34905t9.f95394d.contains(EnumC34324Xa.m22102a(enumC34324Xa.f93762a))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": ");
            sb2.append(enumC34324Xa.name());
            if (AbstractC34905t9.f95396f.contains(enumC34324Xa) && !TextUtils.isEmpty(str2)) {
                sb2.append(" with name ");
                sb2.append(str2);
            }
            if (AbstractC34905t9.f95395e.contains(enumC34324Xa) && !TextUtils.isEmpty(str3)) {
                sb2.append(" with value ");
                sb2.append(str3);
            }
            return sb2.toString();
        }
        return null;
    }
}
