package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bX */
/* loaded from: classes3.dex */
public class C7680bX {
    /* renamed from: bg */
    public static void m88075bg(Context context, String str, ContentValues contentValues) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                C7681bg.m88069bg(context).mo88070bg().m88080bg(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m88072bg(Context context, String str, List<InterfaceC7706bg> list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            try {
                C7681bg.m88069bg(context).mo88070bg().m88079bg(str, (String) null, list);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static int m88073bg(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return C7681bg.m88069bg(context).mo88070bg().m88078bg(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: bg */
    public static int m88074bg(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return C7681bg.m88069bg(context).mo88070bg().m88081bg(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* renamed from: bg */
    public static Cursor m88071bg(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C7681bg.m88069bg(context).mo88070bg().m88077bg(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static void m88076bg(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C7681bg.m88069bg(context).mo88070bg().m88082bg(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
