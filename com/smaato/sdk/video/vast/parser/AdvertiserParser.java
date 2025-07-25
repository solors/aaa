package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.model.Advertiser;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.video.vast.parser.u */
/* loaded from: classes7.dex */
class AdvertiserParser implements XmlClassParser<Advertiser> {
    /* renamed from: d */
    public static /* synthetic */ void m38769d(List list, Exception exc) {
        list.add(ParseError.buildFrom("Advertiser", new Exception("Unable to parse Advertiser name value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<Advertiser> parse(@NonNull RegistryXmlParser registryXmlParser) {
        final Advertiser.Builder builder = new Advertiser.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.q
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setId((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.r
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                AdvertiserParser.m38770c((ParseError) obj);
            }
        }).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.s
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setName((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.t
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                AdvertiserParser.m38769d(arrayList, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    /* renamed from: c */
    public static /* synthetic */ void m38770c(ParseError parseError) {
    }
}
