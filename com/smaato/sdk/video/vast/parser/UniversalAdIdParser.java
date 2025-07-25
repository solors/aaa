package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class UniversalAdIdParser implements XmlClassParser<UniversalAdId> {
    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom("UniversalAdId", new Exception("Unable to parse UniversalAdId value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<UniversalAdId> parse(@NonNull RegistryXmlParser registryXmlParser) {
        final UniversalAdId.Builder builder = new UniversalAdId.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute(UniversalAdId.ID_REGISTRY, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.g5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setIdRegistry((String) obj);
            }
        }, new C27744b(arrayList)).parseStringAttribute(UniversalAdId.ID_VALUE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.h5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setIdValue((String) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.i5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setValue((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.j5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                UniversalAdIdParser.lambda$parse$0(arrayList, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
