package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensions;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;

/* compiled from: VastDataModelFromXml.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastDataModelFromXmlKt$parseAdVerifications$1$resource$1 extends Lambda implements Function1<Node, VastJavaScriptResource> {
    public static final VastDataModelFromXmlKt$parseAdVerifications$1$resource$1 INSTANCE = new VastDataModelFromXmlKt$parseAdVerifications$1$resource$1();

    VastDataModelFromXmlKt$parseAdVerifications$1$resource$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final VastJavaScriptResource invoke(@NotNull Node it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String elementValue = XmlParsingExtensions.getElementValue(it);
        String stringNodeAttribute = XmlParsingExtensions.getStringNodeAttribute("apiFramework", it);
        VerificationApiFramework verificationApiFramework = null;
        if (stringNodeAttribute != null) {
            VerificationApiFramework[] values = VerificationApiFramework.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                VerificationApiFramework verificationApiFramework2 = values[i];
                if (Intrinsics.m17075f(verificationApiFramework2.getStringValue(), stringNodeAttribute)) {
                    verificationApiFramework = verificationApiFramework2;
                    break;
                }
                i++;
            }
        }
        Boolean boolNodeAttribute = XmlParsingExtensions.getBoolNodeAttribute(JavaScriptResource.BROWSER_OPTIONAL, it);
        return new VastJavaScriptResource(elementValue, verificationApiFramework, boolNodeAttribute != null ? boolNodeAttribute.booleanValue() : false);
    }
}
