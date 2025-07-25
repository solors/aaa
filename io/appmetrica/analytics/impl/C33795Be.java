package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Be */
/* loaded from: classes9.dex */
public final class C33795Be implements InterfaceC34728mi {

    /* renamed from: a */
    public final Context f92614a;

    /* renamed from: b */
    public final String f92615b = "content://" + m22757a() + "/preload_info";

    /* renamed from: c */
    public final String f92616c = "tracking_id";

    /* renamed from: d */
    public final String f92617d = "additional_parameters";

    public C33795Be(@NotNull Context context) {
        this.f92614a = context;
    }

    @NotNull
    /* renamed from: a */
    public final String m22757a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34728mi, kotlin.jvm.functions.Functions
    @Nullable
    /* renamed from: b */
    public final C33969Ie invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f92614a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC35018xi.m20774a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f92614a.getContentResolver().query(Uri.parse(this.f92615b), null, null, null, null);
            try {
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f92616c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f92617d));
                        if (string2 != null && string2.length() != 0) {
                            jSONObject = new JSONObject(string2);
                            if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                AbstractC35018xi.m20774a("Tracking id from Satellite is not a number.", new Object[0]);
                            }
                            AbstractC35018xi.m20774a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                            C33969Ie c33969Ie = new C33969Ie(string, jSONObject, !TextUtils.isEmpty(string), false, EnumC34154Q7.f93391d);
                            AbstractC34679kn.m21474a(cursor);
                            return c33969Ie;
                        }
                        jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC35018xi.m20774a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC35018xi.m20774a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C33969Ie c33969Ie2 = new C33969Ie(string, jSONObject, !TextUtils.isEmpty(string), false, EnumC34154Q7.f93391d);
                        AbstractC34679kn.m21474a(cursor);
                        return c33969Ie2;
                    }
                    AbstractC35018xi.m20774a("No Preload Info data in Satellite content provider", new Object[0]);
                } else {
                    AbstractC35018xi.m20774a("No Satellite content provider found", new Object[0]);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        AbstractC34679kn.m21474a(cursor);
        return null;
    }
}
