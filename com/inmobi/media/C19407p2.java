package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.commons.core.configs.Config;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.p2 */
/* loaded from: classes6.dex */
public final class C19407p2 extends AbstractC19518x1 {
    public C19407p2() {
        super("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        String asString2 = contentValues.getAsString("account_id");
        Long asLong = contentValues.getAsLong("update_ts");
        C19267f2 c19267f2 = Config.Companion;
        String asString3 = contentValues.getAsString("config_type");
        Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
        JSONObject jSONObject = new JSONObject(asString);
        Intrinsics.m17074g(asLong);
        long longValue = asLong.longValue();
        c19267f2.getClass();
        return C19267f2.m60362a(asString3, jSONObject, asString2, longValue);
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        Config config = (Config) obj;
        Intrinsics.checkNotNullParameter(config, "config");
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", config.getAccountId$media_release());
        contentValues.put("config_value", config.toJson().toString());
        contentValues.put("config_type", config.getType());
        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
        return contentValues;
    }

    /* renamed from: b */
    public final boolean m59976b(String type, String accountId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        boolean z = false;
        try {
            z = !C19080R2.m60747b(this.f48862a, null, "account_id=? AND config_type=?", new String[]{accountId, type}, null, null, null, null).isEmpty();
        } catch (Exception unused) {
        }
        return !z;
    }

    /* renamed from: a */
    public final long m59977a(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        String[] strArr = {str, type};
        C19393o2 transform = C19393o2.f48556a;
        Intrinsics.checkNotNullParameter(transform, "transform");
        Object obj = null;
        try {
            List<ContentValues> m60747b = C19080R2.m60747b(this.f48862a, null, "account_id=? AND config_type=?", strArr, null, null, null, null);
            if (true ^ m60747b.isEmpty()) {
                obj = transform.invoke(m60747b.get(0));
            }
        } catch (Exception unused) {
        }
        Long l = (Long) obj;
        long longValue = l != null ? l.longValue() : 0L;
        Intrinsics.checkNotNullExpressionValue("p2", "TAG");
        return longValue;
    }
}
