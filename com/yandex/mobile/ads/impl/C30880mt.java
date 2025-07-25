package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.mt */
/* loaded from: classes8.dex */
public final class C30880mt<T> implements ff2<T> {
    @NotNull

    /* renamed from: a */
    private final ff2<T> f82349a;
    @NotNull

    /* renamed from: b */
    private final gf2 f82350b;

    public C30880mt(@NotNull e60 xmlElementParser, @NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlElementParser, "xmlElementParser");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f82349a = xmlElementParser;
        this.f82350b = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    @Nullable
    /* renamed from: a */
    public final T mo28797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f82350b.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        T t = null;
        parser.require(2, null, "CreativeExtension");
        while (true) {
            this.f82350b.getClass();
            if (gf2.m33837a(parser)) {
                this.f82350b.getClass();
                if (gf2.m33836b(parser)) {
                    t = this.f82349a.mo28797a(parser);
                }
            } else {
                return t;
            }
        }
    }
}
