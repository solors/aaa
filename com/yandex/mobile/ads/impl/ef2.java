package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class ef2<T> implements ff2<List<? extends T>> {
    @NotNull

    /* renamed from: a */
    private final ff2<T> f78539a;
    @NotNull

    /* renamed from: b */
    private final String f78540b;
    @NotNull

    /* renamed from: c */
    private final String f78541c;
    @NotNull

    /* renamed from: d */
    private final gf2 f78542d;

    public /* synthetic */ ef2(ff2 ff2Var, String str, String str2) {
        this(ff2Var, str, str2, new gf2());
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    @NotNull
    /* renamed from: b */
    public final ArrayList mo28797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        ArrayList arrayList = new ArrayList();
        gf2 gf2Var = this.f78542d;
        String str = this.f78540b;
        gf2Var.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, str);
        while (true) {
            this.f78542d.getClass();
            if (gf2.m33837a(parser)) {
                this.f78542d.getClass();
                if (gf2.m33836b(parser)) {
                    if (Intrinsics.m17075f(this.f78541c, parser.getName())) {
                        T mo28797a = this.f78539a.mo28797a(parser);
                        if (mo28797a != null) {
                            arrayList.add(mo28797a);
                        }
                    } else {
                        this.f78542d.getClass();
                        gf2.m33834d(parser);
                    }
                }
            } else {
                return arrayList;
            }
        }
    }

    public ef2(@NotNull ff2<T> xmlElementParser, @NotNull String elementsArrayTag, @NotNull String elementTag, @NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlElementParser, "xmlElementParser");
        Intrinsics.checkNotNullParameter(elementsArrayTag, "elementsArrayTag");
        Intrinsics.checkNotNullParameter(elementTag, "elementTag");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f78539a = xmlElementParser;
        this.f78540b = elementsArrayTag;
        this.f78541c = elementTag;
        this.f78542d = xmlHelper;
    }
}
