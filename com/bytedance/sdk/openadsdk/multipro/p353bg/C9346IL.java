package com.bytedance.sdk.openadsdk.multipro.p353bg;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C9099zx;
import com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg;
import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.bg.IL */
/* loaded from: classes3.dex */
public class C9346IL implements InterfaceC9345bg {

    /* renamed from: IL */
    private static final Object f20861IL = new Object();

    /* renamed from: bg */
    private Context f20862bg;

    /* renamed from: IL */
    private boolean m83031IL(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    @NonNull
    /* renamed from: bg */
    public String mo82970bg() {
        return "t_db";
    }

    /* renamed from: IL */
    private Context m83032IL() {
        Context context = this.f20862bg;
        return context == null ? C8838VzQ.m84740bg() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Cursor mo82964bg(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (f20861IL) {
            if (m83031IL(uri)) {
                return null;
            }
            String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str3 = split[2];
                String str4 = split[3];
                if ("ttopensdk.db".equals(str3)) {
                    return C9099zx.m83543bg(m83032IL()).mo83544bg().m84355bg(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public String mo82968bg(@NonNull Uri uri) {
        synchronized (f20861IL) {
            if (m83031IL(uri)) {
                return null;
            }
            String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 5) {
                String str = split[2];
                String str2 = split[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        String queryParameter = uri.getQueryParameter("sql");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            C9099zx.m83543bg(m83032IL()).mo83544bg().m84359bg(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        C9099zx.m83543bg(m83032IL()).mo83544bg().m84362IL();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        C9099zx.m83543bg(m83032IL()).mo83544bg().m84361bX();
                    } else if ("transactionEnd".equals(str2)) {
                        C9099zx.m83543bg(m83032IL()).mo83544bg().eqN();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Uri mo82967bg(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (f20861IL) {
            if (m83031IL(uri)) {
                return null;
            }
            String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str = split[2];
                String str2 = split[3];
                if ("ttopensdk.db".equals(str)) {
                    C9099zx.m83543bg(m83032IL()).mo83544bg().m84357bg(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82965bg(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (f20861IL) {
            if (m83031IL(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if ("ttopensdk.db".equals(str2)) {
                    return C9099zx.m83543bg(m83032IL()).mo83544bg().m84356bg(str3, str, strArr);
                }
                return 0;
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82966bg(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (f20861IL) {
            if (m83031IL(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if ("ttopensdk.db".equals(str2)) {
                    return C9099zx.m83543bg(m83032IL()).mo83544bg().m84358bg(str3, contentValues, str, strArr);
                }
                return 0;
            }
            return 0;
        }
    }
}
