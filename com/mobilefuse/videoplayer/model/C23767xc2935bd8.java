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
/* renamed from: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseCreatives$1$companionAdsRequiredMode$1 */
/* loaded from: classes7.dex */
final class C23767xc2935bd8 extends Lambda implements Function1<Node, String> {
    public static final C23767xc2935bd8 INSTANCE = new C23767xc2935bd8();

    C23767xc2935bd8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull Node itRequired) {
        Intrinsics.checkNotNullParameter(itRequired, "itRequired");
        return XmlParsingExtensions.getStringNodeAttribute("required", itRequired);
    }
}
