package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C27733b;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class ArrayXmlClassParser<Result> implements XmlClassParser<List<Result>> {
    @NonNull
    private final String arrayName;
    @NonNull
    private final String elementName;

    public ArrayXmlClassParser(@NonNull String str, @NonNull String str2) {
        this.arrayName = str;
        this.elementName = str2;
    }

    public static /* synthetic */ void lambda$parse$0(final List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull(result, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.v
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                list.add(obj);
            }
        });
        List<ParseError> list3 = parseResult.errors;
        Objects.requireNonNull(list2);
        com.smaato.sdk.core.util.Objects.onNotNull(list3, new C27733b(list2));
    }

    public /* synthetic */ void lambda$parse$1(RegistryXmlParser registryXmlParser, final List list, final List list2, String str) {
        registryXmlParser.parseClass(this.elementName, new NonNullConsumer() { // from class: com.smaato.sdk.video.vast.parser.y
            @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
            public final void accept(Object obj) {
                ArrayXmlClassParser.lambda$parse$0(list, list2, (ParseResult) obj);
            }
        });
    }

    public /* synthetic */ void lambda$parse$2(List list, Exception exc) {
        String str = this.arrayName;
        list.add(ParseError.buildFrom(str, new Exception("Unable to parse " + this.elementName + " elements in " + this.arrayName, exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<List<Result>> parse(@NonNull final RegistryXmlParser registryXmlParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        registryXmlParser.parseTags(new String[]{this.elementName}, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.w
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ArrayXmlClassParser.this.lambda$parse$1(registryXmlParser, arrayList, arrayList2, (String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.x
            {
                ArrayXmlClassParser.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ArrayXmlClassParser.this.lambda$parse$2(arrayList2, (Exception) obj);
            }
        });
        return (ParseResult<Result>) new ParseResult.Builder().setResult(arrayList).setErrors(arrayList2).build();
    }
}
