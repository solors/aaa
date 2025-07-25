package com.yandex.mobile.ads.impl;

import android.util.Xml;
import com.monetization.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class sc2 {
    @NotNull

    /* renamed from: a */
    private final gf2 f85172a;
    @NotNull

    /* renamed from: b */
    private final m50 f85173b;
    @NotNull

    /* renamed from: c */
    private final C30765l2 f85174c;
    @NotNull

    /* renamed from: d */
    private final C31717w2 f85175d;
    @NotNull

    /* renamed from: e */
    private final C30689k2 f85176e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ sc2() {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.gf2 r1 = new com.yandex.mobile.ads.impl.gf2
            r1.<init>()
            com.yandex.mobile.ads.impl.m50 r2 = new com.yandex.mobile.ads.impl.m50
            r2.<init>(r1)
            com.yandex.mobile.ads.impl.l2 r3 = new com.yandex.mobile.ads.impl.l2
            r3.<init>(r1, r2)
            com.yandex.mobile.ads.impl.w2 r4 = new com.yandex.mobile.ads.impl.w2
            r4.<init>()
            com.yandex.mobile.ads.impl.k2 r5 = new com.yandex.mobile.ads.impl.k2
            r5.<init>()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sc2.<init>():void");
    }

    @NotNull
    /* renamed from: a */
    public final qc2 m29645a(@NotNull String data) throws IOException, XmlPullParserException, rc2, JSONException {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        Intrinsics.checkNotNullParameter(data, "data");
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        parser.setInput(new StringReader(data));
        parser.nextTag();
        Intrinsics.m17074g(parser);
        this.f85172a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        String str3 = null;
        parser.require(2, null, "VMAP");
        ArrayList adBreaks = new ArrayList();
        ArrayList extensions = new ArrayList();
        String version = parser.getAttributeValue(null, "version");
        while (true) {
            this.f85172a.getClass();
            if (!gf2.m33837a(parser)) {
                break;
            }
            this.f85172a.getClass();
            if (gf2.m33836b(parser)) {
                String name = parser.getName();
                if (Intrinsics.m17075f("AdBreak", name)) {
                    C30530i2 m32366a = this.f85174c.m32366a(parser);
                    if (m32366a != null) {
                        adBreaks.add(m32366a);
                    }
                } else if (Intrinsics.m17075f("Extensions", name)) {
                    extensions.addAll(this.f85173b.m32092a(parser));
                } else {
                    this.f85172a.getClass();
                    gf2.m33834d(parser);
                }
            }
        }
        if (version != null && version.length() != 0) {
            this.f85176e.getClass();
            Intrinsics.checkNotNullParameter(extensions, "extensions");
            Iterator it = extensions.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.m17075f(((i50) obj).m33365a(), "PageID")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            i50 i50Var = (i50) obj;
            if (i50Var != null) {
                str = i50Var.m33364b();
            } else {
                str = null;
            }
            Iterator it2 = extensions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Intrinsics.m17075f(((i50) obj2).m33365a(), "CategoryID")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            i50 i50Var2 = (i50) obj2;
            if (i50Var2 != null) {
                str2 = i50Var2.m33364b();
            } else {
                str2 = null;
            }
            Iterator it3 = extensions.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj3 = it3.next();
                    if (Intrinsics.m17075f(((i50) obj3).m33365a(), "SessionID")) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            i50 i50Var3 = (i50) obj3;
            if (i50Var3 != null) {
                str3 = i50Var3.m33364b();
            }
            AdBreakParameters adBreakParameters = new AdBreakParameters(str, str2, str3);
            this.f85175d.getClass();
            Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
            Intrinsics.checkNotNullParameter(adBreakParameters, "adBreakParameters");
            Iterator it4 = adBreaks.iterator();
            while (it4.hasNext()) {
                ((C30530i2) it4.next()).m33389a(adBreakParameters);
            }
            Intrinsics.m17074g(version);
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
            Intrinsics.checkNotNullParameter(extensions, "extensions");
            return new qc2(version, adBreaks, extensions);
        }
        throw new rc2();
    }

    public sc2(@NotNull gf2 mXmlHelper, @NotNull m50 extensionsParser, @NotNull C30765l2 adBreakParser, @NotNull C31717w2 adBreaksConfigurator, @NotNull C30689k2 adBreakParametersCreator) {
        Intrinsics.checkNotNullParameter(mXmlHelper, "mXmlHelper");
        Intrinsics.checkNotNullParameter(extensionsParser, "extensionsParser");
        Intrinsics.checkNotNullParameter(adBreakParser, "adBreakParser");
        Intrinsics.checkNotNullParameter(adBreaksConfigurator, "adBreaksConfigurator");
        Intrinsics.checkNotNullParameter(adBreakParametersCreator, "adBreakParametersCreator");
        this.f85172a = mXmlHelper;
        this.f85173b = extensionsParser;
        this.f85174c = adBreakParser;
        this.f85175d = adBreaksConfigurator;
        this.f85176e = adBreakParametersCreator;
    }
}
