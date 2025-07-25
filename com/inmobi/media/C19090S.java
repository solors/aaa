package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.S */
/* loaded from: classes6.dex */
public final class C19090S extends AbstractC19518x1 {

    /* renamed from: b */
    public InterfaceC19065Q f47672b;

    public C19090S() {
        super("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("image_location");
        String asString2 = contentValues.getAsString("beacon_url");
        String asString3 = contentValues.getAsString("sdk_model_result");
        String asString4 = contentValues.getAsString("extras");
        if ((asString2 != null && asString2.length() != 0) || (asString != null && asString.length() != 0)) {
            Intrinsics.m17074g(asString);
            Intrinsics.m17074g(asString2);
            return new AdQualityResult(asString, asString3, asString2, asString4);
        }
        String asString5 = contentValues.getAsString("id");
        Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
        m59591a("id=?", new String[]{asString5});
        return null;
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        AdQualityResult item = (AdQualityResult) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("image_location", item.getImageLocation());
        String sdkModelResult = item.getSdkModelResult();
        if (sdkModelResult == null) {
            sdkModelResult = "";
        }
        contentValues.put("sdk_model_result", sdkModelResult);
        contentValues.put("beacon_url", item.getBeaconUrl());
        contentValues.put("extras", item.getExtras());
        return contentValues;
    }

    /* renamed from: a */
    public final void m60726a(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Log.i("AdQualityDao", "queueing");
        m59593a((Object) result);
        InterfaceC19065Q interfaceC19065Q = this.f47672b;
        if (interfaceC19065Q != null) {
            Log.i("AdQualityDao", "sending callback - queued");
            C19026N c19026n = (C19026N) interfaceC19065Q;
            Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            Intrinsics.checkNotNullParameter("item update callback received", "message");
            Log.i("AdQualityBeaconExecutor", "item update callback received");
            if (c19026n.f47534c.get()) {
                Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                Intrinsics.checkNotNullParameter("resume executor", "message");
                Log.i("AdQualityBeaconExecutor", "resume executor");
                c19026n.f47534c.set(false);
                C18999L execute = new C18999L(c19026n);
                Intrinsics.checkNotNullParameter(execute, "execute");
                ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
                C19052P.m60823a(new C19222c(execute));
            }
        }
    }
}
