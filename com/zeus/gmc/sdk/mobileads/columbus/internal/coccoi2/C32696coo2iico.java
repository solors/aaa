package com.zeus.gmc.sdk.mobileads.columbus.internal.coccoi2;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.xiaomi.adsession.CreativeType;
import com.iab.omid.library.xiaomi.adsession.ImpressionType;
import com.iab.omid.library.xiaomi.adsession.Owner;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32697c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32702cco22;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32704ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32705cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coo2iico.C32731coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coo2iico.C32732coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.OMEntity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coccoi2.coo2iico */
/* loaded from: classes8.dex */
public final class C32696coo2iico {
    private C32696coo2iico() {
    }

    @NonNull
    public static AbstractC32706coi222o222 coi222o222(Context context, WebView webView, String str, CreativeType creativeType) {
        Owner owner;
        coo2iico(context);
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner2 = Owner.NATIVE;
        if (creativeType == CreativeType.NATIVE_DISPLAY) {
            owner = Owner.NONE;
        } else {
            owner = owner2;
        }
        return AbstractC32706coi222o222.coo2iico(C32697c2oc2i.coo2iico(creativeType, impressionType, owner2, owner, false), C32705cioccoiococ.coi222o222(C32702cco22.coo2iico(C32573coo2iico.c2oc2o, C32573coo2iico.cco22), webView, null, str));
    }

    public static AbstractC32706coi222o222 coo2iico(Context context, String str, CreativeType creativeType, List<OMEntity> list) throws MalformedURLException {
        if (context == null) {
            return null;
        }
        coo2iico(context);
        ImpressionType impressionType = creativeType == CreativeType.AUDIO ? ImpressionType.AUDIBLE : ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        C32697c2oc2i coo2iico = C32697c2oc2i.coo2iico(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.NATIVE_DISPLAY) ? Owner.NONE : owner, false);
        C32702cco22 coo2iico2 = C32702cco22.coo2iico(C32573coo2iico.c2oc2o, C32573coo2iico.cco22);
        String coo2iico3 = C32695coi222o222.coo2iico();
        if (TextUtils.isEmpty(coo2iico3)) {
            return null;
        }
        return AbstractC32706coi222o222.coo2iico(coo2iico, C32705cioccoiococ.coo2iico(coo2iico2, coo2iico3, coo2iico(list), null, str));
    }

    public static AbstractC32706coi222o222 coo2iico(Context context, WebView webView, String str, CreativeType creativeType) {
        if (context == null) {
            return null;
        }
        coo2iico(context);
        AbstractC32706coi222o222 coo2iico = AbstractC32706coi222o222.coo2iico(C32697c2oc2i.coo2iico(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.JAVASCRIPT, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.DEFINED_BY_JAVASCRIPT) ? Owner.NONE : Owner.NATIVE, false), C32705cioccoiococ.coo2iico(C32702cco22.coo2iico(C32573coo2iico.c2oc2o, C32573coo2iico.cco22), webView, null, str));
        coo2iico.coo2iico(webView);
        return coo2iico;
    }

    @NonNull
    private static List<C32704ciii2coi2> coo2iico(List<OMEntity> list) throws MalformedURLException {
        ArrayList arrayList = new ArrayList();
        for (OMEntity oMEntity : list) {
            if (TextUtils.isEmpty(oMEntity.cicc2iiccc())) {
                arrayList.add(C32704ciii2coi2.coo2iico(coo2iico(oMEntity.ccoc2oic())));
            } else {
                arrayList.add(C32704ciii2coi2.coo2iico(oMEntity.cicic(), coo2iico(oMEntity.ccoc2oic()), oMEntity.cicc2iiccc()));
            }
        }
        return arrayList;
    }

    public static String coo2iico(String str, List<OMEntity> list) {
        String coo2iico = C32695coi222o222.coo2iico();
        if (TextUtils.isEmpty(coo2iico)) {
            return str;
        }
        return coo2iico(C32731coi222o222.coo2iico(coo2iico, str), (list == null || list.isEmpty()) ? null : list.get(0).ccoc2oic());
    }

    private static String coo2iico(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str.replace("[INSERT RESOURCE URL]", str2);
    }

    @NonNull
    private static URL coo2iico(String str) throws MalformedURLException {
        return new URL(str);
    }

    private static void coo2iico(Context context) {
        C32732coo2iico.coo2iico(context.getApplicationContext());
    }
}
