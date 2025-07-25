package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class JavaScriptResourceParser implements XmlClassParser<JavaScriptResource> {
    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom("uri", new Exception("Unable to parse URI value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<JavaScriptResource> parse(@NonNull RegistryXmlParser registryXmlParser) {
        JavaScriptResource javaScriptResource;
        final JavaScriptResource.Builder builder = new JavaScriptResource.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("apiFramework", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.h3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setApiFramework((String) obj);
            }
        }, new C27744b(arrayList)).parseStringAttribute(JavaScriptResource.BROWSER_OPTIONAL, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.i3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setBrowserOptional((String) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.j3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setUri((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.k3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                JavaScriptResourceParser.lambda$parse$0(arrayList, (Exception) obj);
            }
        });
        try {
            javaScriptResource = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("JavaScriptResource", e));
            javaScriptResource = null;
        }
        return new ParseResult.Builder().setResult(javaScriptResource).setErrors(arrayList).build();
    }
}
