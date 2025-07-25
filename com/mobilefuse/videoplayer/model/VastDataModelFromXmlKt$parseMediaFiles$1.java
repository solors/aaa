package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensions;
import com.smaato.sdk.video.vast.model.MediaFile;
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
final class VastDataModelFromXmlKt$parseMediaFiles$1 extends Lambda implements Function1<NodeList, List<VastMediaFile>> {
    public static final VastDataModelFromXmlKt$parseMediaFiles$1 INSTANCE = new VastDataModelFromXmlKt$parseMediaFiles$1();

    VastDataModelFromXmlKt$parseMediaFiles$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List<VastMediaFile> invoke(@NotNull NodeList itNodes) {
        Intrinsics.checkNotNullParameter(itNodes, "itNodes");
        ArrayList arrayList = new ArrayList();
        int length = itNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node node = itNodes.item(i);
            Intrinsics.checkNotNullExpressionValue(node, "node");
            String elementValue = XmlParsingExtensions.getElementValue(node);
            Integer intNodeAttribute = XmlParsingExtensions.getIntNodeAttribute("width", node);
            Integer intNodeAttribute2 = XmlParsingExtensions.getIntNodeAttribute("height", node);
            arrayList.add(new VastMediaFile(XmlParsingExtensions.getStringNodeAttribute("id", node), elementValue, elementValue, XmlParsingExtensions.getStringNodeAttribute("delivery", node), XmlParsingExtensions.getStringNodeAttribute("type", node), intNodeAttribute, intNodeAttribute2, XmlParsingExtensions.getStringNodeAttribute(MediaFile.CODEC, node), XmlParsingExtensions.getIntNodeAttribute(MediaFile.BITRATE, node), XmlParsingExtensions.getIntNodeAttribute(MediaFile.MIN_BITRATE, node), XmlParsingExtensions.getIntNodeAttribute(MediaFile.MAX_BITRATE, node), XmlParsingExtensions.getBoolNodeAttribute(MediaFile.SCALABLE, node), XmlParsingExtensions.getBoolNodeAttribute(MediaFile.MAINTAIN_ASPECT_RATIO, node), XmlParsingExtensions.getStringNodeAttribute("apiFramework", node), XmlParsingExtensions.getIntNodeAttribute(MediaFile.FILE_SIZE, node), XmlParsingExtensions.getStringNodeAttribute(MediaFile.MEDIA_TYPE, node), (intNodeAttribute == null || intNodeAttribute2 == null) ? 0.0f : intNodeAttribute.intValue() / intNodeAttribute2.intValue(), Integer.valueOf((intNodeAttribute == null || intNodeAttribute2 == null) ? 0 : intNodeAttribute.intValue() * intNodeAttribute2.intValue())));
        }
        return arrayList;
    }
}
