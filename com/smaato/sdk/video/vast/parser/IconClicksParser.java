package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C27733b;
import com.smaato.sdk.video.vast.model.IconClicks;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class IconClicksParser implements XmlClassParser<IconClicks> {
    private static final String[] ICON_CLICKS_TAGS = {"IconClickThrough", "IconClickTracking"};

    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom("IconClickThrough", new Exception("Unable to parse IconClickThrough value", exc)));
    }

    public static /* synthetic */ void lambda$parse$1(List list, List list2, ParseResult parseResult) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull((VastBeacon) parseResult.value, new C27930y0(list));
        List<ParseError> list3 = parseResult.errors;
        Objects.requireNonNull(list2);
        com.smaato.sdk.core.util.Objects.onNotNull(list3, new C27733b(list2));
    }

    public static /* synthetic */ void lambda$parse$2(RegistryXmlParser registryXmlParser, final IconClicks.Builder builder, final List list, final List list2, String str) {
        if (str.equalsIgnoreCase("IconClickThrough")) {
            Objects.requireNonNull(builder);
            registryXmlParser.parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.x1
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    builder.setIconClickThrough((String) obj);
                }
            }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.y1
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    IconClicksParser.lambda$parse$0(list, (Exception) obj);
                }
            });
        } else if (str.equalsIgnoreCase("IconClickTracking")) {
            registryXmlParser.parseClass("IconClickTracking", new NonNullConsumer() { // from class: com.smaato.sdk.video.vast.parser.z1
                @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
                public final void accept(Object obj) {
                    IconClicksParser.lambda$parse$1(list2, list, (ParseResult) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$parse$3(List list, Exception exc) {
        list.add(ParseError.buildFrom("IconClicks", new Exception("Unable to parse IconClicks value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<IconClicks> parse(@NonNull final RegistryXmlParser registryXmlParser) {
        final IconClicks.Builder builder = new IconClicks.Builder();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        builder.setIconClickTrackings(arrayList2);
        registryXmlParser.parseTags(ICON_CLICKS_TAGS, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.v1
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                IconClicksParser.lambda$parse$2(RegistryXmlParser.this, builder, arrayList, arrayList2, (String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.w1
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                IconClicksParser.lambda$parse$3(arrayList, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
