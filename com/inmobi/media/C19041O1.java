package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.O1 */
/* loaded from: classes6.dex */
public final class C19041O1 extends AbstractC19518x1 {
    public C19041O1() {
        super("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
        Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
        String asString2 = contentValues.getAsString("track_extras");
        HashMap hashMap = new HashMap();
        if (asString2 != null) {
            try {
                hashMap.putAll(m60834a(new JSONObject(asString2)));
            } catch (JSONException unused) {
                Intrinsics.checkNotNullExpressionValue("O1", "TAG");
            } catch (Exception unused2) {
                Intrinsics.checkNotNullExpressionValue("O1", "TAG");
            }
        }
        Intrinsics.m17074g(asInteger);
        int intValue = asInteger.intValue();
        Intrinsics.m17074g(asString);
        Intrinsics.m17074g(asBoolean);
        boolean booleanValue = asBoolean.booleanValue();
        Intrinsics.m17074g(asBoolean2);
        boolean booleanValue2 = asBoolean2.booleanValue();
        Intrinsics.m17074g(asInteger2);
        int intValue2 = asInteger2.intValue();
        Intrinsics.m17074g(asLong);
        long longValue = asLong.longValue();
        Intrinsics.m17074g(asLong2);
        return new C19028N1(intValue, asString, hashMap, booleanValue, booleanValue2, intValue2, longValue, asLong2.longValue());
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        C19028N1 click = (C19028N1) obj;
        Intrinsics.checkNotNullParameter(click, "click");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(click.f47539a));
        contentValues.put("url", click.f47540b);
        contentValues.put("pending_attempts", Integer.valueOf(click.f47544f));
        contentValues.put("ts", Long.valueOf(click.f47545g));
        contentValues.put("created_ts", Long.valueOf(click.f47546h));
        contentValues.put("follow_redirect", Boolean.valueOf(click.f47542d));
        contentValues.put("ping_in_webview", Boolean.valueOf(click.f47543e));
        Map map = click.f47541c;
        if (map != null && !map.isEmpty()) {
            Map map2 = click.f47541c;
            Intrinsics.m17073h(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            contentValues.put("track_extras", new JSONObject(map2).toString());
        }
        return contentValues;
    }

    /* renamed from: a */
    public final ArrayList m60835a(int i, int i2) {
        if (AbstractC19518x1.m59595a((AbstractC19518x1) this) == 0) {
            return new ArrayList();
        }
        Integer valueOf = -1 == i ? null : Integer.valueOf(i);
        ArrayList<C19028N1> m59594a = AbstractC19518x1.m59594a(this, null, null, "ts", "ts < " + (System.currentTimeMillis() - i2), "ts ASC ", valueOf, 3);
        ArrayList arrayList = new ArrayList();
        for (C19028N1 c19028n1 : m59594a) {
            if (c19028n1 != null) {
                arrayList.add(c19028n1);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static HashMap m60834a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.m17074g(next);
            Object obj = jSONObject.get(next);
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.String");
            hashMap.put(next, (String) obj);
        }
        return hashMap;
    }
}
