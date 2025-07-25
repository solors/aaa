package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.AdParameters;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class AdParametersParser implements XmlClassParser<AdParameters> {
    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom("AdParameters", new Exception("Unable to parse AdParameters body", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<AdParameters> parse(@NonNull RegistryXmlParser registryXmlParser) {
        AdParameters adParameters;
        final AdParameters.Builder builder = new AdParameters.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseBooleanAttribute(AdParameters.XML_ENCODED, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setXmlEncoded((Boolean) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.c
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setParameters((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.d
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                AdParametersParser.lambda$parse$0(arrayList, (Exception) obj);
            }
        });
        try {
            adParameters = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("AdParameters", e));
            adParameters = null;
        }
        return new ParseResult.Builder().setResult(adParameters).setErrors(arrayList).build();
    }
}
