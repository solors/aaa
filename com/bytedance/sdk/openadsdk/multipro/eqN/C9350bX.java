package com.bytedance.sdk.openadsdk.multipro.eqN;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.eqN.bX */
/* loaded from: classes3.dex */
public class C9350bX implements InterfaceC9345bg {

    /* renamed from: bg */
    private Context f20868bg;

    /* renamed from: IL */
    private Context m83007IL() {
        Context context = this.f20868bg;
        if (context == null) {
            return C8838VzQ.m84740bg();
        }
        return context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    @NonNull
    /* renamed from: bg */
    public String mo82970bg() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Cursor mo82964bg(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> m83017bX;
        if (!uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[2].equals("get_all") || (m83017bX = C9349IL.m83017bX(m83007IL(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : m83017bX.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = m83017bX.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public String mo82968bg(@NonNull Uri uri) {
        String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return String.valueOf(C9349IL.m83015bg(C8838VzQ.m84740bg(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return C9349IL.m83013bg(m83007IL(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Uri mo82967bg(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            C9349IL.m83014bg(m83007IL(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82965bg(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        if (split[2].equals("clean")) {
            C9349IL.m83021IL(m83007IL(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (C9349IL.m83015bg(m83007IL(), uri.getQueryParameter("sp_file_name"), str2)) {
            C9349IL.m83020IL(m83007IL(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82966bg(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        mo82967bg(uri, contentValues);
        return 0;
    }
}
