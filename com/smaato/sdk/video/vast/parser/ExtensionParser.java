package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C27733b;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class ExtensionParser implements XmlClassParser<Extension> {
    private static final String[] VAST_EXTENSIONS_TAGS = {"AdVerifications"};

    public static /* synthetic */ void lambda$parse$0(Extension.Builder builder, List list, ParseResult parseResult) {
        Result result = parseResult.value;
        if (result != 0) {
            builder.setAdVerifications((List) result);
        }
        List<ParseError> list2 = parseResult.errors;
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull(list2, new C27733b(list));
    }

    public static /* synthetic */ void lambda$parse$1(RegistryXmlParser registryXmlParser, final Extension.Builder builder, final List list, String str) {
        if ("AdVerifications".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("AdVerifications", new NonNullConsumer() { // from class: com.smaato.sdk.video.vast.parser.r1
                @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
                public final void accept(Object obj) {
                    ExtensionParser.lambda$parse$0(builder, list, (ParseResult) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$parse$2(List list, Exception exc) {
        list.add(ParseError.buildFrom(Extension.NAME, new Exception("Unable to parse tags in Extension")));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<Extension> parse(@NonNull final RegistryXmlParser registryXmlParser) {
        final Extension.Builder builder = new Extension.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("type", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.s1
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setType((String) obj);
            }
        }, new C27744b(arrayList)).parseTags(VAST_EXTENSIONS_TAGS, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.t1
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ExtensionParser.lambda$parse$1(RegistryXmlParser.this, builder, arrayList, (String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.u1
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ExtensionParser.lambda$parse$2(arrayList, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
