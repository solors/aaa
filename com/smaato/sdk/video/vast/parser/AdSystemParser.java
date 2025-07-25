package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.model.AdSystem;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class AdSystemParser implements XmlClassParser<AdSystem> {
    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom("AdSystem", new Exception("Unable to parse AdServer name value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<AdSystem> parse(@NonNull RegistryXmlParser registryXmlParser) {
        final AdSystem.Builder builder = new AdSystem.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("version", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.n
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setVersion((String) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.o
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setServerName((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.p
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                AdSystemParser.lambda$parse$0(arrayList, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
