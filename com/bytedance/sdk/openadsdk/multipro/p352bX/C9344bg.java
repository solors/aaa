package com.bytedance.sdk.openadsdk.multipro.p352bX;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.p337iR.C8933bg;
import com.bytedance.sdk.openadsdk.multipro.C9348eqN;
import com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg;
import com.bytedance.sdk.openadsdk.multipro.p353bg.C9347bg;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Objects;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.bX.bg */
/* loaded from: classes3.dex */
public class C9344bg implements InterfaceC9345bg {
    /* renamed from: IL */
    public static boolean m83036IL() {
        if (C8838VzQ.m84740bg() == null) {
            return false;
        }
        try {
            InterfaceC7711ldr eqN = eqN();
            if (eqN != null) {
                return "true".equals(eqN.mo83050bg(Uri.parse(m83033zx() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: bX */
    public static String m83035bX() {
        if (C8838VzQ.m84740bg() == null) {
            return null;
        }
        try {
            InterfaceC7711ldr eqN = eqN();
            if (eqN != null) {
                return eqN.mo83050bg(Uri.parse(m83033zx() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static InterfaceC7711ldr eqN() {
        try {
            if (C8838VzQ.m84740bg() != null) {
                return C9347bg.m83029bg(C8838VzQ.m84740bg());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: zx */
    private static String m83033zx() {
        return C9348eqN.f20865IL + "/t_frequent/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82966bg(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82965bg(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Cursor mo82964bg(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Uri mo82967bg(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    @NonNull
    /* renamed from: bg */
    public String mo82970bg() {
        return "t_frequent";
    }

    /* renamed from: bg */
    public static boolean m83034bg(String str) {
        if (C8838VzQ.m84740bg() == null) {
            return false;
        }
        try {
            InterfaceC7711ldr eqN = eqN();
            if (eqN != null) {
                return "true".equals(eqN.mo83050bg(Uri.parse(m83033zx() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public String mo82968bg(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[2];
        if ("checkFrequency".equals(str)) {
            return C8933bg.m84382bg().m84379bg(uri.getQueryParameter("rit")) ? "true" : "false";
        } else if ("isSilent".equals(str)) {
            return C8933bg.m84382bg().m84386IL() ? "true" : "false";
        } else if ("maxRit".equals(str)) {
            return C8933bg.m84382bg().m84383bX();
        } else {
            return null;
        }
    }
}
