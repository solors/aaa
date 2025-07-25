package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class ViewableImpressionParser implements XmlClassParser<ViewableImpression> {
    private static final String[] VAST_VIEWABLE_IMPRESSION_TAGS = {ViewableImpression.VIEWABLE, ViewableImpression.NOT_VIEWABLE, ViewableImpression.VIEW_UNDETERMINED};

    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom(ViewableImpression.VIEWABLE, new Exception("Unable to parse ViewableImpression value", exc)));
    }

    public static /* synthetic */ void lambda$parse$1(List list, Exception exc) {
        list.add(ParseError.buildFrom(ViewableImpression.NOT_VIEWABLE, new Exception("Unable to parse NotViewableImpression value", exc)));
    }

    public static /* synthetic */ void lambda$parse$2(List list, Exception exc) {
        list.add(ParseError.buildFrom(ViewableImpression.VIEW_UNDETERMINED, new Exception("Unable to parse ViewUndetermined value", exc)));
    }

    public static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, List list, final List list2, List list3, List list4, String str) {
        if (ViewableImpression.VIEWABLE.equalsIgnoreCase(str)) {
            Objects.requireNonNull(list);
            registryXmlParser.parseString(new C27891t0(list), new Consumer() { // from class: com.smaato.sdk.video.vast.parser.h6
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ViewableImpressionParser.lambda$parse$0(list2, (Exception) obj);
                }
            });
        } else if (ViewableImpression.NOT_VIEWABLE.equalsIgnoreCase(str)) {
            Objects.requireNonNull(list3);
            registryXmlParser.parseString(new C27891t0(list3), new Consumer() { // from class: com.smaato.sdk.video.vast.parser.i6
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ViewableImpressionParser.lambda$parse$1(list2, (Exception) obj);
                }
            });
        } else if (ViewableImpression.VIEW_UNDETERMINED.equalsIgnoreCase(str)) {
            Objects.requireNonNull(list4);
            registryXmlParser.parseString(new C27891t0(list4), new Consumer() { // from class: com.smaato.sdk.video.vast.parser.j6
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ViewableImpressionParser.lambda$parse$2(list2, (Exception) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$parse$4(List list, Exception exc) {
        list.add(ParseError.buildFrom("ViewableImpression", new Exception("Unable to parse tags in ViewableImpression")));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<ViewableImpression> parse(@NonNull final RegistryXmlParser registryXmlParser) {
        final ViewableImpression.Builder builder = new ViewableImpression.Builder();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        builder.setViewable(arrayList);
        builder.setNotViewable(arrayList2);
        builder.setViewUndetermined(arrayList3);
        registryXmlParser.parseStringAttribute("id", new Consumer() { // from class: com.smaato.sdk.video.vast.parser.k6
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setId((String) obj);
            }
        }, new C27744b(arrayList4)).parseTags(VAST_VIEWABLE_IMPRESSION_TAGS, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.l6
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ViewableImpressionParser.lambda$parse$3(RegistryXmlParser.this, arrayList, arrayList4, arrayList2, arrayList3, (String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.m6
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ViewableImpressionParser.lambda$parse$4(arrayList4, (Exception) obj);
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList4).build();
    }
}
