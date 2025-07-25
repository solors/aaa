package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class StaticResourceParser implements XmlClassParser<StaticResource> {
    private static final CheckedFunction<String, StaticResource.CreativeType> creativeTypeParsingFunction = new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.x4
        @Override // com.smaato.sdk.video.p577fi.CheckedFunction
        public final Object apply(Object obj) {
            StaticResource.CreativeType lambda$static$0;
            lambda$static$0 = StaticResourceParser.lambda$static$0((String) obj);
            return lambda$static$0;
        }
    };

    public static /* synthetic */ void lambda$parse$1(List list, Exception exc) {
        list.add(ParseError.buildFrom("StaticResource", new Exception("Unable to parse StaticResource uri", exc)));
    }

    public static /* synthetic */ StaticResource.CreativeType lambda$static$0(String str) throws Exception {
        return (StaticResource.CreativeType) Objects.requireNonNull(StaticResource.CreativeType.parse(str));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<StaticResource> parse(@NonNull RegistryXmlParser registryXmlParser) {
        StaticResource staticResource;
        final StaticResource.Builder builder = new StaticResource.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseTypedAttribute("creativeType", creativeTypeParsingFunction, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.y4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setCreativeType((StaticResource.CreativeType) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.z4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setUri((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.a5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                StaticResourceParser.lambda$parse$1(arrayList, (Exception) obj);
            }
        });
        try {
            staticResource = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("StaticResource", e));
            staticResource = null;
        }
        return new ParseResult.Builder().setResult(staticResource).setErrors(arrayList).build();
    }
}
