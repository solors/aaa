package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensions;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: VastDataModelFromXml.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastDataModelFromXmlKt$addVastEvents$1 extends Lambda implements Function1<NodeList, Unit> {
    final /* synthetic */ C37607l0 $addedEventsCount;
    final /* synthetic */ EventType $eventType;
    final /* synthetic */ Set $events;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VastDataModelFromXmlKt$addVastEvents$1(EventType eventType, Set set, C37607l0 c37607l0) {
        super(1);
        this.$eventType = eventType;
        this.$events = set;
        this.$addedEventsCount = c37607l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NodeList nodeList) {
        invoke2(nodeList);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull NodeList itNodes) {
        Intrinsics.checkNotNullParameter(itNodes, "itNodes");
        int length = itNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node node = itNodes.item(i);
            EventType eventType = this.$eventType;
            Intrinsics.checkNotNullExpressionValue(node, "node");
            this.$events.add(new VastEvent(eventType, XmlParsingExtensions.getStringNodeAttribute("event", node), XmlParsingExtensions.getStringNodeAttribute("id", node), VastTime.Companion.create(XmlParsingExtensions.getStringNodeAttribute("offset", node)), XmlParsingExtensions.getElementValue(node)));
            this.$addedEventsCount.f99325b++;
        }
    }
}
