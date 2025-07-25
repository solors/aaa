package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class TrackingParser implements XmlClassParser<Tracking> {
    private static final CheckedFunction<String, VastEvent> eventParsingFunction = new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.f5
        @Override // com.smaato.sdk.video.p577fi.CheckedFunction
        public final Object apply(Object obj) {
            VastEvent lambda$static$0;
            lambda$static$0 = TrackingParser.lambda$static$0((String) obj);
            return lambda$static$0;
        }
    };

    public static /* synthetic */ void lambda$parse$1(List list, Exception exc) {
        list.add(ParseError.buildFrom("url", new Exception("Unable to parse URL value", exc)));
    }

    public static /* synthetic */ VastEvent lambda$static$0(String str) throws Exception {
        return (VastEvent) Objects.requireNonNull(VastEvent.parse(str));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<Tracking> parse(@NonNull RegistryXmlParser registryXmlParser) {
        Tracking tracking;
        final Tracking.Builder builder = new Tracking.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseTypedAttribute("event", eventParsingFunction, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.b5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setVastEvent((VastEvent) obj);
            }
        }, new C27744b(arrayList)).parseStringAttribute("offset", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.c5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setOffset((String) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.d5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setUrl((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.e5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                TrackingParser.lambda$parse$1(arrayList, (Exception) obj);
            }
        });
        try {
            tracking = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(Tracking.NAME, e));
            tracking = null;
        }
        return new ParseResult.Builder().setResult(tracking).setErrors(arrayList).build();
    }
}
