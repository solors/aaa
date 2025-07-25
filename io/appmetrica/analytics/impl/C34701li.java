package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.li */
/* loaded from: classes9.dex */
public final class C34701li implements InterfaceC34728mi {

    /* renamed from: a */
    public final Context f94867a;

    /* renamed from: b */
    public final String f94868b = "content://" + m21415a() + "/clids";

    /* renamed from: c */
    public final String f94869c = "clid_key";

    /* renamed from: d */
    public final String f94870d = "clid_value";

    public C34701li(@NotNull Context context) {
        this.f94867a = context;
    }

    @NotNull
    /* renamed from: a */
    public final String m21415a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34728mi, kotlin.jvm.functions.Functions
    @Nullable
    /* renamed from: b */
    public final C33982J3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f94867a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC35018xi.m20774a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f94867a.getContentResolver().query(Uri.parse(this.f94868b), null, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            try {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                return null;
            } finally {
                AbstractC34679kn.m21474a(cursor);
            }
        }
        if (cursor != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f94869c));
                    String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f94870d));
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        linkedHashMap.put(string, string2);
                    } else {
                        AbstractC35018xi.m20774a("Invalid clid {%s : %s}", string, string2);
                    }
                } catch (Throwable unused) {
                }
            }
            AbstractC35018xi.m20774a("Clids from satellite: %s", linkedHashMap);
            return new C33982J3(linkedHashMap, EnumC34154Q7.f93391d);
        }
        AbstractC35018xi.m20774a("No Satellite content provider found", new Object[0]);
        return null;
    }
}
