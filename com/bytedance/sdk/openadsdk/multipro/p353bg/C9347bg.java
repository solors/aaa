package com.bytedance.sdk.openadsdk.multipro.p353bg;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C9099zx;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.multipro.C9348eqN;
import com.bytedance.sdk.openadsdk.multipro.aidl.C9330bg;
import com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.BinderC9341ldr;
import com.bytedance.sdk.openadsdk.utils.ayS;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.bg.bg */
/* loaded from: classes3.dex */
public class C9347bg {

    /* renamed from: IL */
    private static final ConcurrentHashMap<String, Object> f20863IL = new ConcurrentHashMap<>();

    /* renamed from: bg */
    public static InterfaceC7711ldr f20864bg;

    /* renamed from: bg */
    public static InterfaceC7711ldr m83029bg(Context context) {
        if (context == null) {
            try {
                C8838VzQ.m84740bg();
            } catch (Throwable unused) {
                ayS.m82490Kg("binder error");
            }
        }
        if (f20864bg == null) {
            if (C9307IL.m83088bX()) {
                f20864bg = InterfaceC7711ldr.AbstractBinderC7712bg.m87956bg(C9330bg.m83064bg().m83063bg(5));
            } else {
                f20864bg = BinderC9341ldr.m83051IL();
            }
        }
        return f20864bg;
    }

    /* renamed from: bg */
    private static String m83030bg() {
        return C9348eqN.f20865IL + "/t_db/ttopensdk.db/";
    }

    /* renamed from: bg */
    public static void m83028bg(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (m83023bg(str)) {
            if (!C9307IL.m83088bX()) {
                C9099zx.m83543bg(context).mo83544bg().m84357bg(str, (String) null, contentValues);
                return;
            }
            InterfaceC7711ldr m83029bg = m83029bg(context);
            if (m83029bg != null) {
                m83029bg.mo83049bg(Uri.parse(m83030bg() + str), contentValues);
            }
        }
    }

    /* renamed from: bg */
    public static int m83026bg(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (m83023bg(str)) {
            if (!C9307IL.m83088bX()) {
                return C9099zx.m83543bg(context).mo83544bg().m84356bg(str, str2, strArr);
            }
            InterfaceC7711ldr m83029bg = m83029bg(context);
            if (m83029bg != null) {
                return m83029bg.mo83047bg(Uri.parse(m83030bg() + str), str2, strArr);
            }
            return 0;
        }
    }

    /* renamed from: bg */
    public static int m83027bg(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (m83023bg(str)) {
                if (!C9307IL.m83088bX()) {
                    return C9099zx.m83543bg(context).mo83544bg().m84358bg(str, contentValues, str2, strArr);
                }
                InterfaceC7711ldr m83029bg = m83029bg(context);
                if (m83029bg != null) {
                    return m83029bg.mo83048bg(Uri.parse(m83030bg() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    /* renamed from: bg */
    public static Map<String, List<String>> m83025bg(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (m83023bg(str)) {
            if (!C9307IL.m83088bX()) {
                return m83024bg(C9099zx.m83543bg(context).mo83544bg().m84355bg(str, strArr, str2, strArr2, str3, str4, str5));
            }
            InterfaceC7711ldr m83029bg = m83029bg(context);
            if (m83029bg != null) {
                return m83029bg.mo83046bg(Uri.parse(m83030bg() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    /* renamed from: bg */
    public static Map<String, List<String>> m83024bg(Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
            } catch (Throwable unused) {
            }
            cursor.close();
        }
        return hashMap;
    }

    /* renamed from: bg */
    private static Object m83023bg(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = f20863IL;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 == null) {
            synchronized (C9347bg.class) {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            }
            return obj;
        }
        return obj2;
    }
}
