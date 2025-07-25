package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Node;

/* compiled from: VastDataModelFromXml.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastDataModelFromXmlKt$parseVastResource$1 extends Lambda implements Function1<Node, VastBaseResource> {
    public static final VastDataModelFromXmlKt$parseVastResource$1 INSTANCE = new VastDataModelFromXmlKt$parseVastResource$1();

    VastDataModelFromXmlKt$parseVastResource$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final VastBaseResource invoke(@NotNull Node it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String nodeName = it.getNodeName();
        if (nodeName != null) {
            int hashCode = nodeName.hashCode();
            if (hashCode != -375340334) {
                if (hashCode != 676623548) {
                    if (hashCode == 1928285401 && nodeName.equals("HTMLResource")) {
                        return new VastHtmlResource(XmlParsingExtensions.getElementValue(it));
                    }
                } else if (nodeName.equals("StaticResource")) {
                    return new VastStaticResource(XmlParsingExtensions.getStringNodeAttribute("creativeType", it), XmlParsingExtensions.getElementValue(it));
                }
            } else if (nodeName.equals("IFrameResource")) {
                return new VastIFrameResource(XmlParsingExtensions.getElementValue(it));
            }
        }
        return null;
    }
}
