package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL.C7644IL;
import com.bytedance.sdk.openadsdk.eqN.p344bg.C9258zx;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9350bX;
import com.bytedance.sdk.openadsdk.multipro.p352bX.C9344bg;
import com.bytedance.sdk.openadsdk.multipro.p353bg.C9346IL;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.zx */
/* loaded from: classes3.dex */
public class C9354zx implements InterfaceC9345bg {

    /* renamed from: IL */
    private static WeakReference<Context> f20870IL;

    /* renamed from: bX */
    private static final List<InterfaceC9345bg> f20871bX;

    /* renamed from: bg */
    private static volatile C9354zx f20872bg;

    static {
        List<InterfaceC9345bg> synchronizedList = Collections.synchronizedList(new ArrayList());
        f20871bX = synchronizedList;
        synchronizedList.add(new C9350bX());
        synchronizedList.add(new C9346IL());
        synchronizedList.add(new C9344bg());
        synchronizedList.add(new C9258zx(new C7644IL()));
        Iterator<InterfaceC9345bg> it = synchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private C9354zx() {
    }

    /* renamed from: IL */
    private InterfaceC9345bg m82972IL(Uri uri) {
        if (uri == null || !m82971bX(uri)) {
            return null;
        }
        String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (InterfaceC9345bg interfaceC9345bg : f20871bX) {
            if (str.equals(interfaceC9345bg.mo82970bg())) {
                return interfaceC9345bg;
            }
        }
        return null;
    }

    /* renamed from: bX */
    private boolean m82971bX(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    @NonNull
    /* renamed from: bg */
    public String mo82970bg() {
        return "";
    }

    /* renamed from: bg */
    public static C9354zx m82969bg(Context context) {
        if (context != null) {
            f20870IL = new WeakReference<>(context.getApplicationContext());
        }
        if (f20872bg == null) {
            synchronized (C9354zx.class) {
                if (f20872bg == null) {
                    f20872bg = new C9354zx();
                }
            }
        }
        return f20872bg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Cursor mo82964bg(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            InterfaceC9345bg m82972IL = m82972IL(uri);
            if (m82972IL != null) {
                return m82972IL.mo82964bg(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public String mo82968bg(@NonNull Uri uri) {
        try {
            InterfaceC9345bg m82972IL = m82972IL(uri);
            if (m82972IL != null) {
                return m82972IL.mo82968bg(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Uri mo82967bg(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            InterfaceC9345bg m82972IL = m82972IL(uri);
            if (m82972IL != null) {
                return m82972IL.mo82967bg(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82965bg(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            InterfaceC9345bg m82972IL = m82972IL(uri);
            if (m82972IL != null) {
                return m82972IL.mo82965bg(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82966bg(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            InterfaceC9345bg m82972IL = m82972IL(uri);
            if (m82972IL != null) {
                return m82972IL.mo82966bg(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
