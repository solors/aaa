package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C27733b;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class VideoClicksParser implements XmlClassParser<VideoClicks> {
    private static final String[] VIDEO_CLICKS_PARSER = {VideoClicks.CLICK_THROUGH, VideoClicks.CLICK_TRACKING, VideoClicks.CUSTOM_CLICK};

    public static /* synthetic */ void lambda$parse$0(VideoClicks.Builder builder, List list, ParseResult parseResult) {
        builder.setClickThrough((VastBeacon) parseResult.value);
        List<ParseError> list2 = parseResult.errors;
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull(list2, new C27733b(list));
    }

    public static /* synthetic */ void lambda$parse$1(List list, List list2, ParseResult parseResult) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull((VastBeacon) parseResult.value, new C27930y0(list));
        List<ParseError> list3 = parseResult.errors;
        Objects.requireNonNull(list2);
        com.smaato.sdk.core.util.Objects.onNotNull(list3, new C27733b(list2));
    }

    public static /* synthetic */ void lambda$parse$2(List list, List list2, ParseResult parseResult) {
        Objects.requireNonNull(list);
        com.smaato.sdk.core.util.Objects.onNotNull((VastBeacon) parseResult.value, new C27930y0(list));
        List<ParseError> list3 = parseResult.errors;
        Objects.requireNonNull(list2);
        com.smaato.sdk.core.util.Objects.onNotNull(list3, new C27733b(list2));
    }

    public static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, final VideoClicks.Builder builder, final List list, final List list2, final List list3, String str) {
        if (str.equalsIgnoreCase(VideoClicks.CLICK_THROUGH)) {
            registryXmlParser.parseClass(VideoClicks.CLICK_THROUGH, new NonNullConsumer() { // from class: com.smaato.sdk.video.vast.parser.e6
                @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
                public final void accept(Object obj) {
                    VideoClicksParser.lambda$parse$0(builder, list, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase(VideoClicks.CLICK_TRACKING)) {
            registryXmlParser.parseClass(VideoClicks.CLICK_TRACKING, new NonNullConsumer() { // from class: com.smaato.sdk.video.vast.parser.f6
                @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
                public final void accept(Object obj) {
                    VideoClicksParser.lambda$parse$1(list2, list, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase(VideoClicks.CUSTOM_CLICK)) {
            registryXmlParser.parseClass(VideoClicks.CUSTOM_CLICK, new NonNullConsumer() { // from class: com.smaato.sdk.video.vast.parser.g6
                @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
                public final void accept(Object obj) {
                    VideoClicksParser.lambda$parse$2(list3, list, (ParseResult) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$parse$4(List list, Exception exc) {
        list.add(ParseError.buildFrom("VideoClicks", new Exception("Unable to parse tags in CompanionAds", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<VideoClicks> parse(@NonNull final RegistryXmlParser registryXmlParser) {
        final VideoClicks.Builder builder = new VideoClicks.Builder();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        builder.setClickTrackings(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        builder.setCustomClicks(arrayList3);
        registryXmlParser.parseTags(VIDEO_CLICKS_PARSER, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.c6
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                VideoClicksParser.lambda$parse$3(RegistryXmlParser.this, builder, arrayList, arrayList2, arrayList3, (String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.d6
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                VideoClicksParser.lambda$parse$4(arrayList, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
