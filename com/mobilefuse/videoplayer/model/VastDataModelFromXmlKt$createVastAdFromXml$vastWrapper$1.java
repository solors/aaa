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
final class VastDataModelFromXmlKt$createVastAdFromXml$vastWrapper$1 extends Lambda implements Function1<Node, String> {
    public static final VastDataModelFromXmlKt$createVastAdFromXml$vastWrapper$1 INSTANCE = new VastDataModelFromXmlKt$createVastAdFromXml$vastWrapper$1();

    VastDataModelFromXmlKt$createVastAdFromXml$vastWrapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull Node it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return XmlParsingExtensions.getElementValue(it);
    }
}
