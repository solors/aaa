package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class VastBeaconParser implements XmlClassParser<VastBeacon> {
    @NonNull
    private final String elementName;

    public VastBeaconParser(@NonNull String str) {
        this.elementName = str;
    }

    public /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom(this.elementName, new Exception("Unable to parse UniversalAdId value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<VastBeacon> parse(@NonNull RegistryXmlParser registryXmlParser) {
        VastBeacon vastBeacon;
        final VastBeacon.Builder builder = new VastBeacon.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute("id", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.k5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setId((String) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.l5
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setUri((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.m5
            {
                VastBeaconParser.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                VastBeaconParser.this.lambda$parse$0(arrayList, (Exception) obj);
            }
        });
        try {
            vastBeacon = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(this.elementName, e));
            vastBeacon = null;
        }
        return new ParseResult.Builder().setResult(vastBeacon).setErrors(arrayList).build();
    }
}
