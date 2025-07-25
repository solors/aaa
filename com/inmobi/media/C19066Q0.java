package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Q0 */
/* loaded from: classes6.dex */
public final class C19066Q0 extends AbstractC19518x1 {
    public C19066Q0() {
        super("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        String asString2 = contentValues.getAsString("disk_uri");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Long asLong3 = contentValues.getAsLong("ttl");
        Long asLong4 = contentValues.getAsLong("soft_ttl");
        Intrinsics.m17074g(asInteger);
        int intValue = asInteger.intValue();
        Intrinsics.m17074g(asString);
        Intrinsics.m17074g(asInteger2);
        int intValue2 = asInteger2.intValue();
        Intrinsics.m17074g(asLong);
        long longValue = asLong.longValue();
        Intrinsics.m17074g(asLong2);
        long longValue2 = asLong2.longValue();
        Intrinsics.m17074g(asLong3);
        long longValue3 = asLong3.longValue();
        Intrinsics.m17074g(asLong4);
        return new C19320j(intValue, asString, asString2, intValue2, longValue, longValue2, longValue3, asLong4.longValue());
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        C19320j adAsset = (C19320j) obj;
        Intrinsics.checkNotNullParameter(adAsset, "adAsset");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(adAsset.f48371a));
        contentValues.put("url", adAsset.f48372b);
        contentValues.put("disk_uri", adAsset.f48373c);
        contentValues.put("pending_attempts", Integer.valueOf(adAsset.f48374d));
        contentValues.put("ts", String.valueOf(adAsset.f48375e));
        contentValues.put("created_ts", String.valueOf(adAsset.f48376f));
        contentValues.put("ttl", String.valueOf(adAsset.f48377g));
        contentValues.put("soft_ttl", String.valueOf(adAsset.f48378h));
        return contentValues;
    }

    /* renamed from: a */
    public final ArrayList m60804a() {
        ArrayList m59594a = AbstractC19518x1.m59594a(this, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m59594a) {
            C19320j c19320j = (C19320j) obj;
            if (c19320j != null && c19320j.m60220a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19320j c19320j2 = (C19320j) it.next();
            if (c19320j2 != null) {
                arrayList2.add(c19320j2);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public final ArrayList m60801b() {
        ArrayList m59594a = AbstractC19518x1.m59594a(this, null, null, null, null, "ts ASC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m59594a) {
            C19320j c19320j = (C19320j) obj;
            if (c19320j != null && !c19320j.m60220a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19320j c19320j2 = (C19320j) it.next();
            if (c19320j2 != null) {
                arrayList2.add(c19320j2);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final C19320j m60802a(String remoteUrl) {
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        ArrayList m59594a = AbstractC19518x1.m59594a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (m59594a.isEmpty()) {
            return null;
        }
        return (C19320j) m59594a.get(0);
    }

    /* renamed from: b */
    public final C19320j m60800b(String remoteUrl) {
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        ArrayList m59594a = AbstractC19518x1.m59594a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (m59594a.isEmpty()) {
            return null;
        }
        return (C19320j) m59594a.get(0);
    }

    /* renamed from: a */
    public final void m60803a(C19320j asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        m59590b(asset, "url = ?", new String[]{asset.f48372b.toString()});
    }
}
