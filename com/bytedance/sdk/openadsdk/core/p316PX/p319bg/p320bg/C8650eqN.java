package com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p316PX.C8653eo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.Verification;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bg.bg.eqN */
/* loaded from: classes3.dex */
public class C8650eqN {
    /* renamed from: bg */
    public static Set<C8653eo> m85434bg(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C8653eo m85415bg;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (Verification.NAME.equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(C8651zx.f19089iR, Verification.VENDOR);
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() == 3 && Verification.NAME.equals(xmlPullParser.getName())) {
                            if (!TextUtils.isEmpty(str) && (m85415bg = C8653eo.m85415bg(CampaignEx.KEY_OMID, str, attributeValue, str2, str3)) != null) {
                                hashSet.add(m85415bg);
                            }
                        } else {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                char c = 65535;
                                switch (name.hashCode()) {
                                    case 1335132887:
                                        if (name.equals(Tracking.NAME)) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case 1561251035:
                                        if (name.equals("JavaScriptResource")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 1749252741:
                                        if (name.equals(Verification.VERIFICATION_PARAMETERS)) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(C8651zx.f19089iR, "event"))) {
                                            break;
                                        } else {
                                            str3 = C8651zx.m85432IL(xmlPullParser, Tracking.NAME);
                                            break;
                                        }
                                    case 1:
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(C8651zx.f19089iR, "apiFramework"))) {
                                            break;
                                        } else {
                                            str = C8651zx.m85432IL(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case 2:
                                        str2 = C8651zx.m85432IL(xmlPullParser, Verification.VERIFICATION_PARAMETERS);
                                        break;
                                }
                            }
                        }
                    }
                } else {
                    C8651zx.m85426bg(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
