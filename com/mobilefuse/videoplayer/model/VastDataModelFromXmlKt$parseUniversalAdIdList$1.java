package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensions;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: VastDataModelFromXml.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastDataModelFromXmlKt$parseUniversalAdIdList$1 extends Lambda implements Function1<NodeList, List<VastUniversalAdId>> {
    public static final VastDataModelFromXmlKt$parseUniversalAdIdList$1 INSTANCE = new VastDataModelFromXmlKt$parseUniversalAdIdList$1();

    VastDataModelFromXmlKt$parseUniversalAdIdList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List<VastUniversalAdId> invoke(@NotNull NodeList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        int length = it.getLength();
        for (int i = 0; i < length; i++) {
            Node item = it.item(i);
            Intrinsics.checkNotNullExpressionValue(item, "it.item(i)");
            String elementValue = XmlParsingExtensions.getElementValue(item);
            Node item2 = it.item(i);
            Intrinsics.checkNotNullExpressionValue(item2, "it.item(i)");
            arrayList.add(new VastUniversalAdId(elementValue, XmlParsingExtensions.getStringNodeAttribute(UniversalAdId.ID_REGISTRY, item2)));
        }
        return arrayList;
    }
}
