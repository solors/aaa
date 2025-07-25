package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ye */
/* loaded from: classes9.dex */
public final class C35040ye implements InterfaceC33886F5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC33886F5, kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a */
    public final C33969Ie invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            AbstractC35018xi.m20774a("Tracking id is empty", new Object[0]);
            return null;
        } else if (ParseUtils.parseLong(asString) == null) {
            AbstractC35018xi.m20774a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        } else {
            try {
                String asString2 = contentValues.getAsString("additional_params");
                if (TextUtils.isEmpty(asString2)) {
                    AbstractC35018xi.m20774a("No additional params", new Object[0]);
                    return null;
                }
                JSONObject jSONObject = new JSONObject(asString2);
                if (jSONObject.length() == 0) {
                    AbstractC35018xi.m20774a("Additional params are empty", new Object[0]);
                    return null;
                }
                AbstractC35018xi.m20774a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
                return new C33969Ie(asString, jSONObject, true, false, EnumC34154Q7.f93392e);
            } catch (Throwable th) {
                ImportantLogger importantLogger = ImportantLogger.INSTANCE;
                importantLogger.info("AppMetrica-Attribution", String.format("Could not parse additional parameters", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                return null;
            }
        }
    }
}
