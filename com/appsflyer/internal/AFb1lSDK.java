package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.internal.AttributionIdentifiers;
import com.ironsource.C21018tj;

/* loaded from: classes2.dex */
final class AFb1lSDK extends AFd1zSDK<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AFb1lSDK(Context context, AFd1fSDK aFd1fSDK) {
        super(context, aFd1fSDK, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1zSDK
    /* renamed from: AFInAppEventParameterName */
    public String values() {
        Cursor cursor;
        Throwable th;
        try {
            ContentResolver contentResolver = this.AFKeystoreWrapper.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.AFInAppEventParameterName);
            cursor = contentResolver.query(Uri.parse(sb2.toString()), new String[]{C21018tj.f53565b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(C21018tj.f53565b));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    @Nullable
    public final String AFInAppEventType() {
        this.values.AFKeystoreWrapper().execute(this.AFInAppEventType);
        return (String) super.valueOf();
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @Nullable
    public final /* synthetic */ String valueOf() {
        this.values.AFKeystoreWrapper().execute(this.AFInAppEventType);
        return (String) super.valueOf();
    }
}
