package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.p577fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Delivery;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class MediaFileParser implements XmlClassParser<MediaFile> {
    private static final CheckedFunction<String, Delivery> deliveryParsingFunction = new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.f4
        @Override // com.smaato.sdk.video.p577fi.CheckedFunction
        public final Object apply(Object obj) {
            Delivery lambda$static$0;
            lambda$static$0 = MediaFileParser.lambda$static$0((String) obj);
            return lambda$static$0;
        }
    };

    public static /* synthetic */ void lambda$parse$4(List list, Exception exc) {
        list.add(ParseError.buildFrom("url", new Exception("Unable to parse URL value", exc)));
    }

    public static /* synthetic */ Delivery lambda$static$0(String str) throws Exception {
        return (Delivery) Objects.requireNonNull(Delivery.parse(str));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<MediaFile> parse(@NonNull RegistryXmlParser registryXmlParser) {
        MediaFile mediaFile;
        final MediaFile.Builder builder = new MediaFile.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.v3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setId((String) obj);
            }
        }, new C27744b(arrayList)).parseStringAttribute("type", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.b4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setType((String) obj);
            }
        }, new C27744b(arrayList)).parseFloatAttribute("width", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.c4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setWidth((Float) obj);
            }
        }, new C27744b(arrayList)).parseFloatAttribute("height", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.d4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setHeight((Float) obj);
            }
        }, new C27744b(arrayList)).parseStringAttribute(MediaFile.CODEC, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.e4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setCodec((String) obj);
            }
        }, new C27744b(arrayList)).parseIntegerAttribute(MediaFile.BITRATE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.g4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setBitrate((Integer) obj);
            }
        }, new C27744b(arrayList)).parseIntegerAttribute(MediaFile.MIN_BITRATE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.h4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setMinBitrate((Integer) obj);
            }
        }, new C27744b(arrayList)).parseIntegerAttribute(MediaFile.MAX_BITRATE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.i4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setMaxBitrate((Integer) obj);
            }
        }, new C27744b(arrayList)).parseBooleanAttribute(MediaFile.SCALABLE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.j4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setScalable((Boolean) obj);
            }
        }, new C27744b(arrayList)).parseBooleanAttribute(MediaFile.MAINTAIN_ASPECT_RATIO, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.k4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setMaintainAspectRatio((Boolean) obj);
            }
        }, new C27744b(arrayList)).parseStringAttribute("apiFramework", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.l4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setApiFramework((String) obj);
            }
        }, new C27744b(arrayList)).parseIntegerAttribute(MediaFile.FILE_SIZE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.m4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setFileSize((Integer) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.n4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                MediaFileParser.lambda$parse$1((ParseError) obj);
            }
        }).parseStringAttribute(MediaFile.MEDIA_TYPE, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.o4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setMediaType((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.w3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                MediaFileParser.lambda$parse$2((ParseError) obj);
            }
        }).parseTypedAttribute("delivery", deliveryParsingFunction, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.x3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setDelivery((Delivery) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.y3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                MediaFileParser.lambda$parse$3((ParseError) obj);
            }
        }).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.z3
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setUrl((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.a4
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                MediaFileParser.lambda$parse$4(arrayList, (Exception) obj);
            }
        });
        try {
            mediaFile = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(MediaFile.NAME, e));
            mediaFile = null;
        }
        return new ParseResult.Builder().setResult(mediaFile).setErrors(arrayList).build();
    }

    public static /* synthetic */ void lambda$parse$1(ParseError parseError) {
    }

    public static /* synthetic */ void lambda$parse$2(ParseError parseError) {
    }

    public static /* synthetic */ void lambda$parse$3(ParseError parseError) {
    }
}
