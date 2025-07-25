package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.wa */
/* loaded from: classes9.dex */
public final class CallableC34984wa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C35010xa f95544a;

    public CallableC34984wa(C35010xa c35010xa) {
        this.f95544a = c35010xa;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f95544a.f95594a.getContentResolver();
        C35010xa c35010xa = this.f95544a;
        c35010xa.f95595b = contentResolver.query(parse, null, null, new String[]{c35010xa.f95594a.getPackageName()}, null);
        Cursor cursor = this.f95544a.f95595b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f95544a.f95595b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C33896Ff(string, this.f95544a.f95595b.getLong(1), this.f95544a.f95595b.getLong(2), EnumC33871Ef.f92794d);
            }
        }
        return null;
    }
}
